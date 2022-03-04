package DataStructure.Implementation.BeautifulDaysAtTheMovies;

public class Main {

    public static void main(String[] args) {

        int i = 20; //the starting day number
        int j = 23; //the ending day number
        int k = 6; //the divisor

        int reverse = 0;
        int bDay = 0;


        for (; i <= j; i++) {
            reverse = reverseNumber(i);
            if ((Math.abs(i - reverse)) % k == 0) {
                bDay++;
            }
        }

        //return bDay;


    }


    public static int reverseNumber(int temp) {

        int reverse = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }

        return reverse;
    }

}
