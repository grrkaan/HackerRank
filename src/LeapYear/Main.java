package LeapYear;

public class Main {


    public static void main(String[] args) {

        int year = 2400;
        String result = "";


        if(year < 1918){

            if(year % 4 == 0){
                result = "12.09."+year;
            }else {
                result = "13.09."+year;
            }

        }else if(year == 1918){

            result = "26.09.1918";

        }else if(year > 1918){

            if(year % 400 == 0) {
                result = "12.09."+ year;
            }else if(year % 4 == 0 && year % 100 != 0){
                result = "12.09."+year;
            }else {
                result = "13.09."+year;
            }

        }

        System.out.println(result);

    }
}
