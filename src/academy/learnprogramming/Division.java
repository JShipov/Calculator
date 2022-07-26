package academy.learnprogramming;

public class Division extends Calculator {

    private double result;

    public Division(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
        if (secondNumber == 0) {
            System.out.println("Sorry, we won`t divide by zero");
        } else {
            result = Math.round(firstNumber / secondNumber);
            System.out.println("\nDivision result is " + result);
        }
    }
}