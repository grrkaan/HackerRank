package DataStructure.String.SuperReducedString;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        String s = "aaabccddd";
        String result = "";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (!stack.isEmpty() && ch == stack.peek()) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        if (stack.isEmpty()) {
            //return "Empty String";
            System.out.println("Empty String");
        } else {
            for (char ch : stack) {
                result += ch;
            }
            System.out.println(result);
            //return result;
        }


    }


}
