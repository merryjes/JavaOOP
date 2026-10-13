public class Main{

    public static double calculateTotal(double price, double taxRate){
        return price + (price * taxRate);
    }

    public static void main(String[] args) {
       double total = calculateTotal(50.0, 0.10);
     System.out.println("Total Price: $" + total);
    }
    }
    
