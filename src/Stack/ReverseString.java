package Stack;
/**
 * Get Error: Time Limit Exceeded
 */
import java.util.LinkedList;

public class ReverseString {
    public static void main( String [] args ){
        
        System.out.println(reverseString3("A man, a plan, a canal: Panama"));
        
    }
    
    public static String reverseString3(String s){
        
        if( s == null || s.length() == 0 ){
            return "";
        }
        
        char[] reverse = new char[s.length()];
        
        for(int i = s.length() - 1; i >= 0; i--){
            reverse[s.length() - 1 - i ] = s.charAt(i);
        }
        
        return new String(reverse);
    }
    
    
    public static String reverseString2(String s){
        String result = "";
        char[] ch = s.toCharArray();
        
        for( int i = ch.length - 1; i >= 0; i--){
            result += ch[i];
        }
        
        return result;
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
