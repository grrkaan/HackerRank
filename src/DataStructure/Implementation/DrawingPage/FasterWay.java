package DataStructure.Implementation.DrawingPage;

public class FasterWay {

    public static void main(String[] args) {

        int n = 5; //Number of pages in book.
        int p = 4; //Asked book page number.

        double pageTurns =  Math.floor(p / 2);
        double totalTurns = Math.floor(n / 2);
        double result = Math.min(pageTurns, totalTurns-pageTurns );
        int min = (int) result;
        System.out.println(min);
        //return Math.min(pageTurns, totalTurns-pageTurns );

    }
}
