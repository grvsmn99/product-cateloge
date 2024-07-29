package com.gaurav.productcatalog.entitiy;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "productcatalog_product")
@Data
@Cacheable
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double price;
    private String name;
    private int quantity;
    private String size;

    @ManyToOne
    private Brand brand;

    @ManyToOne
    private Color color;

    @ManyToOne
    private ProductCategory productCategory;
}
