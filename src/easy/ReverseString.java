package easy;
/**
 * Get Error: Time Limit Exceeded
 */
import java.util.LinkedList;

public class ReverseString {
    public static void main( String [] args ){
        
        System.out.println(reverseString("A man, a plan, a canal: Panama"));
        
    }
    
    public static String reverseString(String s) {
        
        LinkedList stack = new LinkedList();
        
        for(int i = 0; i < s.length(); i ++ ){
            stack.push(s.charAt(i));
        }
        
        String str = "";
        
        for(int i = 0; i < s.length(); i++ ){
            str += stack.pop();
        }
        
        return str;
    }
}
