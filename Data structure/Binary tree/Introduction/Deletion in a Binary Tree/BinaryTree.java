//https://www.geeksforgeeks.org/deletion-binary-tree/


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

    static void deleteDeepest(Node node,Node deleteNode){
        Queue<Node> queue=new LinkedList<>();
        Node tmp=null;
        queue.add(node);
        while(!queue.isEmpty()){
            tmp=queue.poll();
            if(tmp.right!=null){
                if(tmp.right.key==deleteNode.key){
                    tmp.right=null;
                    return;
                }else{
                    queue.add(tmp.right);
                }
            }
            if(tmp.left!=null){
                if(tmp.left.key==deleteNode.key){
                    tmp.left=null;
                    return;
                }else{
                    queue.add(tmp.left);
                }
            }
        }
    }
    
    /* function to delete element in binary tree */
    static void deletion(Node node,int key){
        Node deleteNode=null;
        Node tmp=null;
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            tmp=queue.poll();
            if(tmp.key==key){
                deleteNode=tmp;
            }
            if(tmp.left!=null){
                queue.add(tmp.left);
            }
            if(tmp.right!=null){
                queue.add(tmp.right);
            }
        }
        //tmp now is bottom most and rightmost node
        int replaceValue=tmp.key;
        if(replaceValue!=key){
            deleteDeepest(node, tmp);
            deleteNode.key=replaceValue;
        }else{
            deleteDeepest(node, tmp);
        }       
    }

   public static void main(String[] args) 
    {     
        root = new Node(10); 
        root.left = new Node(11); 
        root.left.left = new Node(7); 
        root.left.right=new Node(12);
        root.right = new Node(9); 
        root.right.left = new Node(15); 
        root.right.right = new Node(8); 
       
        System.out.println( "Inorder traversal before deletion :\n"); 
        inorder(root); 
       
        int key = 11; 
        deletion(root, key); 
       
        System.out.print("\nInorder traversal after deletion :\n"); 
        inorder(root); 
    } 
}