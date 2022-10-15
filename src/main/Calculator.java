public class Calculator implements ICalculator{


    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (Math.abs(b) < 10e-8) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
