package com.rohit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryPalindrome {

  public static void main(String args[]) {
    int input = 0;
    
    System.out.print("Enter Only Integer number: ");
    input = readIntegerInput(input);
    if(input != 0){
      String binaryNumber = convertIntegerToBinary(input);
      boolean isNumberPalindrome = isBinaryNumberPalindrom(binaryNumber);
      System.out.println("isNumberPalindrome :" + isNumberPalindrome);
    }
  }

  private static int readIntegerInput(int input) {
    Scanner scanner = new Scanner(System.in);
      try {
        input = scanner.nextInt();
      } catch (InputMismatchException ime) {
        System.out.println("Please enter only integer number");
      }
    return input;
  }

  public static String convertIntegerToBinary(int input) {
    return Integer.toBinaryString(input);
  }

  private static boolean isBinaryNumberPalindrom(String input) {

    boolean isNumberPalindrome = false;
    String reverse = "";
    int length = input.length();

    for (int i = length - 1; i >= 0; i--)
      reverse = reverse + input.charAt(i);

    if (input.equals(reverse)) {
      isNumberPalindrome = true;
    } else {
      isNumberPalindrome = false;
    }

    return isNumberPalindrome;
  }
}
