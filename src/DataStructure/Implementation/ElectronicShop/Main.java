package DataStructure.Implementation.ElectronicShop;

import java.util.Arrays;
import java.util.Collections;

/*
        A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with a give budget.
        Given price lists for keyboards and USB drives and a budget, find the cost to buy them.
        If it is not possible to buy both items, return -1.
        Find efficient purchase.
*/
public class Main {

    public static void main(String[] args) {

        int[] keyboards = {40,50,60};
        Integer[] drives = {5,8,12};
        Integer b = 60;

        int max = -1;
        Integer[] keyboardArr = new Integer[keyboards.length];

        for (int k = 0; k < keyboards.length; k++){
            keyboardArr[k] = keyboards[k];
        }

        Arrays.sort(keyboardArr,Collections.reverseOrder());
        Arrays.sort(drives);

        for(int i = 0; i < keyboardArr.length; i++){
            for(int j = 0; j < drives.length; j++){
                if(keyboardArr[i]+drives[j] > b) break; //This prevents j from incrementing
                if(keyboardArr[i]+drives[j] > max)
                    max = keyboardArr[i]+drives[j];
            }
        }
        System.out.println(max);
       // return max;


    }
}
