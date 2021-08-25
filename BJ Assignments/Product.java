/**
 * A class that represents a product
 */
public class Product {


    private String name;
    private double price;

    /**
     * Constructs a product with the given name and price
     * @param name The name of the product
     * @param price The price of the product
     */
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }


    /**
     * Returns the name of the product
     * @return The product's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the price of the product
     * @return The product's price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Reduces the price by the given amount
     * @param amount The amount to reduce by
     */
    public void reducePrice(double amount){
        price -= amount;
    }
}
