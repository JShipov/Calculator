package academy.learnprogramming;

public class Substraction extends Calculator {
    private double result;

    public Substraction(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
        result = firstNumber - secondNumber;
        System.out.println("\nSubstraction result is " + result);
    }
}
