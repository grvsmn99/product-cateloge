package com.gaurav.productcatalog.filters;

import com.gaurav.productcatalog.entitiy.Product;
import com.gaurav.productcatalog.entitiy.ProductCategory;
import org.springframework.data.jpa.domain.Specification;

public class ProductCategoryFilterStrategy implements ProductFilterStartegy{

    private final String category;

    public ProductCategoryFilterStrategy(String category) {
        this.category = category;
    }

    @Override
    public Specification<Product> getSpecification() {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("product_category").get("name"), category);
    }
}
