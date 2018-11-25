/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List.LinkedList;

/**
 *
 * @author root
 */
public class DeletAtEndingLinkedList_num9 {

    // it contains static inner class ListNode
    private static class ListNode {

        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    // private ListNode head; //head node to hold the list
    static void display(ListNode head) {

        if (head == null) {
            return;
        }
        ListNode current = head;

        while (current != null) {

            System.out.print(current.data + " ==> "); //print current element's data
            current = current.next;
        }
        System.out.println(current); //then current is null

    }

    //insert new node at the beginning of linkedlist
    static ListNode insertAtBeginning(ListNode head, int data) {

        ListNode newNode = new ListNode(data);

        if (head == null) {
            return newNode;
        }

        newNode.next = head;
        head = newNode;

        return head;
    }

    //insert new node at the beginning of linkedlist
    static ListNode insertAtEnding(ListNode head, int data) {

        ListNode newNode = new ListNode(data);

        if (head == null) {
            return newNode;
        }

        ListNode current = head;

        while (current.next != null) {

            current = current.next;
        }
        current.next = newNode;

        return head;
    }

    // find lenth
    static int length(ListNode head) {

        if (head == null) {
            return 0;
        }
        int length = 0;
        ListNode current = head;

        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    //insert new node at the beginning of linkedlist
    static ListNode insertAtPostion(ListNode head, int data, int postion) {

        int size = length(head);

        //boundery checks 
        if (postion > size + 1 || postion < 1) {
            System.out.println("invalid postion");
            return head;
        }
        ListNode newNode = new ListNode(data);

        if (postion == 1) {

            newNode.next = head;
            return newNode;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < postion - 1) {

                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
            return head;
        }

    }

    //deket node at postion
    static ListNode deletAtPostion(ListNode head, int postion) {

        int size = length(head);
        //boundery checks 
        if (postion > size + 1 || postion < 1) {
            System.out.println("invalid postion");
            return head;
        }

        if (postion == 1) {
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            return head;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < postion - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
            System.out.println("node that deleted is  : " + current.data);
            current = null;
            return current;
        }
    }

    //deket node at Begining
    static ListNode deletAtBedining(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode temp = head;
        head = head.next;
        System.out.println("node that deleted is  : " + temp.data);
        temp.next = null;
        return head;

    }

    //delet  node at the beginning of linkedlist
    static ListNode deletAtEnding(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode last = head;
        ListNode privousToLast = null;

        while (last.next != null) {

            privousToLast = last;
            last = last.next;
        }
         System.out.println("node that deleted is  : " + privousToLast.next.data);
        privousToLast.next = null;

        return last;
    }

    public static void main(String[] args) {

        // lets create a linkedlist Demo
        // 10  -->  8  -->  1  --> 11
        ListNode head = new ListNode(10);
        ListNode secound = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);

        //Attach them together to from a list
        head.next = secound;  // 10 ==> 8
        secound.next = third; // 10 ==> 8 ==> 1
        third.next = fourth;  // 10 ==> 8 ==> 1 ==> 11 ====> null

        display(head);
//
//        display(insertAtBeginning(head, 15));
//
//        display(insertAtEnding(head, 1000));
//
//        System.out.println("Length is : " + length(head));

        //  deletAtPostion(head, 1);
       // head = deletAtBedining(head);
        
        deletAtEnding(head);

        display(head);
    }

}
