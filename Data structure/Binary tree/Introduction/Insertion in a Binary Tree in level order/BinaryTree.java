import java.util.LinkedList; 
import java.util.Queue; 

class Node{
    int key;
    Node left,right;

    public Node(int key) {
        this.key=key;
        this.left=this.right=null;
    }
}

public class BinaryTree{
    static Node root; 
    static Node temp = root; 

    public BinaryTree(int key) {
        root=new Node(key);
    }
    
    BinaryTree() { 
        root = null; 
    } 

    /* Inorder traversal of a binary tree*/
    static void inorder(Node temp) {
        if(temp==null){
            return;
        }
        inorder(temp.left);
        System.out.print(temp.key+" ");
        inorder(temp.right);
    }

    static void insert(Node temp, int key){
        Queue<Node> q = new LinkedList<Node>(); 
        q.add(temp);
        while(!q.isEmpty()){
            temp = q.peek(); 
            q.remove(); 
            if(temp.left==null){
                temp.left=new Node(key);
                break;
            }else{
                q.add(temp.left);
            }

            if(temp.right==null){
                temp.right=new Node(key);
                break;
            }else{
                q.add(temp.right);
            }
        }
    }

   public static void main(String[] args) 
    { 
        root = new Node(10); 
        root.left = new Node(11); 
        root.left.left = new Node(7); 
        root.right = new Node(9); 
        root.right.left = new Node(15); 
        root.right.right = new Node(8); 
       
        System.out.println( "Inorder traversal before insertion:"); 
        inorder(root); 
       
        int key = 12; 
        insert(root, key); 
       
        System.out.print("\nInorder traversal after insertion:\n"); 
        inorder(root); 
    } 
}