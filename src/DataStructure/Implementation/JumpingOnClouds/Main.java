package DataStructure.Implementation.JumpingOnClouds;

public class Main {

    public static void main(String[] args) {

        int[] c = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        int k = 3;
        int energy = 100;
        int i = 0;

        do {
            i = (i + k) % c.length;
            energy -= c[i] == 1 ? 3 : 1;

        }while (i > 0);

        System.out.println(energy);

    }
}
