package DataStructure.Implementation.FindDigits;

public class Main {

    public static void main(String[] args) {

        int n = 1012;
        int res = 0;
        int temp = n;

        while (((double) temp / 10) > 0) {

            int x = temp % 10;
            if (x > 0 && n % x == 0) {
                res++;
            }
            temp = temp / 10;
        }
        System.out.println(res);

    }
}
