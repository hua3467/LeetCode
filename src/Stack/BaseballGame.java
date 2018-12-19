package Stack;
/**
 *
 * @author aaronyang
 */
public class BaseballGame {
    
    public static void main( String [] args ){
        
        String[] str = {"5","2","C","D","+"};
        
        System.out.println( calPoints(str));
    }
    
    public static int calPoints(String[] ops){
        int sum = 0;
        int temp = 0;
        for( int i = 0; i < ops.length; i++ ){
            
            if(ops[i].equals("C")){
                ops[i-1] = "0";
            } else if( ops[i].equals("D") ){
                temp = Integer.parseInt(ops[i-1]);
            }
            sum += Integer.parseInt(ops[i]);
        }
        
        return sum;
    }
    
}
