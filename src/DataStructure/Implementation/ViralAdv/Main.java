package DataStructure.Implementation.ViralAdv;

public class Main {

    public static void main(String[] args) {

        int n = 5;
        int p = 5;
        int result = 0;
        int x = 3;

        for (int i=0; i < n; i++){

           int a = (int) Math.floor(p / 2);
           result += a;
           p = x * a;

        }


        System.out.println(result);
        //return result;



    }
}
