package ch_01_arrays;

import java.util.ArrayList;

public class UniqueElement {

    /*
     * Using naive appraoch
     */
    public static int finduniqueNaive(ArrayList<Integer> arr) {
        int UniqueElement = 0;
        for (int i = 0; i < arr.size(); i++) {
            boolean foundDuplicate = false;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j) && i != j) {
                    foundDuplicate = true;
                    break;
                }
            }

            if (foundDuplicate == false) {
                UniqueElement = arr.get(i);
            }
        }
        return UniqueElement;
    }

    /*
     * Using efficient appraoch suing XOR
     * 1 ^ 2 ^ 1 = 2 // 1 ^ 1 same cancel
     */
    public static int getunique(ArrayList<Integer> arr) {
        int uniqueElement = 0;
        for (int i = 0; i < arr.size(); i++) {
            uniqueElement = uniqueElement ^ arr.get(i);
        }
        return uniqueElement;
    }

    public static void main(String[] args) {

        ArrayList<Integer> dynamicArray = new ArrayList<>();
        dynamicArray.add(11);
        dynamicArray.add(2);
        dynamicArray.add(11);
        dynamicArray.add(40);
        dynamicArray.add(2);
        System.out.println(finduniqueNaive(dynamicArray));
        System.out.println(getunique(dynamicArray));
    }
}
