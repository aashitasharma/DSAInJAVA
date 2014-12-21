package com.dsaInJava.linkedList;

public class PrintListInReverse {

    public static void printListFromEnd(ListNode head){

        if(head == null){
            return;
        }
        printListFromEnd(head.next);
        System.out.println(head.data);
    }

    public static void main(String args[]){

        ListNode head = ListUtilities.generateList();
        printListFromEnd(head);
    }
}
