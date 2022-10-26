package homework2;

import java.util.Scanner;

public class QuickSort {

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

    // Sort the array using quick sort
    int comparisons = 0;
    int swaps = 0;
    int[] stack = new int[n]; // Stack for storing the start and end indices
    int top = -1;
    int left = 0;
    int right = n - 1;
    stack[++top] = left;
    stack[++top] = right;
    while (top >= 0) {
      right = stack[top--];
      left = stack[top--];
      int pivot = array[(left + right) / 2];
      int i = left;
      int j = right;
      while (i < j) {
        // Find the first element that is greater than or equal to the pivot
        while (array[i] < pivot) {
          i++;
          comparisons++;
        }
        while (array[j] > pivot) {
          j--;
          comparisons++;
        }
        // Swap the elements
        if (i < j) {
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
          swaps++;
          // Print the array after each swap
          for (int k = 0; k < n; k++) {
            System.out.print(array[k] + " ");
          }
          System.out.println();
        }
        i++;
      }

      if (left < j) { // Push the left subarray onto the stack
        stack[++top] = left;
        stack[++top] = j;
      }
      if (right > i) { // Push the right subarray onto the stack
        stack[++top] = i;
        stack[++top] = right;
      }
    }

    // Print number of comparisons and swaps
    System.out.println("Number of comparisons: " + comparisons);
    System.out.println("Number of swaps: " + swaps);
  }
}
