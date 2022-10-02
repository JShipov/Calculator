package academy.learnprogramming;

//parent class with checking numbers in the range between minimum and maximum values

public class Calculator {
    private double maxValue = Double.MAX_VALUE;
    private double minValue = Double.MIN_VALUE;
    private double firstNumber;
    private double secondNumber;

    public Calculator(double firstNumber, double secondNumber) {
        //constructor with ternary operator 
        this.firstNumber = (firstNumber < maxValue && firstNumber > minValue) ? firstNumber : -1;
        this.secondNumber = (secondNumber < maxValue && secondNumber > minValue) ? secondNumber : -1;
    }
}
