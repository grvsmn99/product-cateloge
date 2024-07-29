package com.gaurav.productcatalog.filters;

import com.gaurav.productcatalog.entitiy.Product;
import org.springframework.data.jpa.domain.Specification;

public interface ProductFilterStartegy {

    Specification<Product> getSpecification();
}
