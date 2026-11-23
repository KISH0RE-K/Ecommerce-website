package com.example.Backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    @NotBlank(message = "name field is required")
    private String name;
    @Column(nullable = false)
    @NotNull(message = "Price is required")
    @PositiveOrZero(message = "Price should be zero or Positive")
    private Double price;
    @NotBlank(message = "Description field is required")
    private String description;
    private Double ratings;
    @Column(nullable = false)
    @NotBlank(message = "Seller field is required")
    private String seller;
    @NotNull(message = "Stock Field is required")
    private Integer stock;
    private Integer numOfReviews;

    public Product(String description, Long id, String name, Integer numOfReviews, Double price, Double ratings, String seller, Integer stock) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.numOfReviews = numOfReviews;
        this.price = price;
        this.ratings = ratings;
        this.seller = seller;
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumOfReviews() {
        return numOfReviews;
    }

    public void setNumOfReviews(Integer numOfReviews) {
        this.numOfReviews = numOfReviews;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRatings() {
        return ratings;
    }

    public void setRatings(Double ratings) {
        this.ratings = ratings;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
