
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 1000.00;
        int choice;

        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.printfln(""
                     break;
                case 3:
                    System.out.println("T")   "Current balance: %.2f%n", balance
                    );
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double amount = sc.nextDouble();

                    if (amount > 0) {
                        balance = balance + amount;

                        System.out.printf(
                            "New balance: %.2f%n", balance
                        );
                    } else {
                        System.out.println(
                            "Invalid deposit amount!"
                        );
                    }
                    break;

                case 3:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
