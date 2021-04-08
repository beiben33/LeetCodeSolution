package com.beiben.leetcode.solution641;

import com.beiben.leetcode.solution23.ListNode;

public class MyCircularDeque {
    int maxSize;
    int size;
    LinkedNode head;
    LinkedNode tail;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        maxSize = k;
        size = 0;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (size == maxSize) return false;
        LinkedNode node = new LinkedNode(value);
        if (size == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (size == maxSize) return false;
        LinkedNode node = new LinkedNode(value);
        if (size == 0) {
            head = node;
            tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        size++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (size == 0) return false;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head.next.prev = null;
            head = head.next;
        }
        size--;
        return true;

    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (size == 0) return false;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            tail.prev.next = null;
            tail = tail.prev;
        }
        size--;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if(size == 0) return -1;
        else return head.value;
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if(size == 0) return -1;
        else return tail.value;
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size == maxSize;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */