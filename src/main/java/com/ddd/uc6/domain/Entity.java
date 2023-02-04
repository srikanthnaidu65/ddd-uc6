package com.ddd.uc6.domain;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public interface Entity<T> {
    boolean hasSameIdentityAs(T other);
}
