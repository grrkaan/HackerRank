package DataStructure.Implementation.AngryProf;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int k = 3;
        List<Integer> a = new ArrayList<>();
        a.add(-2);
        a.add(-1);
        a.add(0);
        a.add(1);
        a.add(2);

        int arrivalTime = 0;

        for (int index : a){
            if(index <= 0){
                arrivalTime++;
            }
        }

       // return arrivalTime >= k ? System.out.println("NO") : System.out.println("YES");


    }
}
