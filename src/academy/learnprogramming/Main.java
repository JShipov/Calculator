package academy.learnprogramming;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //get the console input for first number
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number:");

        //checking input for character other than numbers
        //loop won`t end until get a number
        while (!scanner.hasNextDouble()) {
            System.out.println("It`s not a number.");
            scanner.nextLine();
        }
        
        double firstNumber = scanner.nextDouble();
        
        //get the console input for second
        System.out.print("Second number: ");

        //checking input for character other than numbers
        //loop won`t end until get a number
        while (!scanner.hasNextDouble()) {
            System.out.println("It`s not a number.");
            scanner.nextLine();
        }
        double secondNumber = scanner.nextDouble();
           
        new Calculator(firstNumber, secondNumber);
        
        //choose operatiom among simple calculations
        //call the method for the choosen action
        System.out.println("Please, select (*,/,+,-)");
        String message = "Selected: ";
        boolean repeat;
        do {
            String Operation = scanner.next();
            repeat = false;
            switch (Operation) {
                case "*":
                    new Multiplication(firstNumber, secondNumber);
                    break;
                case "/":
                    new Division(firstNumber, secondNumber);
                    break;
                case "+":
                    new Addition(firstNumber, secondNumber);
                    break;
                case "-":
                    new Substraction(firstNumber, secondNumber);
                    break;
                default:
                    System.out.println("\n Please select a valid character");
                    repeat = true;
                    break;
            }
        } while(repeat);
        scanner.close();
    }
}
