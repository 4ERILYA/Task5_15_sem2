package com.company.console;


import javax.swing.*;

public class Tree {
    private Node rootNode;

    public Tree() {
        rootNode = null;
    }


    public void insertNode(Node parentNode, int currentLevel, int lastLevel) {
        if (currentLevel > lastLevel) return;

        Node newNode = new Node();
        newNode.setValue(currentLevel);

        parentNode.setLeftChild(newNode);
        parentNode.setRightChild(newNode);
        insertNode(newNode, ++currentLevel, lastLevel);
    }


    public Node getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }
}
