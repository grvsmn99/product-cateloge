package com.gaurav.productcatalog.service.impl;

import com.gaurav.productcatalog.entitiy.Product;
import com.gaurav.productcatalog.filters.ProductFilterStartegy;
import com.gaurav.productcatalog.repository.ProductRepository;
import com.gaurav.productcatalog.service.ProductService;
import com.gaurav.productcatalog.util.FilterFactory;
import jakarta.annotation.PostConstruct;
import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
@CacheConfig(cacheNames = "products")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    @Cacheable(key="#id")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getFilteredProducts(Map<String, String> filters) {

        List<ProductFilterStartegy> strategies = FilterFactory.createFilterStrategy(filters);

        Specification spec = Specification.where(null);

        for(ProductFilterStartegy strategy : strategies){
            spec = spec.and(strategy.getSpecification());
        }

        return productRepository.findAll(spec);

    }
}
