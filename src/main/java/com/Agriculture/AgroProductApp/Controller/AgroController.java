package com.Agriculture.AgroProductApp.Controller;

import com.Agriculture.AgroProductApp.Entity.AgroProduct;
import com.Agriculture.AgroProductApp.Service.AgroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AgroController {

    @Autowired
    private AgroService agroService;

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    // agriculture product
    @GetMapping("/ap_register")
    public String apRegister(){
        return "apregister";
    }


    @GetMapping("/ap_list")
    public ModelAndView getAllProduct(){
        List<AgroProduct> list = agroService.getAllProduct();
        return new ModelAndView("apList" , "agro_product", list);
    }

    @PostMapping("/save")
    public String addProduct(@ModelAttribute AgroProduct ap){
        agroService.save(ap);
        return "redirect:/ap_list";
    }

    @RequestMapping("/editProduct/{id}")
    public String editProduct(@PathVariable("id") Long id, Model model){
        AgroProduct ap = agroService.getProductById(id);
        model.addAttribute("agro_product",ap);
        return "editproduct";
    }

    @RequestMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable("id") Long id){
        agroService.deleteById(id);
        return "redirect:/ap_list";
    }

}
