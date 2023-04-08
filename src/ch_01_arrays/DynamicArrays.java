package ch_01_arrays;

import java.util.ArrayList;

public class DynamicArrays {

    public static void main(String[] args) {

        ArrayList<Integer> dynamicArray = new ArrayList<Integer>();

        // add item in array
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(40);
        dynamicArray.add(50);

        // remove item in an array
        dynamicArray.remove(2);

        System.out.println(dynamicArray);
    }
}
