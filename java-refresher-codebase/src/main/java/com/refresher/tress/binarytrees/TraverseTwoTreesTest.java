package com.refresher.tress.binarytrees;

import com.refresher.tress.TreeNode;

import java.util.Random;

public class TraverseTwoTreesTest {

    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        int value;

        System.out.println("Inserting values");
        int[] array = {37, 31, 98, 9, 87, 74, 75, 51, 45, 95};
        for (int i = 0; i < 10; i++) {
            value = array[i];
            System.out.printf("%d ", value);
            tree1.insertNode(value);
        }

        BinaryTree tree2 = new BinaryTree();
        int[] array2 = {37, 31, 98, 9, 87, 74, 75, 51, 45, 95};
        System.out.println("Inserting values");
        for (int i = 0; i < 10; i++) {
            value = array2[i];
            System.out.printf("%d ", value);
            tree2.insertNode(value);
        }


        System.out.println();
        System.out.println("Preorder Traversal of Two Trees");
        System.out.println();

        if(preorderTraversalForTwoTrees(tree1, tree2) == true) {
            System.out.println("Both trees are equal");
        } else {
            System.out.println("Both trees are not equal");
        }



    }

    public static boolean preorderTraversalForTwoTrees(BinaryTree binaryTree1, BinaryTree binaryTree2) {
        boolean treesAreEqual = false;

        TreeNode root1 = binaryTree1.root;
        TreeNode root2 = binaryTree2.root;

        if (root1 != null && root2 != null) {
            treesAreEqual = startTraversal(root1, root2);
        }


        return treesAreEqual;
    }

    public static boolean startTraversal(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else {
            if (node1.getData() == node2.getData() &&
                    startTraversal(node1.getLeftNode(), node2.getLeftNode()) &&
                    startTraversal(node1.getRightNode(), node2.getRightNode())) {
                return true;
            }
            return false;
        }
    }
}