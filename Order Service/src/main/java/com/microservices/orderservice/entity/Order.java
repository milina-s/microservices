package com.microservices.orderservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

@JsonSerialize
public class Order {

    @JsonTypeId
    private Long id;

    @JsonProperty
    private Long clientId;

    @JsonProperty
    private List<Long> itemId;

    public Order() {

    }

    public Order(Long id, Long clientId, List<Long> itemId) {
        this.id = id;
        this.clientId = clientId;
        this.itemId = itemId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public List<Long> getItemId() {
        return itemId;
    }

    public void setItemId(List<Long> itemId) {
        this.itemId = itemId;
    }
}