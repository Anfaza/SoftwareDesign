package discounts;

import com.hz.Customer;
import products.Product;

public interface Discount {

   public double calculateDiscount(Customer customer, Product product, Integer index);

}

