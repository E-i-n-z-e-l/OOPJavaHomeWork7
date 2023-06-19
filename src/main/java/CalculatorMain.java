

public class CalculatorMain {

    public static void main(String[] args) {

        ComplexNumberInterface num1 = new ComplexNumber(4, 3);
        ComplexNumberInterface num2 = new ComplexNumber(-1, 2);

        ComplexCalculatorInterface calculator = new LogCalculator(new ComplexCalculator(), new Log());


        ComplexNumberInterface sum = calculator.add(num1, num2);
        System.out.println("Сумма : " + sum);

        ComplexNumberInterface product = calculator.multiply(num1, num2);
        System.out.println("Умножение : " + product);

        ComplexNumberInterface quotient = calculator.divide(num1, num2);
        System.out.println("Деление : " + quotient);
    }
}
