package DataStructure.String.StrongPass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        int result = 0;
        char ch;
        String password = "4700";
        Boolean uppercase = false;
        Boolean length = false;
        Boolean lowercase = false;
        Boolean digit = false;
        Boolean special = false;


        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = pattern.matcher(password);
        special = matcher.find();

        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                digit = true;
            }
            if (Character.isUpperCase(ch)) {
                uppercase = true;
            }
            if (Character.isLowerCase(ch)) {
                lowercase = true;
            }

        }

        if (!digit) {
            result += 1;
        }
        if (!lowercase) {
            result += 1;
        }
        if (!uppercase) {
            result += 1;
        }
        if (!special) {
            result += 1;
        }

        int x = password.length() + result;

        if(x < 6){
            int dif = 6 - x;
            result += dif;
        }

        System.out.println(result);
        //return result;
    }
}
