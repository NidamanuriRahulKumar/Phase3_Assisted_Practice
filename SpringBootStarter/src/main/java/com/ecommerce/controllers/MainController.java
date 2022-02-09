package com.ecommerce.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecommerce.entity.EProduct;
import com.ecommerce.exceptions.ProductNotFoundException;

@Controller
public class MainController {

        
         
         @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
          @ResponseBody
           public String getProduct(@PathVariable("id") String id) {
                 
                        if (id.contentEquals("0"))
                                throw new ProductNotFoundException();
              return "Product was found";
           }
}
