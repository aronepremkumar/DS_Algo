package datastructure;

import java.util.ArrayList;

class SinglyLinkedList {
    Node head;
    class Node{
        int value;
        Node next = null;
    }

    public SinglyLinkedList() {
        //LinkedList list = new LinkedList();
        head = null;
    }

    public int get(int index) {
        Node iterator = head;
        int returnValue = -1;
        int i = 0;
        while(iterator != null && i<=index){
            if(i == index)
            {
                returnValue = iterator.value;
            }
            iterator = iterator.next;
            i+=1;
        }
        return returnValue;
    }

    public void insertHead(int val) {
        Node node = new Node();
        node.value = val;
        node.next = head;
        head = node;
    }

    public void insertTail(int val) {
        Node node = new Node();
        node.value = val;
        node.next = null;
        if(head==null){
            head = node;
        }else{
            Node iterator = head;
            while(iterator.next !=null){
                iterator = iterator.next;
            }
            iterator.next = node;
        }

    }

    public boolean remove(int index) {
        Node iterator = head;
        Node prev = head;
        boolean returnValue = false;

        if(head == null)
            return returnValue;

        if(index ==0){
            //if only one element in the list and multiple elements in the list with index 0 is removed
            head = head.next !=null ? head.next : null;
            return true;
        }

        int i = 0;
        while(iterator != null && i<index){
            prev = iterator;
            iterator = iterator.next;
            i+=1;
        }
        //i is in the index prior to the index we want to remove
        //current value and next value are not null
        if(iterator != null){
            prev.next = (iterator.next!=null)? prev.next.next : null;
            returnValue = true;
        }

        return returnValue;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<Integer>();
        Node iterator = head;
        while(iterator !=null){
            int eachValue = iterator.value;
            values.add(eachValue);
            iterator = iterator.next;
        }
        return values;
    }

    public static void main(String[] args) {
        //insertHead 0
        SinglyLinkedList list = new SinglyLinkedList();

        /*list.insertHead(1);
        System.out.println(list.getValues());
        //inserttail 2
        list.insertTail(2);
        System.out.println(list.getValues());
        //insertHead 1
        list.insertHead(0);
        System.out.println(list.getValues());
        //remove 1
        list.remove(1);
        System.out.println(list.getValues());
        //getvalues
        ArrayList<Integer> values = list.getValues();
        //print values
        System.out.println("Values in the linked list: " + values);*/

        //["insertTail", 1, "insertTail", 2, "get", 1, "remove", 1, "insertTail", 2, "get", 1, "get", 0]

        list.insertTail(1);
        System.out.println(list.getValues());
        list.insertTail(2);
        System.out.println(list.getValues());
        System.out.println("here");
        System.out.println(list.get(1)); // Should print 2
        System.out.println(list.getValues());
        list.remove(1);
        System.out.println("removing index 1");
        System.out.println(list.getValues());
        list.insertTail(2);
        System.out.println(list.getValues());
        System.out.println(list.get(1)); // Should print 2
        System.out.println(list.get(0)); // Should print 1

        //["insertHead", 1, "insertHead", 2, "insertTail", 3, "insertTail", 4, "insertHead", 5, "get", 0, "get", 2, "get", 4, "remove", 2, "remove", 0,
        // "insertHead", 6, "insertTail", 7, "getValues", "get", 5]
        /*list.insertHead(1);
        System.out.println(list.getValues());
        list.insertHead(2);
        System.out.println(list.getValues());
        list.insertTail(3);
        System.out.println(list.getValues());
        list.insertTail(4);
        System.out.println(list.getValues());
        list.insertHead(5);
        System.out.println(list.getValues());
        System.out.println(list.get(0));
        System.out.println(list.get(2)); // Should print 3
        System.out.println(list.get(4)); // Should print 4
        list.remove(2); // Remove the element at index 2 (which is 3
        System.out.println("After removing index 2: " + list.getValues());
        list.remove(0); // Remove the element at index 0 (which is 5
        System.out.println("After removing index 0: " + list.getValues());
        list.insertHead(6);
        System.out.println(list.getValues());
        list.insertTail(7);
        System.out.println(list.getValues());
        System.out.println("All values in the linked list: " + list.getValues());
        System.out.println("Value at index 5: " + list.get(5)); */



    }
}
