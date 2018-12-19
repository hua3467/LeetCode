package Stack;
import java.util.LinkedList;
/**
 *
 * @author aaronyang
 */
public class ReverseInteger {
    public static void main(String[] args ){
        
        System.out.println(reverse(153423646));
    }
    
    public static int reverse(int x){
        
        LinkedList<Integer> stack = new LinkedList<>();
        
        int count = 0;
        
        while ( Math.abs(x) > 0 ){
            stack.push( x % 10 );
            x = x / 10;
            count++;
        }
        
        for(int i = 0; i < count; i++){
            x += stack.pop() * Math.pow(10, i);
        }
        
        if( x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE )
            return 0;
        else 
            return x;
    }
}