package com.example.shopbackend.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Game extends BaseEntity {
    @OneToMany(mappedBy = "game", targetEntity = ReviewEntity.class, cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private List<ReviewEntity> reviews;
    @OneToMany(mappedBy = "game", cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private List<Market> marketEntities;
    @OneToMany(mappedBy = "game", targetEntity = Item.class, cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private List<Item> itemEntities;
    private String name;
    private String description;
    private Double price;
    private String genre;

    protected Game() {
    }

    public Game(List<ReviewEntity> reviews, List<Market> marketEntities, List<Item> itemEntities, String name, String description, Double price, String genre) {
        this.reviews = reviews;
        this.marketEntities = marketEntities;
        this.itemEntities = itemEntities;
        this.name = name;
        this.description = description;
        this.price = price;
        this.genre = genre;
    }

    public List<ReviewEntity> getReviews() {
        return reviews;
    }

    public void ListReviews(List<ReviewEntity> reviews) {
        this.reviews = reviews;
    }

    public List<Market> getMarketEntities() {
        return marketEntities;
    }

    public void ListMarketEntities(List<Market> marketEntities) {
        this.marketEntities = marketEntities;
    }

    public List<Item> getItemEntities() {
        return itemEntities;
    }

    public void ListItemEntities(List<Item> itemEntities) {
        this.itemEntities = itemEntities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
