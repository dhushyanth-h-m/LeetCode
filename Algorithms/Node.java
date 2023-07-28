package Algorithms;

public class Node {
    int val;
    Node right;
    Node left;

    Node(){}

    Node(int val){this.val = val;
    this.right = null;
    this.left = null;}

    Node(int val, Node left, Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    Node insertValue(int value){
        if(value < this.val){
            if(this.left == null){
                this.left = new Node(value);
                return this.left;
            }
            else{
                return this.left.insertValue(value);
            }
        }
        else if(value > this.val){
            if(this.right == null){
                this.right = new Node(value);
                return this.right;
            }
            else{
                this.right.insertValue(value);
            }
        }
        return this;
    }

//    Node insertValue(int value, Node currentNode){
////        Node currentNode = currentNode;
//
//        if(currentNode == null){
//            currentNode = new Node(value);
//            return currentNode;
//        }
//        else if(value < currentNode.val)
//            currentNode.left = insertValue(value, currentNode.left);
//        else if(value > currentNode.val)
//            currentNode.right = insertValue(value, currentNode.right);
//
//        return currentNode;
//
////        while(currentNode != null){
////            previousNode = currentNode;
////            if(value < currentNode.val){
////                currentNode = currentNode.left;
////            }
////            else {
////                currentNode = currentNode.right;
////            }
////        }
//
////        if(value < previousNode.val){
////            previousNode.left = new Node(value);
////        }
////        else{
////            previousNode.right = new Node(value);
////        }
////
////        return tree;
//    }
}