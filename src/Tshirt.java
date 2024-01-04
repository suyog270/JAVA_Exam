import java.util.Arrays;
public class Tshirt {
    // Fields to represent the name, product code, price, brand, description, and array of available sizes of t-shirts.
    String name;
    int product_code;
    int price;
    String brand;
    String description;
    String[] available_size;

    // Constructor to initialize the field
    public Tshirt(String name, int product_code, int price, String brand, String description, String[] available_size) {
        this.name = name;
        this.product_code = product_code;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.available_size = available_size;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProduct_code() {
        return product_code;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getAvailable_size() {
        return available_size;
    }

    public void setAvailable_size(String[] available_size) {
        this.available_size = available_size;
    }
    // Printing the details of T-shirt
    public void Details() {
        System.out.println("Item name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Product code: " + product_code);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Sizes: " + Arrays.toString(available_size));
    }
}
