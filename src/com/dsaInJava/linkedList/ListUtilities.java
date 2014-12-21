package com.dsaInJava.linkedList;

public class ListUtilities {

    public static void printList(ListNode head){

        ListNode current = head;
        System.out.print("head");
        while (current!=null){
            System.out.print("->" + current.getData());
            current = current.getNext();
        }
        System.out.println("->null");
    }

    public static ListNode generateList(){

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        ListNode n8 = new ListNode(8);
        ListNode n9 = new ListNode(9);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;

        return n1;
    }

    public static int listLength(ListNode head){

        int length = 0;
        ListNode current = head;
        while (current!=null){
            length++;
            current = current.getNext();
        }
        return length;
    }
}
