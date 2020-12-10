package discounts;

import com.hz.Customer;
import com.hz.DiscountCalculator;
import com.hz.ShoppingCart;
import products.Product;

public class BlackFridayDiscount implements Discount {
    @Override
    public double calculateDiscount(Customer customer, Product product, Integer index) {
        double discount = 0.01 * customer.getCart().size();



        if (discount > 0.8) {
            discount = 0.8;

        }
        return 1 -discount;
    }
}