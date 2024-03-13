package week8;

import week7.Comparator;
import week7.IntDecreasing;

public class BST <A> {
    private BinaryTreeNode<A> root;
    private Comparator<A> comparator;

    public BST(Comparator<A> comparator){
        this.comparator=comparator;
        this.root=null;
    }
    public void insert(A toInsert){
        if (this.root==null){
            this.root=new BinaryTreeNode<>(toInsert,null,null);
        } else {
            this.insertHelper(this.root,toInsert);
        }
    }
    public void insertHelper(BinaryTreeNode<A> node,A toInsert){
        if(this.comparator.compare(toInsert,node.value)){
            if (node.left==null){
                node.left=new BinaryTreeNode<>(toInsert,null,null);
            } else {
                insertHelper(node.left,toInsert);
            }
        } else {
            if (node.right==null){
                node.right=new BinaryTreeNode<>(toInsert,null,null);
            } else {
                insertHelper(node.right,toInsert);
            }
        }
    }
/*
write a find method that takes a value of type A and returns true
if found and false otherwise
 */
    public boolean find(A toFind){
        if (this.root==null){
            return false;
        } else {
            return findHelper(this.root,toFind);
        }
    }
    public boolean findHelper(BinaryTreeNode<A> node,A toFind){
        if (node.value.equals(toFind)){
            return true;
        } else if (this.comparator.compare(toFind,node.value)){
            if(node.left==null){
                return false;
            } else {
                return findHelper(node.left,toFind);
            }
        } else {
            if(node.right==null){
                return false;
            } else {
                return findHelper(node.right,toFind);
            }
        }
    }
    public static void main(String[] args) {
        BST<Integer> bst=new BST<>(new IntDecreasing());
        bst.insert(2);
        bst.insert(5);
        bst.insert(-10);
        bst.insert(4);
        bst.insert(20);
        bst.insert(0);
        bst.insert(-11);

        System.out.println(bst.root.inOrderTraversal(bst.root));
    }
}
