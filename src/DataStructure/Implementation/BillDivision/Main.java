package DataStructure.Implementation.BillDivision;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);


        int k = 1;
        int b = 7;

        int germanStyle = 0;
        int annaCost = 0;
        int sum = 0;
        int actualSum = 0;

        for (int food : bill){
            sum += food;
        }

        germanStyle = sum / 2;

        actualSum = sum - bill.get(k);
        annaCost = actualSum / 2 ;

        int diff = b - annaCost;

        if(diff == 0){
            System.out.println("Bon Appetit");
        }else {
            System.out.println(diff);
        }


    }
}
