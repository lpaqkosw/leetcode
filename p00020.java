import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class p00020 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        Map<Character,Character> dict = new HashMap<Character,Character>();
        dict.put(')', '(');
        dict.put('}', '{');
        dict.put(']', '[');
        for(int i = 0; i < s.length();i++){
            char x = s.charAt(i);
            if(x == '(' || x == '{' || x == '['){
                stack.push(x);
            } else{
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek() == dict.get(x)){
                    stack.pop();
                } else{
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "()";
        // String s = "()[]{}";
        // String s = "([)]";
        // String s = "{[]}";
        System.out.println(isValid(s));
    }
}
