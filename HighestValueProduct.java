
/*Write a java program to read product details from customer like (product name, quantity,
and cost of the product), now display the product which is having highest value.
*/
import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    int quantity;
    double cost;

    Product(String name, int quantity, double cost) {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }

    double totalValue() {
        return quantity * cost;
    }
}

public class HighestValueProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        String continueInput;

        do {
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            System.out.print("Enter cost per product: ");
            double cost = scanner.nextDouble();
            scanner.nextLine(); 

            products.add(new Product(name, quantity, cost));

            System.out.print("Do you want to enter another product? (yes/no): ");
            continueInput = scanner.nextLine();
        } while (continueInput.equalsIgnoreCase("yes"));

        Product highestValueProduct = null;
        for (Product product : products) {
            if (highestValueProduct == null || product.totalValue() > highestValueProduct.totalValue()) {
                highestValueProduct = product;
            }
        }

        if (highestValueProduct != null) {
            System.out.println("Product with the highest total value:");
            System.out.println("Name: " + highestValueProduct.name);
            System.out.println("Quantity: " + highestValueProduct.quantity);
            System.out.println("Cost per unit: " + highestValueProduct.cost);
            System.out.println("Total Value: " + highestValueProduct.totalValue());
        } else {
            System.out.println("No products entered.");
        }

        scanner.close();
    }
}

