package DataStructure.Implementation.PickingNumbers;

import java.util.*;

/*
Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to 1.
*/
public class Main {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(4);
        a.add(4);
        a.add(5);
        a.add(5);
        a.add(5);


        Collections.sort(a);
        Map<Integer, Integer> birds = new HashMap<>();
        int result = 0;
        int frequency[] = new int[101];

        for (int i = 0; i < a.size(); i++) {
            if (birds.containsKey(a.get(i))) {
                birds.put(a.get(i), birds.get(a.get(i)) + 1);
            } else {
                birds.put(a.get(i), 1);
            }
        }

        for (int i = 0; i < a.size(); i++) {
            if (birds.get(i) != null)
                frequency[i] = birds.get(i);
        }

        for (int i = 1; i <= 100; i++) {
            result = Math.max(result, frequency[i] + frequency[i - 1]);
        }

        System.out.println(result);
        //return result;
    }
}
