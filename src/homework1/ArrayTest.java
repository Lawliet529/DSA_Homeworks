package homework1;

import java.util.Scanner;

public class ArrayTest {

  public static void main(String[] args) {
    // Input an array of n integers
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = scan.nextInt();
    int[] array = new int[n];
    System.out.print("Enter the elements: ");
    for (int i = 0; i < n; i++) {
      array[i] = scan.nextInt();
    }

    // Print all perfect numbers in the array
    System.out.print("The perfect numbers are: ");
    for (int i = 0; i < n; i++) {
      if (isPerfect(array[i])) {
        System.out.print(array[i] + " ");
      }
    }
    System.out.println();

    // Print all prime numbers in the array
    System.out.print("The prime numbers are: ");
    for (int i = 0; i < n; i++) {
      if (isPrime(array[i])) {
        System.out.print(array[i] + " ");
      }
    }
    System.out.println();
  }

  private static boolean isPerfect(int k) {
    int sum = 0;
    for (int i = 1; i <= k / 2; i++) {
      if (k % i == 0) {
        sum += i;
      }
    }
    return sum == k;
  }

  private static boolean isPrime(int k) {
    if (k <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(k); i++) {
      if (k % i == 0) {
        return false;
      }
    }
    return true;
  }
}
