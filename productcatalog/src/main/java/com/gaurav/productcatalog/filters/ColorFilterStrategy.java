package com.gaurav.productcatalog.filters;

import com.gaurav.productcatalog.entitiy.Product;
import org.springframework.data.jpa.domain.Specification;

public class ColorFilterStrategy implements ProductFilterStartegy{

    private final String color;

    public ColorFilterStrategy(String color) {
        this.color = color;
    }


    @Override
    public Specification<Product> getSpecification() {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("color").get("name"), color);
    }
}
