package SalesByMatch;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        List<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(10);
        ar.add(10);
        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add(20);
        ar.add(30);
        ar.add(50);


        Map<Integer, Integer> socks = new HashMap<>();
        int result = 0;

        for (Integer integer : ar) {
            if (socks.containsKey(integer)) {
                socks.put(integer, socks.get(integer) + 1);
            } else {
                socks.put(integer, 1);
            }
        }

        for (Integer sock : socks.values()){
            if(sock > 1 && sock % 2 == 1){
                result += (sock - 1) / 2;
            }else if(sock > 1) {
                result += sock / 2;
            }
        }

        System.out.println(result);

    }
}
