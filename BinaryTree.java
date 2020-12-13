public class BinaryTree { 
	Node root; 

	static class Node { 
		int data; 
		Node left, right; 
		Node(int data) 
		{ 
			this.data = data; 
			this.left = null; 
			this.right = null; 
		} 
	} 
	
	public Node insertoLevelOrder(int[] arr, Node root, int i) 
	{ 
		if (i < arr.length) { 
			Node temp = new Node(arr[i]); 
			root = temp; 

			root.left = insertoLevelOrder(arr, root.left, 2 * i + 1); 
			root.right = insertoLevelOrder(arr, root.right, 2 * i + 2); 
		} 
		return root; 
	} 

	int lartesia(Node node)  
    { 
        if (node == null) 
            return 0; 
        else 
        { 
            int lartesiaMajtas = lartesia(node.left); 
            int lartesiaDjathtas = lartesia(node.right); 
   
            if (lartesiaMajtas > lartesiaDjathtas) 
                return (lartesiaMajtas + 1); 
             else 
                return (lartesiaDjathtas + 1); 
        }
    }
	
	public static void main(String args[]) 
	{ 
		BinaryTree tree = new BinaryTree(); 
		int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };  
		tree.root = tree.insertoLevelOrder(arr, tree.root, 0); 
		System.out.println("Lartesia e pemes eshte : " +  tree.lartesia(tree.root));
	} 
} 
