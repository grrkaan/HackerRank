package DataStructure.Implementation.DesignerPdf;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        List<Integer> h = new ArrayList<>();
        h.add(1);
        h.add(3);
        h.add(1);
        h.add(3);
        h.add(1);
        h.add(4);
        h.add(1);
        h.add(3);
        h.add(2);
        h.add(5);
        h.add(5);
        h.add(5);
        h.add(5);
        h.add(1);
        h.add(1);
        h.add(5);
        h.add(5);
        h.add(1);
        h.add(5);
        h.add(2);
        h.add(5);
        h.add(5);
        h.add(5);
        h.add(5);
        h.add(5);
        h.add(5);

        String word = "torn";
        int wordLength = word.length();
        char[] wordArr = new char[wordLength];
        int tallestValue = 0;

        for (int i=0; i < wordLength; i++){
            wordArr[i] = word.charAt(i);
        }

        for (int j = 0; j < wordArr.length;j++){

            int index = alphabet.indexOf(wordArr[j]);
            int value = h.get(index);

            if(value > tallestValue){
                tallestValue = value;
            }

        }

        int result = wordLength * tallestValue;
        System.out.println(result);

    }
}
