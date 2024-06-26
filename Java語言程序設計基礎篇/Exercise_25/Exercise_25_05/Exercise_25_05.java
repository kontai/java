package Java語言程序設計基礎篇.Exercise_25.Exercise_25_05; /**********************************************************************************
* (Implement postorder traversal without using recursion) Implement the postorder *
* method in BST using a stack instead of recursion. Write a test program that     *
* prompts the user to enter 10 integers, stores them in a BST, and invokes the    *
* postorder method to display the elements.                                       *
**********************************************************************************/
import java.util.Scanner;
public class Exercise_25_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer[] numbers = new Integer[10];

		// Prompt the user to enter 10 integers
		System.out.print("Enter 10 integers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();
		
		// Create Integer BST
		BST<Integer> intTree = new BST<>(numbers);

		// Traverse tree postorder
		System.out.print("Tree postorder: ");
		intTree.postorder();
		System.out.println();
	}
}