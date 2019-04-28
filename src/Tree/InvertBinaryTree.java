/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Tree;

/**
 *
 * @author aaronyang
 */

public class InvertBinaryTree {
    public static void main(String[] args) {
        
    }
    
    public TreeNode invertTree(TreeNode root){
        if( root == null ){
            return null;
        }
        
        TreeNode right = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(right);
        return root;
    }
    
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){ val = x; }
    }
}


