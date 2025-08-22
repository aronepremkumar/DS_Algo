package datastructure;

import java.util.ArrayList;

public class ListNode {

    int val;
    ListNode head;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void insertTail(int val) {
        ListNode node = new ListNode();
        node.val = val;
        node.next = null;
        if(head==null){
            head = node;
        }else{
            ListNode iterator = head;
            while(iterator.next !=null){
                iterator = iterator.next;
            }
            iterator.next = node;
        }

    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<Integer>();
        ListNode iterator = head;
        while(iterator !=null){
            int eachValue = iterator.val;
            values.add(eachValue);
            iterator = iterator.next;
        }
        return values;
    }

}
