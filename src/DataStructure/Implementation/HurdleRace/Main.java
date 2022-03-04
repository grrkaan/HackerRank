package DataStructure.Implementation.HurdleRace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int k = 7;
        List<Integer> height = new ArrayList<>();
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(5);
        height.add(2);

        int max = Collections.max(height);

        if(k >= max){
            System.out.println(0);
            //return 0;
        }else {
            int result = max - k;
            System.out.println(result);
            //return result;
        }



    }

}
