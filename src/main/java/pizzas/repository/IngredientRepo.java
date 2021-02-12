/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import pizzas.entity.Ingredient;
import pizzas.entity.Payment;

/**
 *
 * @author Leyteris
 */
@Repository
public class IngredientRepo extends HibernateUtil<Ingredient> {

    public List<Ingredient> getAllIngredients() {
        return super.findAll("Ingredient.findAll");
    }
    
    public Ingredient getById(int id) {
        return super.find(Ingredient.class, id);
    }
}
