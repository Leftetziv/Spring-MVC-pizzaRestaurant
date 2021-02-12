/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas.config;

import java.sql.Date;
import java.time.LocalDate;
import org.springframework.core.convert.converter.Converter;
import pizzas.entity.Ingredient;


/**
 *
 * @author Leyteris
 */
public class StringToLocalDateConverter implements Converter<String, java.time.LocalDate> {

    @Override
    public java.time.LocalDate convert(String from) {
        if (from.isEmpty()) {
            return null;
        }
        java.time.LocalDate date = LocalDate.parse(from);
        return date;
    }
}

