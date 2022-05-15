public class Complex extends Number implements Comparable<Complex>, Cloneable {
    // create two double values for real and imaginary number
    double a = 0;
    double b = 0;

    public Complex(double a, double b) {
        // constructor 1
        this.a = a;
        this.b = b;
    }

    public Complex(double a) {
        // constructor 2
        this.a = a;
        b = 0;
    }

    public Complex() {
        // constructor 3
        this.a = 0;
        this.b = 0;
    }

    public double getRealPart() {
        // return real number
        return a;

    }

    public double getImaginaryPart() {
        // return imaginary number
        return b;

    }

    public static Complex add(Complex one1, Complex two2) {
        // create new complex number and call real and imaginary for both one1 and two2
        Complex x = new Complex(0, 0);
        x.a = one1.a + two2.a;
        x.b = one1.b + two2.b;
        return x;
    }

    public static Complex subtract(Complex one1, Complex two2) {
        // create new complex number and call real and imaginary values for one1 and
        // two2
        Complex y = new Complex(0, 0);
        y.a = one1.a - two2.a;
        y.b = one1.b - two2.b;
        return y;
    }

    public static Complex multiply(Complex one1, Complex two2) {
        // create new complex number and call real and imaginary values for one1 and
        // two2
        // multiply them
        double c = one1.a * two2.a - one1.b * two2.b;
        double b = one1.a * two2.b + one1.b * two2.a;
        Complex z = new Complex(c, b);
        return z;
    }

    public static Complex divide(Complex one1, Complex two2) {
        // create new complex number and call real and imaginary values for one1 and
        // two2
        // divide using formula given by professor
        double d = (one1.a * two2.a + one1.b / two2.b) / (two2.a * two2.a + two2.b + two2.b);
        double e = (one1.b * two2.a - one1.a * two2.b) / (two2.a * two2.a + two2.b * two2.b);
        Complex f = new Complex(d, e);
        return f;
    }

    public static double abs(Complex one1) {
        // return absolute value of complex 1
        return Math.sqrt(one1.a * one1.a + one1.b * one1.b);
    }

    @Override
    public String toString() {
        // return string value of answer
        // JA: What about when b is 0?
        String string;
        string = String.format("%.2f + %.2fi", a, b);
        return (string);
    }

    @Override
    public int compareTo(Complex o) {
        // compare real numbers
        return (int) (this.getRealPart() - o.getRealPart());
    }

    @Override
    public Complex clone() throws CloneNotSupportedException {
        // clone and throw exception if doesnt work
        super.clone();
        return new Complex(a, b);
    }

    @Override
    public int intValue() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long longValue() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float floatValue() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double doubleValue() {
        // TODO Auto-generated method stub
        return 0;
    }

}