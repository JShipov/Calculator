package academy.learnprogramming;

public class Addition extends Calculator {
    private double result;

    public Addition(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
        result = Math.round (firstNumber + secondNumber);
        System.out.println("\nAddition result is " + result);
    }
}
