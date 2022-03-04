package DataStructure.Implementation.ClimbingTheLeaderboard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> ranked = new ArrayList<>();
        ranked.add(100);
        ranked.add(90);
        ranked.add(90);
        ranked.add(80);

        List<Integer> player = new ArrayList<>();
        player.add(70);
        player.add(80);
        player.add(105);

        int rankedSize = ranked.size();
        int playerSize = player.size();
        int[] scores = new int[rankedSize];
        int[] alice = new int[playerSize];


        for (int i=0;i< rankedSize;i++){
            scores[i] = ranked.get(i);
        }

        for (int i=0;i< playerSize;i++){
            alice[i] = player.get(i);
        }


        int res[] = new int[playerSize];
        int[] rank = new int[rankedSize];
        rank[0] = 1;

        for (int i = 1; i < rankedSize; i++) {
            if (scores[i] == scores[i - 1]) {
                rank[i] = rank[i - 1];
            } else {
                rank[i] = rank[i - 1] + 1;
            }
        }

        for (int i = 0; i < playerSize; i++) {
            int aliceScore = alice[i];
            if (aliceScore > scores[0]) {
                res[i] = 1;
            } else if (aliceScore < scores[rankedSize - 1]) {
                res[i] = rank[rankedSize - 1] + 1;
            } else {
                int index = binarySearch(scores, aliceScore);
                res[i] = rank[index];

            }
        }

        System.out.println(res);
        //return res;

    }

    private static int binarySearch(int[] a, int key) {

        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key && key < a[mid - 1]) {
                return mid;
            } else if (a[mid] > key && key >= a[mid + 1]) {
                return mid + 1;
            } else if (a[mid] < key) {
                hi = mid - 1;
            } else if (a[mid] > key) {
                lo = mid + 1;
            }
        }
        return -1;
    }



}
