/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaronyang
 */
public class RomanToInteger {
    
    public static void main(String[] args) {
        
        RomanToInteger rt = new RomanToInteger();
        System.out.println(rt.romanToInt("IVX"));
        
    }
    
    public  int romanToInt(String s) {

        int answer = 0;

        for(int i = 0; i < s.length(); i++){
            
            int s1 = value(s.charAt(i));
            
            if( i + 1 < s.length()){
                int s2 = value(s.charAt(i+1));
                if(s1>=s2)
                    answer += s1;
                else{
                    answer = answer + s2 - s1;
                    i++;
                }
            }else{
                answer += s1;
                i++;
            }
            
        }
        return answer;
    
    }

    public int value(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return -1;
    }
}

