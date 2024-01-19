package defaultPackage;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		Scanner scanner = new Scanner(System.in);
		

		
		getInputAndInsert(bst, scanner);
		
		System.out.println("BST after execution:");
		bst.inOrderTraversal();
		

		scanner.close();
		
		
		
	}
	
	
	private static void getInputAndInsert(BinarySearchTree bst, Scanner scanner) {
		System.out.println("Enter values to insert into BST then type 'start' to execute proccess:");
		
		String input;
		while(true) {
			input = scanner.next();
			
			if(input.toLowerCase().equals("start")) {
				break;
			}
			
			try {
				int value = Integer.parseInt(input);
				bst.insert(value);
			} catch(NumberFormatException e) {
				System.out.println("Invalid input. Please type 'start' to execute proccess.");
			}
			
		}

		
	}
}