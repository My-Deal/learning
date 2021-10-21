package javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ProvarTest {

    public static String MultipleBrackets(String str) {
        int count = 0;
        int status = -1;

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketsMap = Map.of(')', '(',']', '[','}', '{');

        for (int i = 0; i < str.length(); i++) {
            char nextChar = str.charAt(i);

            if (nextChar == '(' || nextChar == '{' || nextChar == '[') {
                stack.push(nextChar);
            }

            if (nextChar == ')' || nextChar == '}' || nextChar == ']') {
                char popChar = stack.pop();
                if (popChar == bracketsMap.get(nextChar)) {
                    count++;
                    status = 1;

                } else {
                    status = 0;
                    break;
                }
            }
        }
        if(!stack.empty()){
            status=0;
        }
        str = status + "";
        if (status == 1 && count > 0) {
            str = str + " " + count;
        }
        return str;
    }

    public static void main(String[] args) {
        String case1="(hello [world])(!)";
        String case2="((hello [world])";
        System.out.println(MultipleBrackets(case1));
        System.out.println(MultipleBrackets(case2));
        System.out.println(MultipleBrackets("(a)["));
    }
}