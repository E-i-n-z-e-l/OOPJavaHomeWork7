public class ComplexCalculator implements ComplexCalculatorInterface{
    public ComplexNumberInterface add(ComplexNumberInterface num1, ComplexNumberInterface num2) {
        double realPart = num1.getRealPart() + num2.getRealPart();
        double imaginaryPart = num1.getImaginaryPart() + num2.getImaginaryPart();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumberInterface multiply(ComplexNumberInterface num1, ComplexNumberInterface num2) {
        double realPart = (num1.getRealPart() * num2.getRealPart()) - (num1.getImaginaryPart() * num2.getImaginaryPart());
        double imaginaryPart = (num1.getRealPart() * num2.getImaginaryPart()) + (num1.getImaginaryPart() * num2.getRealPart());
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumberInterface divide(ComplexNumberInterface num1, ComplexNumberInterface num2) {
        double denominator = (num2.getRealPart() * num2.getRealPart()) + (num2.getImaginaryPart() * num2.getImaginaryPart());
        double realPart = ((num1.getRealPart() * num2.getRealPart()) + (num1.getImaginaryPart() * num2.getImaginaryPart())) / denominator;
        double imaginaryPart = ((num1.getImaginaryPart() * num2.getRealPart()) - (num1.getRealPart() * num2.getImaginaryPart())) / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
