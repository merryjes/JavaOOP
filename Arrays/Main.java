import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Study Drinks---");
        System.out.println("---SOLO RAKO SIR---");

        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("Iced Matcha Latte");
        drinks.add("Americano");
        drinks.add("Cold Brew");
        drinks.add("Milk Tea");

        System.out.println("Total drinks: " + drinks.size());

        System.out.println("First choice: " + drinks.get(0));
        System.out.println("Second choice: " + drinks.get(1));

        System.out.println("\n--- Full List ---");
        for (String drink : drinks) {
            System.out.println(drink);
        }

       
    }
}