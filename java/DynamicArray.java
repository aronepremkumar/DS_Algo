class DynamicArray {
    int capacity = 1;
    int size = 0;
    int[] list;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        list = new int[capacity];
    }

    public int get(int i) {
        int returnValue = (i < size)? list[i]: -1;
        return returnValue;
    }

    public void set(int i, int n) {
        //if(list.length==capacity)
        //    resize();
        list[i] = n;
    }

    public void pushback(int n) {
        int lastIndex = getSize();
        if(lastIndex == capacity)
            resize();
        list[lastIndex] = n;
        size+= 1;
    }

    public int popback() {
        int lastIndex = getSize()-1;
        size-= 1;
        return list[lastIndex];
    }

    private void resize() {
        capacity = capacity * 2;
        int[] newList = new int[capacity];
        for(int i=0;i<size;i++){
            newList[i] = list[i];
        }
        list = newList;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    /**
     *  capacity was declared but not initialized in the constructor.
     *  set operation does not have to resize the array.
     *  use the size variable to track the number of elements in the array.
     *  the actual lenght of the array will return popped values also
     *  also it is a good practice to remove the popped value from the array
     */
}
