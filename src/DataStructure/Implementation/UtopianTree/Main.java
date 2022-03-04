package DataStructure.Implementation.UtopianTree;

public class Main {

    public static void main(String[] args) {

        int n = 5;
        int result = 1;

        if(n == 0){
            System.out.println(result);
            //return result;
        }

        for(int i = 1; i < n + 1;i++){

            if(i % 2 == 0){
                result += 1;
            }

            if (i % 2 == 1){
                result = result * 2 ;
            }

        }

        System.out.println(result);


    }

}
