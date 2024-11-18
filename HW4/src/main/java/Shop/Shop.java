package main.java.Shop;

import main.java.Exceptions.AmountException;
import main.java.Exceptions.CustomerException;
import main.java.Exceptions.ProductException;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Shop {
    public static List<Customer> customers = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();
    public static List<Order> orders = new ArrayList<>();


    @SuppressWarnings("CallToPrintStackTrace")
    public static Order getProduct(Customer customer, Product product, int quantity) {
        try {
            if (!customers.contains(customer)) {
                throw new CustomerException();
            }
            if (!products.contains(product)) {
                throw new ProductException();
            }
            if ((quantity <= 0) || (quantity > products.size())) {
                throw new AmountException();
            }
            return new Order (customer, product, quantity);
        } catch (CustomerException e) {
            e.printStackTrace();
        } catch (ProductException e) {
            System.err.println("Товара не существует");
        } catch (AmountException e) {
            System.out.println("Количество задано некорректно");
        }
        return null;
    }
}