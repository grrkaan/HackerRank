package DataStructure.Implementation.CatsAndMouse;

public class Main {

    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        int z = 3;

        int firstCatDist = Math.abs(x - z);
        int secondCatDist = Math.abs(y - z);

        if(firstCatDist == secondCatDist){
            System.out.println("Mouse C");
        }else if(firstCatDist > secondCatDist){
            System.out.println("Cat B");
        }else {
            System.out.println("Cat A");
        }


    }

}
