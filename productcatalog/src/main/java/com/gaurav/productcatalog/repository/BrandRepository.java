package com.gaurav.productcatalog.repository;

import com.gaurav.productcatalog.entitiy.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository  extends JpaRepository<Brand, Integer> {
}
