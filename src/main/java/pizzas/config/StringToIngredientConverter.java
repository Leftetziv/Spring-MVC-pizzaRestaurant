/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas.config;

import org.springframework.core.convert.converter.Converter;
import pizzas.entity.Ingredient;

/**
 *
 * @author Leyteris
 */
public class StringToIngredientConverter implements Converter<String, Ingredient> {

    @Override
    public Ingredient convert(String from) {
        System.out.println("StringToIngredientConverter: from" + from);
        return new Ingredient(Integer.parseInt(from));
    }
}
