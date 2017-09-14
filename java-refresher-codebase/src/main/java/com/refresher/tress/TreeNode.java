package com.refresher.tress;

public class TreeNode{

    /*public TreeNode leftNode;
    public TreeNode rightNode;
    public int data;*/

    private TreeNode leftNode;
    private TreeNode rightNode;
    private int data;

    public TreeNode(int value){
        data = value;
        leftNode = rightNode = null;
    }

    public void insert(int value){
        if (value < data){
            if (leftNode == null)
                leftNode = new TreeNode(value);
            else
                leftNode.insert(value);
        }
        else if (value > data){
            if (rightNode == null)
                rightNode = new TreeNode(value);
            else
                rightNode.insert(value);
        }
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
