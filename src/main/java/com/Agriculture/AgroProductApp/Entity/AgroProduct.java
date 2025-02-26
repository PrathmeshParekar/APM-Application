package com.Agriculture.AgroProductApp.Entity;

import jakarta.persistence.*;

@Entity
public class AgroProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String seedBrand;
    private String seedType;
    private String quantity;
    private String freshness;
    private String price;

    public AgroProduct() {
        super();
    }

    public AgroProduct(Long id, String productName, String seedBrand, String seedType, String quantity, String freshness, String price) {
        this.id = id;
        this.productName = productName;
        this.seedBrand = seedBrand;
        this.seedType = seedType;
        this.quantity = quantity;
        this.freshness = freshness;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSeedBrand() {
        return seedBrand;
    }

    public void setSeedBrand(String seedBrand) {
        this.seedBrand = seedBrand;
    }

    public String getSeedType() {
        return seedType;
    }

    public void setSeedType(String seedType) {
        this.seedType = seedType;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getFreshness() {
        return freshness;
    }

    public void setFreshness(String freshness) {
        this.freshness = freshness;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
