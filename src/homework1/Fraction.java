package homework1;

public class Fraction {

  private int numerator;
  private int denominator;

  public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
    simplify();
  }

  public Fraction(int numerator) {
    this(numerator, 1);
  }

  public Fraction() {
    this(0, 1);
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public void setNumerator(int numerator) {
    this.numerator = numerator;
    simplify();
  }

  public void setDenominator(int denominator) {
    this.denominator = denominator;
    simplify();
  }

  public void set(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
    simplify();
  }

  public Fraction add(Fraction other) {
    int newNumerator = numerator * other.denominator + other.numerator * denominator;
    int newDenominator = denominator * other.denominator;
    return new Fraction(newNumerator, newDenominator);
  }

  public Fraction subtract(Fraction other) {
    int newNumerator = numerator * other.denominator - other.numerator * denominator;
    int newDenominator = denominator * other.denominator;
    return new Fraction(newNumerator, newDenominator);
  }

  public Fraction multiply(Fraction other) {
    int newNumerator = numerator * other.numerator;
    int newDenominator = denominator * other.denominator;
    return new Fraction(newNumerator, newDenominator);
  }

  public Fraction divide(Fraction other) {
    int newNumerator = numerator * other.denominator;
    int newDenominator = denominator * other.numerator;
    return new Fraction(newNumerator, newDenominator);
  }

  public boolean equals(Fraction other) {
    return numerator == other.numerator && denominator == other.denominator;
  }

  public String toString() {
    if (denominator == 1) {
      return numerator + "";
    } else {
      return numerator + "/" + denominator;
    }
  }

  private void simplify() {
    int gcd = gcd(numerator, denominator);
    numerator /= gcd;
    denominator /= gcd;
    if (denominator < 0) {
      numerator = -numerator;
      denominator = -denominator;
    }
  }

  private int gcd(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
}
