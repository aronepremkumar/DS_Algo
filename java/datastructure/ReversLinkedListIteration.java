package datastructure;

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/**
 * Most important thing understood in the reverse linked list is
 * Process the newly created linked list
 * User pointers current and previous
 * current start with head and is processed incrementally
 * For each step feed the previous element for the current. Previous begins with null value
 * Move the current in the old linked list at each step
 */

public class ReversLinkedListIteration {


    public static ListNode reverseList(ListNode head){
        ListNode newHead = null;
        //incrementally adjust the prev and the current element
        //use next element as temporary variable to move the pointers
        ListNode prev = null;
        ListNode current = head;

        while (current!=null){
            //Grab the next element before modifying it
            ListNode next = current.next;
            //Modify the current to point the prev element. Start with null and incrementally point the prev to the current element
            current.next = prev;
            //set the prev element to the current
            prev = current;
            //set the current to the next element
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(0);
        node.insertTail(1);
        node.insertTail(2);
        node.insertTail(3);

        ListNode newHead = reverseList(node.next);
        List values = newHead.getValues();
        System.out.println(values);
    }

}
