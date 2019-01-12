//https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
import java.util.Stack;
class Node {

    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {

    // Root of Binary Tree 
    Node root;

    BinaryTree() {
        root = null;
    }

    void printInorder(Node node) {
        Stack<Node> stack=new Stack<>();
        Node current=node;
        while(current!=null||!stack.isEmpty()){
            while(current!=null){
                stack.push(current);
                current=current.left;
            }
            Node tmp=stack.pop();
            System.out.print(tmp.key+" ");
            current=tmp.right;
        }
    }
    void printInorder()    {     printInorder(root);   } 
    // Driver method 
    public static void main(String[] args) 
    { 
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
    
        System.out.println("\nInorder traversal of binary tree is "); 
        tree.printInorder(); 

    } 
}
