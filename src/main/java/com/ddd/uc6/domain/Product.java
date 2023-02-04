package com.ddd.uc6.domain;

import java.util.Objects;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
