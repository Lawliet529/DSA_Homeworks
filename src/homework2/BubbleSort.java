package homework2;

import java.util.Scanner;

public class BubbleSort {

  public static void main(String[] args) {
    // Input array of n integers
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = scan.nextInt();
    int[] array = new int[n];
    System.out.print("Enter the elements: ");
    for (int i = 0; i < n; i++) {
      array[i] = scan.nextInt();
    }

    // Sort the array using bubble sort
    int comparisons = 0;
    int swaps = 0;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        comparisons++;
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          swaps++;
          // Print the array after each swap
          for (int k = 0; k < n; k++) {
            System.out.print(array[k] + " ");
          }
          System.out.println();
        }
      }
    }

    // Print number of comparisons and swaps
    System.out.println("Number of comparisons: " + comparisons);
    System.out.println("Number of swaps: " + swaps);
  }
}
