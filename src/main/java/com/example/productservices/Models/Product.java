package com.example.productservices.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    int id;
    String name;
    String description;
    String image;
    double price;
    Category category;
}
