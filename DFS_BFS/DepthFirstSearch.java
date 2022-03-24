package DFS_BFS;
import java.util.*;
public class DepthFirstSearch {
    
    Node root;
    public void DFS(Node root){
        if(root==null) return;
        else{
            System.out.println(root.data+ " ");
            DFS(root.left);
            DFS(root.right);
        }
        
    }
    public static void main(String[] args) {
        DepthFirstSearch dfs = new DepthFirstSearch();
        dfs.root = new Node(1);
        dfs.root.left = new Node(2);
        dfs.root.right = new Node(3);
        dfs.root.left.left = new Node(4);
        dfs.root.left.right = new Node(5);
        dfs.root.right.left = new Node(6);
        dfs.root.right.right = new Node(7);
        dfs.DFS(dfs.root);
    }
}

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        right=left=null;
    }
}
