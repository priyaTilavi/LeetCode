public class StringToInteger {

    public int myAtoi(String s) {
        s= s.trim();
        int multiplier = 1;
        long result=0;
        if(s.equals("")) return 0;
        if (s.charAt(0) == '-') {
            multiplier =-1;
            s= s.substring(1);
        }
        else if (s.charAt(0) == '+') {
            s= s.substring(1);
        }

        for(Character c: s.toCharArray()) {
            if(Character.isLetter(c) || !Character.isLetterOrDigit(c)){
                return ((int) result * multiplier);
            }
            if(Character.isDigit(c)) {
                result = (result * 10) + Integer.parseInt(c.toString()) ;
            }
            if(result>(int)Math.pow(2, 31) ) {
                int maxInt = (int) Math.pow(2, 31);
                if(multiplier==-1) return -1 * maxInt -1;
                return maxInt;
            }
        }
        result*=multiplier;
        return (int) result;
    }

}
