package com.gaurav.productcatalog.entitiy;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "productcatalog_color")
public class Color {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
}
