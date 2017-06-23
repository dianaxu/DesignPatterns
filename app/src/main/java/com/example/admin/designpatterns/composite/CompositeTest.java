package com.example.admin.designpatterns.composite;

/**
 * @author Diana
 * @date 2017/6/23
 */

public class CompositeTest {


    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");
    }

}
