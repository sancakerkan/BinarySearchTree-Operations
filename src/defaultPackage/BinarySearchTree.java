package defaultPackage;

public class BinarySearchTree {
	private Node root;
	
	public BinarySearchTree() {
		
		this.root = null;
	}
	
	public void inOrderTraversal() {
		inOrderTraversal(root);
	}
	
	private void inOrderTraversal(Node root) {
		if(root != null) {
			inOrderTraversal(root.left);
			System.out.print(root.data + " ");
			inOrderTraversal(root.right);
		}
		
	}
	
	public void insert(int data) {
		root = insertRecursively(root, data);
	}
	
	private Node insertRecursively(Node root, int data) {
		if(root == null) {
			return new Node(data);
		}
		
		if(data < root.data) {
			root.left = insertRecursively(root.left, data);
		}else if(data > root.data) {
			root.right = insertRecursively(root.right, data);
		}return root;
		

	}
}
