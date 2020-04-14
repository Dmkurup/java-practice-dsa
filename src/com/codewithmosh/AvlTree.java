package com.codewithmosh;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class AvlTree {

    private class AVLNode{
        private int height;
        private int value;
        private AVLNode rightChild;
        private AVLNode leftChild;

        public AVLNode(int value){
            this.value=value;
        }

    }

    private AVLNode root;
    public AVLNode insert(int value){
        return root = insert(root,value);
    }

    private AVLNode insert(AVLNode root,int value){
        if(root==null)
            return new AVLNode(value);
        if(value<root.value)
           root.leftChild=insert(root.leftChild,value);
        else
            root.rightChild = insert(root.rightChild, value);

        setHeight(root);

        int balFactor =balanceFactor(root);
        return root;

    }


    private void balance(AVLNode root){
        if(isLeftHeavy( root )) {
            if (balanceFactor( root.leftChild ) < 0)
                System.out.println( root.leftChild.value + "Left rotate" );
            System.out.println( root.value + "right rotate" );
        }
        else if(isRightHeavy( root )) {
            if (balanceFactor( root.rightChild ) > 0)
                System.out.println( root.rightChild.value + "Right Rotate" );
            System.out.println( root.value + "left rotate" );
        }
    }
    private void setHeight(AVLNode root){
        root.height =Math.max(height(root.leftChild),height(root.rightChild))+1;
    }

    private int height(AVLNode node){
        return (node==null)?-1:node.height;
    }

    private int balanceFactor(AVLNode root){
        return (root==null)?0 :height(root.leftChild)-height(root.rightChild);
    }

    private boolean isLeftHeavy(AVLNode root){
        return balanceFactor( root )>1;
    }

    private boolean isRightHeavy(AVLNode root){
        return balanceFactor( root )<-1;
    }
}
