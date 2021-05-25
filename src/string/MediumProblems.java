package string;

import java.util.*;

public class MediumProblems {
    public static void main(String[] args) {

        System.out.println( sherlockAndAnagrams("abba"));
        Scanner sc= new Scanner(System.in);
        int[][] arr = new int[6][6];
         arr[0] = new int[]{1, 1, 1, 0, 0, 0};
         arr[1] = new int[]{0, 1, 0, 0, 0, 0};
         arr[2] = new int[]{1, 1, 1, 0, 0, 0};
         arr[3] = new int[]{0, 0, 2, 4, 4, 0};
         arr[4] = new int[]{0, 0, 0, 2, 0, 0};
         arr[5] = new int[]{0, 0, 1, 2, 4, 0};
        System.out.println("sum"+findSumOfHourglass(arr));
        System.out.println(checkRecord("PPALLL"));
    }

    static int sherlockAndAnagrams(String s) {
        int results=0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                char[] chars = s.substring(i, j + 1).toCharArray();
                Arrays.sort(chars);
                String substring = new String(chars);
                if (map.containsKey(substring)) {
                    map.put(substring, map.get(substring) + 1);
                } else {
                    map.put(substring, 1);
                }
            }
        }
        for(String str: map.keySet()){
            int val = map.get(str);
            results += (val * (val-1))/2;
        }
        return results;
    }
    //Given two strings, determine if they share a common substring
    static String twoStrings(String s1, String s2) {
        for(int i=0;i<s1.length();i++) {
            for (int j = i; j < s1.length(); j++) {
                String substring = s1.substring(i, j + 1);
                if(s2.contains(substring)){
                    return "YES";
                }
            }
        }

        for(int i=0;i<s1.length();i++) {
            String substring = s1.substring(i, i + 1);
        }
        return "NO";

    }

    //Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum. - hackerrank

    public static int findSumOfHourglass(int[][] arr){
        int row = arr.length;
        int max=0;
        for(int i=0;i<row-2;i++)
        {
            for(int k=0;k<row-2;k++){
                int sum=0;
                sum = arr[i][k]+arr[i][k+1]+ arr[i][k+2]+ arr[i+1][k+1]+ arr[i+2][k]+ arr[i+2][k+1] + arr[i+2][k+2];
                max= Math.max(max,sum);
            }
        }
        return max;
    }
    public static boolean checkRecord(String s) {
        int a=0;int l=0;
//        List<Character> list = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='A'){
                a++;
                if(a>1) return false;
            }
            if(c=='L'){
                char top = !stack.empty() ? stack.pop() : 'x';
                char second= !stack.empty()? stack.pop() :'x' ;
                if(top=='L' && second=='L') return false;
                else {
                    if(second!='x')stack.push(second);
                    if(top!='x') stack.push(top);
                }
            }
            stack.push(c);
        }
        return true;
    }


}
