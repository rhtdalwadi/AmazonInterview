package com.rohit;

public class SequentialSearchAlgorithm {

  // Sequential search has an average and worst-case runtime complexity of O(N).
  public static void main(String[] args) {
    int[] input = {1, 2, 3, 4, 5, 7, 17, 19};
    System.out.println(" is KeyWord Found : " + isKeywordFound(input, 4));
  }

  public static boolean isKeywordFound(int[] a, int b) {
    for (int i : a) {
      if (i == b) {
        return true;
      }
    }
    return false;
  }
}
