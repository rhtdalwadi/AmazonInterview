package com.rohit;

public class BinarySearchAlgorithm {

  // Binary search cuts the search space in each iteration into half 
  // Binary search has complexity of O(lg N) runtime behavior.

  public static void main(String[] args) {
    int[] input = {1, 2, 3, 4, 5, 7, 17, 19};
    System.out.println(" is KeyWord Found : " + isKeywordFound(input, 14));
  }
  
  public static boolean isKeywordFound(int[] a, int b) {
    if (a.length == 0) {
      return false;
    }
    int low = 0;
    int high = a.length - 1;

    while (low <= high) {
      int middle = (low + high) / 2;
      if (b > a[middle]) {
        low = middle + 1;
      } else if (b < a[middle]) {
        high = middle - 1;
      } else { 
        
        return true;
      }
    }
    return false;
  }

}
