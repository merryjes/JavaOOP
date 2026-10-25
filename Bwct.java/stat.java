
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== FDS NIGHT STUDY ===");
            System.out.println("1. Add a note");
            System.out.println("2. View all notes");
            System.out.println("3. Review database concepts");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            System.out.println("You selected: " + choice);

            switch (choice) {
                case 1:
                    System.out.println("Add a note feature coming soon!");
                    break;

                case 2:
                    System.out.println("View notes feature coming soon!");
                    break;

                case 3:
                    System.out.println("Database review feature coming soon!");
                    break;

                case 4:
                    System.out.println("Good night, database bestie!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }

        } while (choice != 4);

        sc.close();
    }
}
