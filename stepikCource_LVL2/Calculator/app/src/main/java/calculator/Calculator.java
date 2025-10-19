package calculator;

public class Calculator {
    public double add(int a, int b) {
        return a + b;
    }
    public double divide(double a, double b) {
        return a / b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }

    public double square(double a) {
        return a * a;
    }
    public Double add(int i, double d, double e) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
