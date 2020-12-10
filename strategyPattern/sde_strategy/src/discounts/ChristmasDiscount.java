package discounts;

import com.hz.Customer;
import products.Product;

public class ChristmasDiscount implements Discount {
    @Override
    public double calculateDiscount(Customer customer, Product product, Integer index) {

        double discount = 0.0;

        boolean isFirstProduct = index == 0;

        // on Christmas Eve, 1st product 20%, the next 12.5% discount


            if(isFirstProduct) {
                discount = .20;
            } else {
                discount = .125;
            }



        // Default situation: new customers full price, regular 15% off


        return 1 - discount;
    }
}



