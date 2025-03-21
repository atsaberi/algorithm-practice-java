package datastructures;

public class DynamicArray {
    int capacity;
    int size = 0;
    int[] array;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        if (i >= capacity) {
            System.out.println("Error: index is out of bound");
        }

        if (size >= capacity) {
            System.out.println("Warning: size is more than capacity. Resizing the array.");
            resize();
        }
        for (int j = size; j > i; j--) {
            array[j] = array[j - 1];
        }
        array[i] = n;
        size++;
    }

    public void pushback(int n) {
        if (size >= capacity) {
            resize();
        }
        this.array[this.size] = n;
        this.size++;
    }

    public int popback() {
        if (size < capacity / 3) {
            resize();
        }
        this.size--;
        return array[size];
    }

    private void resize() {
        if (size >= capacity) {
            System.out.println("Warning: size is more than capacity. Growing the array.");
            capacity = (capacity * 2);
        }

        if (size < capacity / 3) {
            System.out.println("Warning: size is much less than capacity. Shrinking the array.");
            capacity = (capacity / 2);
        }

        int[] newArray = new int[capacity];
        System.out.println("Info: new capacity: " + capacity);
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String toString() {
        String string = "";
        if (size != 0) {
            for (int i = 0; i < capacity; i++) {
                string += array[i];
                string += ",";
            }
        }

        if (string != "") {
            string = string.substring(0, string.length() - 1);
        }
        return ("[" + string + "]");

    }
}
