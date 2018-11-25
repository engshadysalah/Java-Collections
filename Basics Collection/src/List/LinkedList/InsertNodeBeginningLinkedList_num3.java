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
public class InsertNodeBeginningLinkedList_num3 {

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

    // insert new node at the beginning of linkedlist
    static ListNode insertAtBeginning(ListNode head, int data) {
        
        ListNode newNode = new ListNode(data);
        
        if (head == null) {
            return newNode;
        }
        
        newNode.next = head;
        head = newNode;
        
        return head;
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
        display(insertAtBeginning(head, 15));
    }
    
}
