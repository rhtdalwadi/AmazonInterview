package com.rohit;

import java.util.Arrays;

public class QuickSortAlgorithm {

  public static void main(String args[]) {
    int[] unsorted = {6, 5, 3, 1, 8, 7, 2, 4};
    System.out.println("Array before Bubblesort :" + Arrays.toString(unsorted));
    QuickSort algorithm = new QuickSort();
    algorithm.sort(unsorted);
    System.out.println("Array after Quicksort :" + Arrays.toString(unsorted));
  }
}

class QuickSort {
  private int input[];
  private int length;

  public void sort(int[] numbers) {
    if (numbers == null || numbers.length == 0) {
      return;
    }

    this.input = numbers;
    length = numbers.length;

    quickSort(0, length - 1);
  }


  private void quickSort(int low, int high) {
    int i = low;
    int j = high;
    int pivot = input[low + (high - low) / 2];
    while (i <= j) { 
      while (input[i] < pivot) {
        i++;
      }
      while (input[j] > pivot) {
        j--;
      }
      if (i <= j) {
        swap(i, j);
        // move index to next position on both sides
        i++;
        j--;
      }
    }
    if (low < j) {
      quickSort(low, j);
    }
    if (i < high) {
      quickSort(i, high);
    }
  }

  private void swap(int i, int j) {
    int temp = input[i];
    input[i] = input[j];
    input[j] = temp;
  }
}

