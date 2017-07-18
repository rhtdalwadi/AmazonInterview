package com.rohit;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class SecondMostRepeatedNumber {
  private static int[] numbers = {1, 8, 1, 2, 3, 9, 7, 6, 5, 3, 2, 3, 1};

  public static void main(String[] args) {

    Arrays.sort(numbers);
    for (int i = 0; i < (numbers.length - 1); i++) {
      if (numbers[i] == numbers[i + 1]) {
        numbers[i] = -1;
      }
    }

    TreeMap<Integer, Integer> occurence = new TreeMap<Integer, Integer>();

    int k = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == -1) {
        k++;
        // System.out.print(" "+numbers[i]);
      } else {
        k++;
        occurence.put(k, numbers[i]);
        k = 0;
        if (occurence.size() > 2) {
          occurence.pollFirstEntry();
        }
      }
    }

    Map.Entry<Integer, Integer> entry = occurence.pollFirstEntry();
    System.out.println(" " + entry.getValue());
  }
}
