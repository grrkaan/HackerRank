package MigratoryBirds;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

    /*
    Given an array of bird sightings where every element represents a bird type id,
    determine the id of the most frequently sighted type. If more than 1 type has been spotted that maximum amount,
    return the smallest of their ids.
     */
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);

      Collections.sort(arr);

        int mostFreq = 0;
        int tempKey = 0;
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();

        for (int i=0; i< arr.size(); i++){
            if(i == 0){
                h.put(arr.get(i),Collections.frequency(arr,arr.get(i)));
                mostFreq = Collections.frequency(arr,arr.get(i));
                tempKey = arr.get(i);
            }else {
                if (tempKey != arr.get(i)) {
                    int tempFreq = Collections.frequency(arr, arr.get(i));
                    if (mostFreq < tempFreq) {
                        mostFreq = tempFreq;
                        h.remove(tempKey);
                        tempKey = arr.get(i);
                        h.put(arr.get(i), tempFreq);
                    } else if (mostFreq == tempFreq) {
                        if (arr.get(i) < tempKey) {
                            h.remove(tempKey);
                            tempKey = arr.get(i);
                            h.put(tempKey, mostFreq);
                        }
                    }
                }
            }
        }
        Map.Entry<Integer,Integer> entry = h.entrySet().iterator().next();
        int result = entry.getKey();
        System.out.println(result);


    }

}

