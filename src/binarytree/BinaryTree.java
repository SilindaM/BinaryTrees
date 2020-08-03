/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author 201626829
 */
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node root;
        root =new Node(30);
        Insert(root, 1);
        Insert(root, 18);
        Insert(root, 15);
        Insert(root, 10);
        Inorder(root);
        System.out.println("");
    }
  
    public static void Preorder(Node n){
        if(n==null)
            return;
            System.out.println(n.value+" ");
            PostOrder(n.left);
            PostOrder(n.right);
    } 
    public static void Inorder(Node n){
        if(n==null)
            return;
        Inorder(n.left);
        System.out.println(n.value+" ");
        Inorder(n.right);
    } 
    public static void PostOrder(Node n){
        if(n==null)
            return;
        PostOrder(n.left);
        PostOrder(n.right);
        System.out.println(n.value+" ");
    }
    public static Node Insert(Node node,int value){
        if(node==null){
            return new Node(value);
        }    
         if (value<node.value){
            node.left=Insert(node.left, value);
        }
        else if(value>node.value){
            node.right=Insert(node.right, value);
        }
        else{
            return node;
        }
        return  node;
    }
    
       
}
