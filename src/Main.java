import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        String[] size1 = {"S", "M", "L"};
        String[] size2 = {"S", "L"};

        Tshirt item1 = new Tshirt("Gorkhali Batman", 572, 1235," Karuna ","You either die a hero or live long enough to see yourself be a villain", size1);
        Tshirt item2 = new Tshirt("Nepal",681, 3342, "Lukla", "I love Nepal",  size2 );

        // T-shirt Description
        item1.Details();
        System.out.println("");
        item2.Details();
        System.out.println("");
        Order order1 = new Order(" Gopal Sharma", "0486756465","Nepal", new int[]{3342, 234});



        // Print the bill with VAT
        order1.Bill();

    }
}


