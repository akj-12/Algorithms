package ch_01_arrays;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {

    public static ArrayList<Integer> intersectArray(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> interSecArr = new ArrayList<Integer>();
        // traverse array1
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr2.size(); j++) {
                if (arr1.get(i) == arr2.get(j)) {
                    int commonElement = arr1.get(i);
                    interSecArr.add(commonElement);
                    // handle duplicate
                    arr2.set(j, -1);
                }
            }
        }
        return interSecArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(3);
        arr1.add(3);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(11);
        arr2.add(40);
        arr2.add(200);
        arr2.add(3);
        arr2.add(3);
        arr2.add(2);

        ArrayList<Integer> intersection = intersectArray(arr1, arr2);
        System.out.println(intersection);
    }
}
