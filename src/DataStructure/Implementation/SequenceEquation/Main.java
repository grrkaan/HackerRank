package DataStructure.Implementation.SequenceEquation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> p = new ArrayList<>();
        p.add(2);
        p.add(3);
        p.add(1);

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= p.size(); i++) {
            int temp = p.indexOf(i);
            temp++;
            int y = p.indexOf(temp);
            y++;
            list.add(y);
        }
        System.out.println(list);
    }
}
