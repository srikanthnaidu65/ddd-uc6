package com.ddd.uc6.domain.events;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class ItemRemovedFromCartEvent implements DomainEvent {
    private String productName;

    public ItemRemovedFromCartEvent(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}
