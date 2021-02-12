/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pizzas.entity.Ingredient;
import pizzas.entity.Payment;
import pizzas.repository.IngredientRepo;

/**
 *
 * @author Leyteris
 */
@Transactional
@Service
public class IngredientService {
    
    @Autowired
    IngredientRepo ingredientRepo;
    
    public List<Ingredient> getAllIngredients() {
        return ingredientRepo.getAllIngredients();
    }
    
    public Ingredient getById(int id) {
        return ingredientRepo.getById(id);
    }
}
