package com.gaurav.productcatalog.service;


import com.gaurav.productcatalog.entitiy.Brand;
import com.gaurav.productcatalog.entitiy.Product;
import com.gaurav.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface ProductService {

    List<Product> getAllProducts();
    List<Product> getFilteredProducts(Map<String, String> filters);
}
