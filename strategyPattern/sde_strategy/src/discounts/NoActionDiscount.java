package discounts;

import com.hz.Customer;
import products.Product;

public class NoActionDiscount implements Discount {
    @Override
    public double calculateDiscount(Customer customer, Product product, Integer index) {
        double discount = 0.0;
        if(customer.isRegular()) {
            discount = .15;
        }

        return 1 - discount;
    }


}
