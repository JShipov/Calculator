package academy.learnprogramming;

public class Multiplication extends Calculator {

    private double result;

    public Multiplication(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
        result = Math.round(firstNumber * secondNumber);
        System.out.println("\nMultiplication result is " + result);
    }
}
