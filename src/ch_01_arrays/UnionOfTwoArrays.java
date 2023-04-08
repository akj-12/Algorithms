package ch_01_arrays;

import java.util.ArrayList;

public class UnionOfTwoArrays {

    public static ArrayList<Integer> unionOfTwoArrayNaive(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {

        ArrayList<Integer> unionArrays = new ArrayList<Integer>();

        // traver arr1 and put element into union arrays
        for (int i = 0; i < arr1.size(); i++) {
            int elementOfArr1 = arr1.get(i);
            // check if duplicate present in union arr
            boolean isDuplicatePresent = Array.checkDuplicate(unionArrays, elementOfArr1);
            if (isDuplicatePresent == false) {
                unionArrays.add(elementOfArr1);
            }
        }

        // traver arr2 and put element into union arrays
        for (int i = 0; i < arr2.size(); i++) {
            int elementOfArr2 = arr2.get(i);
            // check if duplicate present in union arr
            boolean isDuplicatePresent = Array.checkDuplicate(unionArrays, elementOfArr2);
            if (isDuplicatePresent == false) {
                unionArrays.add(elementOfArr2);
            }

        }

        return unionArrays;
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
        arr2.add(300);
        arr2.add(2);

        ArrayList<Integer> union = unionOfTwoArrayNaive(arr1, arr2);
        System.out.println(union);
    }
}
