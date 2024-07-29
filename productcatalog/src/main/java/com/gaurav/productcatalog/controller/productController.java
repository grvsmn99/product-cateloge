package com.gaurav.productcatalog.controller;

import com.gaurav.productcatalog.entitiy.Product;
import com.gaurav.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class productController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public ResponseEntity<List<Product>> getProducts(
            @RequestParam Map<String, String> productFilters){
        List<Product> allProducts= productService.getFilteredProducts(productFilters);
        return ResponseEntity.ok(allProducts);
    }
}
