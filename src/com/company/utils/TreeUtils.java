package com.company.utils;

import com.company.console.Node;
import com.company.console.Tree;

public class TreeUtils {

    public static Tree buildTree(int n) {
        Tree tree = new Tree();
        Node root = new Node();
        root.setValue(0);
        tree.insertNode(root, 1, n);
        tree.setRootNode(root);

        return tree;
    }

    public static void printBinaryTree(Node root, int level) {
        if (root == null)
            return;
        printBinaryTree(root.getRightChild(), level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++)
                System.out.print("|\t");
            System.out.println("|---" + root.getValue());
        } else
            System.out.println(root.getValue());
        printBinaryTree(root.getLeftChild(), level + 1);
    }
}
