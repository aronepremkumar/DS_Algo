package datastructure;

import java.util.ArrayList;
import java.util.List;

class DynamicArrayList {
    int capacity = 1;
    List<Integer> list = new ArrayList<Integer>();
    public DynamicArrayList(int capacity) {
        this.capacity = capacity;
    }

    public int get(int i) {
        int returnValue = (list.size()>=i) ? list.get(i) : -1;
        return returnValue;
    }

    public void set(int i, int n) {
        //check if size is equal to capacity. If so resize the dynamic array
        if (list.size()==this.capacity)
            this.resize();
        list.set(i,n);

    }

    public void pushback(int n) {
        if (this.list.size()==this.capacity)
            this.resize();
        list.add(n);
    }

    public int popback() {
        return list.remove(this.list.size()-1);
    }

    private void resize() {
        this.capacity = this.capacity*2;
    }

    public int getSize() {
        return this.list.size();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public static void main(String[] args) {
        DynamicArrayList dynamicArray = new DynamicArrayList(2);
        dynamicArray.pushback(1);
        dynamicArray.pushback(2);
        System.out.println("Size: " + dynamicArray.getSize() + ", Capacity: " + dynamicArray.getCapacity());
        System.out.println("Element at index 0: " + dynamicArray.get(0));
        System.out.println("Element at index 1: " + dynamicArray.get(1));
        System.out.println("Popped element: " + dynamicArray.popback());
        System.out.println("Size after pop: " + dynamicArray.getSize());
    }
}
