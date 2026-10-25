import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

       int number;

       for(int i = 1; i  <= 5; i++){

        System.out.println("Enter number 1: ");
        number = sc.nextInt();

        if(number > 0){
            System.out.println("Positive");
        }
        else if(number<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }

        System.out.println("Enter number 2: ");
        number = sc.nextInt();
         if(number > 0){
            System.out.println("Positive");
        }
        else if(number<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }

        System.out.println("Enter number 3: ");
        number = sc.nextInt();
         if(number > 0){
            System.out.println("Positive");
        }
        else if(number<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }

        System.out.println("Enter number 4: ");
        number = sc.nextInt();
         if(number > 0){
            System.out.println("Positive");
        }
        else if(number<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }

         System.out.println("Enter number 5: ");
        number = sc.nextInt();
         if(number > 0){
            System.out.println("Positive");
        }
        else if(number<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
        

       }

    }
}