package com.hz;

import discounts.Discount;
import products.Product;

public class DiscountCalculator {

    private Customer customer;
    private Discount discount;


    public DiscountCalculator(Customer customer) {
        this.customer = customer;
    }

    public double getDiscount(Product product, int index) {
        return this.discount.calculateDiscount(this.customer,product, index);

    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
