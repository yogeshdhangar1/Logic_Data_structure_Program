import java.util.Stack;
import static java.lang.Long.reverse;
public class ReverseString {
    // Reverse a string using a stack container in Java
    public static String reverse(String str)
    {
        // create an empty stack
        Stack<Character> stack = new Stack<>();
        // push each character in the string into the stack
        char[] chars = str.toCharArray();
        for (char c: chars) {
            stack.push(c);
        }
        // pop all characters from the stack and
        // put them back to the character array
        for (int i = 0; i < str.length(); i++) {
            chars[i] = stack.pop();
        }

        // convert the char array to a string and return
        return new String(chars);
    }
    public static void main (String[] args)
    {
        String str = "Reverse me";
        str = reverse(str);
        System.out.println(str);
    }
}