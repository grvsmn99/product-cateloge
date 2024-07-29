package com.gaurav.productcatalog.filters;

import com.gaurav.productcatalog.entitiy.Product;
import org.springframework.data.jpa.domain.Specification;

public class BrandFilterStrategy implements ProductFilterStartegy{

    private final String brand;

    public BrandFilterStrategy(String brand) {
        this.brand = brand;
    }

    @Override
    public Specification<Product> getSpecification() {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("brand").get("name"), brand);
    }
}
