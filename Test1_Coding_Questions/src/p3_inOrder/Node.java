package p3_inOrder;

public class Node {
	public int iData;		// data item
	
	public Node leftChild;		// this node's left child
	public Node rightChild;		// this node's right child
	
	public void displayNode() {	// display ourselves
		System.out.print(iData);
	}
	
	public void inOrderTraversal(Node node) {
		if(node == null) return;
		inOrderTraversal(node.leftChild);
		node.displayNode();
		inOrderTraversal(node.rightChild);
	}
}
