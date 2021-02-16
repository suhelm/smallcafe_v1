package com.cafe.smallcafe.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class CafeMenu {

    @Id
    private String id;
    @JsonProperty("item_name")
    private String itemName;

    public CafeMenu() {
    }


    public CafeMenu(String itemName, int price, String category) {
        this(UUID.randomUUID().toString(), itemName, price, category);
    }

    public CafeMenu(String id, String itemName, int price, String category) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.category = category;
    }



    public String getId() {
        return id;
    }


    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
    @JsonProperty("price")
    private int price;
    @JsonProperty("category")
    private String category;


}
