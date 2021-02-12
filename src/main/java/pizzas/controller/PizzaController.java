/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas.controller;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pizzas.entity.*;
import pizzas.service.*;

/**
 *
 * @author Leyteris
 */
@Controller
@RequestMapping("/")
public class PizzaController {

    @Autowired
    SizeService sizeService;

    @Autowired
    PaymentService paymentService;

    @Autowired
    IngredientService ingredientService;

    @GetMapping("/")
    public String showHome() {
        return "home";
    }

    @GetMapping("/create")
    public String createForm(@ModelAttribute("order") Orders order, Model model) {

        List<Size1> sizes = sizeService.getAllSizes();
        List<Payment> payments = paymentService.getAllPayments();
        List<Ingredient> ingredients = ingredientService.getAllIngredients();

        model.addAttribute("sizes", sizes);
        model.addAttribute("payments", payments);
        model.addAttribute("ingredients", ingredients);

        return "orderPizza";
    }

    @PostMapping("/create")
    public String ShowPizza(@ModelAttribute("order") Orders order, Model model) {

//        System.out.println(order);
//        System.out.println(order.getOrderDate());
//        System.out.println(order.getCustomerId().getId());
//        System.out.println(order.getCustomerId().getCname());
//        System.out.println(order.getCustomerId().getCage());
//        System.out.println(order.getPaymentId().getId());
//        System.out.println(order.getPaymentId().getPname());
//        System.out.println(order.getPizzaId().getSizeId().getId());
//        System.out.println(order.getPizzaId().getSizeId().getSname());
//        System.out.println(order.getPizzaId().getIngredientList());


        Size1 size = sizeService.getById(order.getPizzaId().getSizeId().getId()); //if user doesnt select size then nullpointer

        Payment payment = paymentService.getById(order.getPaymentId().getId());

        List<String> ingredientsIname = new ArrayList();
        List<Ingredient> ingredients = order.getPizzaId().getIngredientList();
        if (ingredients != null) {
            for (Ingredient ingredient : order.getPizzaId().getIngredientList()) {
                ingredientsIname.add(ingredientService.getById(ingredient.getId()).getIname());
            }
        }

        model.addAttribute("size", size);
        model.addAttribute("payment", payment);
        model.addAttribute("ingredients", ingredientsIname);

        return "pizzaResult";
    }

//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.registerCustomEditor(Ingredient.class, new IngredientPropertyEditor(ingredientService));
//    }
}

//<c:forEach items="${ingredients}" var="ingredient">
//                    <input type="checkbox" name="pizzaId.ingredientList" >${ingredient.iname}<br/>                         
//                </c:forEach>

//<form:checkboxes path="pizzaId.ingredientList" 
//                                 items="${ingredients}" 
//                                 itemLabel="iname"
//                                 itemValue="id"/>
