package com.company.console;


import com.company.ArrayUtils;
import com.company.utils.TreeUtils;

public class Main {

    public static void main(String[] args) {
        String numLine = ArrayUtils.readRow("Enter N value --> ");
        int n = ArrayUtils.toIntArray(numLine)[0];
        Tree tree = TreeUtils.buildTree(n);
        TreeUtils.printBinaryTree(tree.getRootNode(), 0);
    }
}
