public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord word = new LengthOfLastWord();
        
        System.out.println(word.lengthOfLastWord("   Hello, this is a test   "));
    }
    
    public int lengthOfLastWord(String s) {

        int length = 0;
        
        if(s==null || s.isEmpty())
            return length;
        
        s = s.trim();
        
        for(int i = s.length() - 1; i >= 0; --i){
            if(!(s.charAt(i) == ' '))
                break;
            length++;
        }
        return length;
    }
}
