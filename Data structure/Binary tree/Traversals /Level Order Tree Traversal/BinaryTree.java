import java.util.Queue;
import java.util.LinkedList;

class TreeNode{
    int key;
    TreeNode left,right;

    public TreeNode(int key) {
        this.key=key;
        this.left=this.right=null;
    }
}

public class BinaryTree{
    TreeNode root;

    public BinaryTree(int key) {
        root=new TreeNode(key);
    }
    
    BinaryTree() { 
        root = null; 
    } 
    void printLevelOrder() {
        Queue<TreeNode> queue = new LinkedList<TreeNode>(); 
        queue.add(root); 
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            System.out.print(node.key);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        System.out.println();
    }
   public static void main(String[] args) 
    { 
        BinaryTree tree = new BinaryTree(); 
  
        /*create root*/
        tree.root = new TreeNode(1); 
        tree.root.left = new TreeNode(2); 
        tree.root.right = new TreeNode(3); 
        tree.root.left.left = new TreeNode(4); 
        tree.root.left.right = new TreeNode(5); 
        /* 
                    1 
                /       \ 
               2          3 
             /   \       /  \ 
            4    5  null  null 
           /   \ 
          null null 
         */
        tree.printLevelOrder();
    } 
}