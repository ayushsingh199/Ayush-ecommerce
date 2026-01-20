package com.example.ecommerce.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "products")
public class Product {

    @Id
    private ObjectId id;

    private String name;
    private String description;
    private double price;
    private int stock;
}