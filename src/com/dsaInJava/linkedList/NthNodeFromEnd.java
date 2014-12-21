package com.dsaInJava.linkedList;

import org.codehaus.jackson.map.ObjectMapper;

public class NthNodeFromEnd {

    private  static ObjectMapper mapper = new ObjectMapper();

    public static ListNode nthNodeFromEnd(ListNode head,int Nth){

        int length = ListUtilities.listLength(head);
        ListNode current = head;

        if(length < Nth){
            return null;
        }

        int counter = length - Nth + 1;

        for (int i = 1;i < counter;i++){
            current = current.getNext();
        }
        System.out.println("Nth Node from end : " + current.getData());
        return  current;
    }

    public static void main(String args[]){

        ListNode head = ListUtilities.generateList();
        head = nthNodeFromEnd(head,9);

    }
}
