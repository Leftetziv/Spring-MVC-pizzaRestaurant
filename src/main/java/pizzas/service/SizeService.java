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
import pizzas.entity.Size1;
import pizzas.repository.SizeRepo;

/**
 *
 * @author Leyteris
 */
@Transactional
@Service
public class SizeService {
    
    @Autowired
    SizeRepo sizeRepo;
    
    public List<Size1> getAllSizes() {
        return sizeRepo.getAllSizes();
    }
    
    public Size1 getById(int id) {
        return sizeRepo.getById(id);
    }
    
    
    
}
