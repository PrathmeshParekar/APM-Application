package com.Agriculture.AgroProductApp.Service;

import com.Agriculture.AgroProductApp.Entity.AgroProduct;
import com.Agriculture.AgroProductApp.Repository.AgroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgroService {

    @Autowired
    private AgroRepository agroRepository;

    public List<AgroProduct> getAllProduct(){
        return agroRepository.findAll();
    }

    public void save(AgroProduct ap){
         agroRepository.save(ap);
    }

    public AgroProduct getProductById(Long id){
        return agroRepository.findById(id).get();
    }

    public void deleteById(Long id){
        agroRepository.deleteById(id);
    }

}
