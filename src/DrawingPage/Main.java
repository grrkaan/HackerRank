package DrawingPage;

/*
A teacher asks the class to open their books to a page number.
A student can either start turning pages from the front of the book or from the back of the book.
They always turn pages one at a time.  When they open the book, page
Find the min turn page size.
*/
public class Main {

    public static void main(String[] args) {

        int n = 5; //Number of pages in book.
        int p = 4; //The page number to turn to .
        int result = 0;
        int flagFront = 1;
        int flagBack = n;
        int resultFront = 0;
        int resultBack = 0;
        int middle = n /2;

        if (p == 1 || p == n || p == n - 1) {
            //return result;
            System.out.println(result);
        }

        if(middle > p) {

            //For the front side
            while (flagFront <= n){

                flagFront += 2;
                resultFront++;
                if(flagFront == p || flagFront - 1 == p){
                    break;
                }

            }


        }else {

            while (flagBack >= 1){

                flagBack -= 2;
                resultBack++;
                if(flagBack == p || flagBack + 1 == p){
                    break;
                }

            }

        }

        if(resultFront > 0){
            System.out.println(resultFront);
           // return resultFront;
        }else if(resultBack > 0){
            System.out.println(resultBack);
            //return resultBack;
        }

    }
}
