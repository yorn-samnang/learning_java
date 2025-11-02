public class ComplexNumber {
    // instance variables
    private double real;
    private double imaginary;

    // constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // getters
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // add with another ComplexNumber
    public void add(ComplexNumber other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }

    // add with two doubles
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    // subtract with another ComplexNumber
    public void subtract(ComplexNumber other) {
        this.real -= other.real;
        this.imaginary -= other.imaginary;
    }

    // subtract with two doubles
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
}
