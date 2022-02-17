package FormingMagicSquare;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<Integer>> s = new ArrayList<>();
        List<Integer> x = new ArrayList<>();
        x.add(5);
        x.add(3);
        x.add(4);
        List<Integer> y = new ArrayList<>();
        y.add(1);
        y.add(5);
        y.add(8);
        List<Integer> z = new ArrayList<>();
        x.add(6);
        x.add(4);
        x.add(2);

        s.add(x);
        s.add(y);
        s.add(z);

        int n = s.size();
        int sum = n * (n * n + 1) / 2;
        System.out.println(sum);

    }

}
