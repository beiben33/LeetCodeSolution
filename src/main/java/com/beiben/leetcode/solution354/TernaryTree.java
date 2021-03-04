package com.beiben.leetcode.solution354;

public class TernaryTree {
    private int[] data;
    private TernaryTree left;
    private TernaryTree middle;
    private TernaryTree right;

    public TernaryTree() {

    }

    public TernaryTree(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public TernaryTree getLeft() {
        return left;
    }

    public void setLeft(TernaryTree left) {
        this.left = left;
    }

    public TernaryTree getMiddle() {
        return middle;
    }

    public void setMiddle(TernaryTree middle) {
        this.middle = middle;
    }

    public TernaryTree getRight() {
        return right;
    }

    public void setRight(TernaryTree right) {
        this.right = right;
    }
}
