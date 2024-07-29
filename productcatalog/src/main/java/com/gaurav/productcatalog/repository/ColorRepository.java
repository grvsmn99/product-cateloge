package com.gaurav.productcatalog.repository;

import com.gaurav.productcatalog.entitiy.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends JpaRepository<Color, Integer> {
}
