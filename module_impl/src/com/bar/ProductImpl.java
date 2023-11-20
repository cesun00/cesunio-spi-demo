package com.bar;

import com.foo.IProduct;

/**
 * ProduictImpl
 */
public class ProductImpl implements IProduct {
    @Override
    public void work() {
        System.out.println("Hello SPI!");
    }
}