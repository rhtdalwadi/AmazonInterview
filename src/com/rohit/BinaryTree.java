package com.rohit;

import java.util.Scanner;

/*
 * public class BinaryTree {
 * 
 * public static void main(String args[]) { System.out.println("BST"); } }
 */
class Node {

  int data;
  Node left, right;

  Node(int d) {
    data = d;
    left = right = null;
  }
}


class Main {

  static Node root;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter number");
    int inputLength = scan.nextInt();
    
    int[] numbers = new int[inputLength];

    for (int i = 0; i < numbers.length; i++)
    {
        numbers[i] = scan.nextInt();
    }
    
    BinaryTree tree = new BinaryTree();
    
    int n = numbers.length;
    root = tree.sortedArrayToBST(numbers, 0, n - 1);
    System.out.println("Preorder traversal of constructed BST");
    tree.preOrder(root);
  }


  Node sortedArrayToBST(int arr[], int start, int end) {

    if (start > end) {
      return null;
    }


    int mid = (start + end) / 2;
    Node node = new Node(arr[mid]);

    node.left = sortedArrayToBST(arr, start, mid - 1);

    node.right = sortedArrayToBST(arr, mid + 1, end);

    return node;
  }

  void preOrder(Node node) {
    if (node == null) {
      return;
    }
    System.out.print(node.data + " ");
    preOrder(node.left);
    preOrder(node.right);
  }


}
