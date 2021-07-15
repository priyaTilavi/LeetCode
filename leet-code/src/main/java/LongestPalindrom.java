import com.sun.deploy.util.StringUtils;

public class LongestPalindrom {
    public String longestPalindrome(String s) {
        if(s.length()==1 || s.equals("")){
            return s;
        }
        String possiblePalindrome="";
        for(int start=0;start<s.length();start++){
            for(int end=s.length()-1;end>=start;end--){
                String substring = s.substring(start, end + 1);
                if(possiblePalindrome.length()<substring.length() && isPalindrome(substring)){
                    possiblePalindrome= substring;
                    break;
                }
            }

        }
        return possiblePalindrome;
    }

    public boolean isPalindrome(String s){
        int start=0;
        int end = s.length()-1;
        while(end>start){
            if(s.charAt(start)!= s.charAt(end)){
                return false;
            } else{
                 start++;
                 end--;
            }
        }
        return true;
    }
}
