package com.example.admin.designpatterns.composite;

/**
 * @author Diana
 * @date 2017/6/23
 */

public class Tree {
    TreeNode root = null;

    public Tree(String name) {
        this.root = new TreeNode(name);
    }
}
