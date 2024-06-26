package Java語言程序設計基礎篇.Exercise_25.Exercise_25_04; /*********************************************************************************
* (Implement preorder traversal without using recursion) Implement the preorder  *
* method in BST using a stack instead of recursion. Write a test program that    *
* prompts the user to enter 10 integers, stores them in a BST, and invokes the   *
* preorder method to display the elements.                                       *
*********************************************************************************/
import java.util.Scanner;

public class Exercise_25_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer[] numbers = new Integer[10];

		// Prompt the user to enter 10 integers
		System.out.print("Enter 10 integers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();
		
		// Create Integer BST
		BST<Integer> intTree = new BST<>(numbers);

		// Traverse tree preorder
		System.out.print("Tree preorder: ");
		intTree.preorder();
		System.out.println();
	}
}