public class LogCalculator implements ComplexCalculatorInterface{

    private ComplexCalculatorInterface complexCalculatorInterface;
    Logger logger;

    public LogCalculator(ComplexCalculatorInterface complexCalculatorInterface, Logger logger) {
        this.complexCalculatorInterface = complexCalculatorInterface;
        this.logger = logger;
        logger.writeLog("Примеры: ");
    }

    @Override
    public ComplexNumberInterface add(ComplexNumberInterface num1, ComplexNumberInterface num2) {
        logger.writeLog("Сумма с такими значениями: " + num1 + " и " + num2);
        return complexCalculatorInterface.add(num1, num2);
    }

    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface num1, ComplexNumberInterface num2) {
        logger.writeLog("Множитель с такими значениями: " + num1 + " и " + num2);
        return complexCalculatorInterface.multiply(num1, num2);
    }

    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface num1, ComplexNumberInterface num2) {
        logger.writeLog("Деление с такими значениями: " + num1 + " и " + num2);
        return complexCalculatorInterface.divide(num1, num2);
    }
}
