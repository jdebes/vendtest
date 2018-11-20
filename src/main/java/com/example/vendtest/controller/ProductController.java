package com.example.vendtest.controller;

import com.example.vendtest.dto.HelloDto;
import com.example.vendtest.dto.ProductDto;
import com.example.vendtest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public @ResponseBody List<ProductDto> getProducts() {
        List<ProductDto> products = new ArrayList<>(productService.getProducts().values());
        return products;
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public @ResponseBody ProductDto postProduct(@RequestBody ProductDto productDto) {
        productService.addProduct(productDto);
        return productDto;
    }

}
