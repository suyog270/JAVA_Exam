import java.util.Arrays;

public class Order {
    String name;
    String phoneNumber;
    String item;
    int[] price;

    // Creating constructor


    public Order(String name, String phoneNumber, String item, int[] price) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.item = item;
        this.price = price;
    }

    // Generating Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getItems() {
        return item;
    }

    public void setItems(String items) {
        this.item = item;
    }

    public int[] getPrices() {
        return price;
    }

    public void setPrices(int[] prices) {
        this.price = price;
    }

    // Printing Bill
    public void Bill() {
        double totalPrice = 0;

        // Calculating Total amount
        for (int price : price) {
            totalPrice += price;
        }

        // Calculating VAT amount
        double vat = totalPrice * 0.13;

        System.out.println("Order details:");
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Items: " + item);
        System.out.println("Price: " + Arrays.toString(price));
        System.out.println("Total Price: " + totalPrice);

        // Printing vat amount
        System.out.println("VAT (13%): " + vat);

        // Calculating total price with vat
        System.out.println("Total price with VAT: " + (totalPrice + vat));
    }
}


