package academy.learnprogramming;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number:");

        while (!scanner.hasNextDouble()) {
            System.out.println("It`s not a number.");
            scanner.nextLine();
        }
        System.out.print("Second number: ");
        double firstNumber = scanner.nextDouble();


        while (!scanner.hasNextDouble()) {
            System.out.println("It`s not a number.");
            scanner.nextLine();
        }
        double secondNumber = scanner.nextDouble();

        new Calculator(firstNumber, secondNumber);
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
