package DataStructure.Implementation.SubarrayDivision;

import java.util.ArrayList;
import java.util.List;
/*
We have a chocolate bar and has integer each bars.
We need to find pair count, with given m equals bar size and d equals sum of bars numbers.
* */
public class Main {


    public static void main(String[] args) {


        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);

        int m = 2; // Chocolate Bar Number
        Integer d = 3; // Sum of numbers on chocolate bars

        int count = 0;
        for (int i = 0; i < s.size() - m + 1; i++){
            int sum = 0;
            for (int j = 0; j < m; j++){
                sum = sum + s.get(i + j);
            }
            if (sum == d) {
                count++;
            }

        }

        System.out.println(count);

    }



}
