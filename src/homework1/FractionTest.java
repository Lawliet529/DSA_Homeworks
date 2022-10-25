package homework1;

public class FractionTest {

  public static void main(String[] args) {
    Fraction f1 = new Fraction(1, 2);
    Fraction f2 = new Fraction(2, 3);
    Fraction f3 = f1.add(f2);
    System.out.println("f1 is " + f1.getNumerator() + "/" + f1.getDenominator());
    System.out.println("f2 is " + f2.getNumerator() + "/" + f2.getDenominator());
    System.out.println("f3 is " + f3.getNumerator() + "/" + f3.getDenominator());
    System.out.println(f1 + " + " + f2 + " = " + f3);
    System.out.println(f1 + " - " + f2 + " = " + f1.subtract(f2));
    System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));
    System.out.println(f1 + " / " + f2 + " = " + f1.divide(f2));
    System.out.println();

    f1.set(3, 4);
    System.out.println("f1 is " + f1);
    f2.setNumerator(5);
    System.out.println("f2 is " + f2);
    f3.setDenominator(7);
    System.out.println("f3 is " + f3);
    System.out.println();

    Fraction f4 = new Fraction(4);
    System.out.println("f4 is " + f4);
    Fraction f5 = new Fraction();
    System.out.println("f5 is " + f5);
    System.out.println();

    if (f1.equals(f2)) {
      System.out.println(f1 + " is equal to " + f2);
    } else {
      System.out.println(f1 + " is not equal to " + f2);
    }
    if (f2.equals(new Fraction(5, 3))) {
      System.out.println(f2 + " is equal to " + new Fraction(5, 3));
    } else {
      System.out.println(f2 + " is not equal to " + new Fraction(5, 3));
    }
  }
}
