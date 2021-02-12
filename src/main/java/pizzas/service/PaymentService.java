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
import pizzas.entity.Payment;
import pizzas.entity.Size1;
import pizzas.repository.PaymentRepo;

/**
 *
 * @author Leyteris
 */
@Transactional
@Service
public class PaymentService {
       
    @Autowired
    PaymentRepo paymentRepo;
    
    public List<Payment> getAllPayments() {
        return paymentRepo.getAllPayments();
    }
    
    public Payment getById(int id) {
        return paymentRepo.getById(id);
    }
    
}
