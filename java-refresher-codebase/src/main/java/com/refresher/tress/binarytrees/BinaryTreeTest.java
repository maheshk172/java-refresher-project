package com.refresher.tress.binarytrees;

import java.util.Random;

public class BinaryTreeTest {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        int value;
        Random random = new Random();

        System.out.println("Inserting values");
        int[] array = {37, 31, 98, 9, 87, 74, 75, 51, 45, 95 };
        for (int i=0; i<10;i++){
            //value=random.nextInt(100);
            value = array[i];
            System.out.printf("%d ", value);
            tree.insertNode(value);
        }
        /*System.out.println();
        System.out.println("Preorder");
        tree.preorderTraversal();
        System.out.println();

        System.out.println("Postorder");
        tree.postorderTraversal();
        System.out.println();

        System.out.println("Inorder");
        tree.inorderTraversal();
        System.out.println();

        System.out.println("Levelorder");
        tree.levelorderTraversal();*/

        System.out.println();
        System.out.println("Depth First");
        tree.depthfirstTraversal();

    }
}
