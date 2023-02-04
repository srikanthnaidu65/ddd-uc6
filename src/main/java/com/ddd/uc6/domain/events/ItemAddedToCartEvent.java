package com.ddd.uc6.domain.events;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class ItemAddedToCartEvent implements DomainEvent {
    private String productName;
    private int quantity;

    public ItemAddedToCartEvent(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
