/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas.repository;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import pizzas.entity.Size1;

/**
 *
 * @author Leyteris
 */
@Repository
public class SizeRepo extends HibernateUtil<Size1>{

    public List<Size1> getAllSizes() {
        return super.findAll("Size1.findAll");
    }
    
    public Size1 getById(int id) {
        return super.find(Size1.class, id);
    }
       

}
