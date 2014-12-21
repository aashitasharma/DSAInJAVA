package com.dsaInJava.linkedList;

public class ListNode {

    int data;
    ListNode next;

    ListNode(int x){
        data = x;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
