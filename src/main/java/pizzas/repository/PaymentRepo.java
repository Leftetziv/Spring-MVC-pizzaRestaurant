/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import pizzas.entity.Payment;
import pizzas.entity.Size1;

/**
 *
 * @author Leyteris
 */
@Repository
public class PaymentRepo extends HibernateUtil<Payment> {

    public List<Payment> getAllPayments() {
        return super.findAll("Payment.findAll");
    }

    public Payment getById(int id) {
        return super.find(Payment.class, id);
    }

}
