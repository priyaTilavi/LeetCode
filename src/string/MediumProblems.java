package string;

import java.util.*;

public class MediumProblems {
    public static void main(String[] args) {

//        System.out.println( sherlockAndAnagrams("abba"));
        Scanner sc= new Scanner(System.in);
        int[][] arr = new int[6][6];
         arr[0] = new int[]{1, 1, 1, 0, 0, 0};
         arr[1] = new int[]{0, 1, 0, 0, 0, 0};
         arr[2] = new int[]{1, 1, 1, 0, 0, 0};
         arr[3] = new int[]{0, 0, 2, 4, 4, 0};
         arr[4] = new int[]{0, 0, 0, 2, 0, 0};
         arr[5] = new int[]{0, 0, 1, 2, 4, 0};
//        System.out.println("sum"+findSumOfHourglass(arr));
//        System.out.println(checkRecord("PPALLL"));
        MediumProblems mediumProblems = new MediumProblems();
//        System.out.println("calculate:"+ mediumProblems.evalRPN(new String[]{"2","1","+","3","*"}));
//        System.out.println("int:"+ (2%26));
////        System.out.println("int:"+ (28/26));
//        System.out.println("int:"+ (char)((27%26)+64));
//        System.out.println("convert to title:"+ mediumProblems.convertToTitle(28));
//        System.out.println(mediumProblems.validPalindrome2("aydmda"));
//        System.out.println(mediumProblems.canJump(new int[]{3,2,1,0,4}));
//        System.out.println(mediumProblems.findReplaceString("abcd",new int[]{0,2},new String[]{"a","cd"},new String[]{"eee","ffff"}));
            mediumProblems.printPath();

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
    //Evaluate the value of an arithmetic expression in Reverse Polish Notation.(post order)
//    Input: tokens = ["2","1","+","3","*"]
//    Output: 9
//    Explanation: ((2 + 1) * 3) = 9

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();
        for(String s:tokens){
            if(s=="+"|| s=="-"|| s=="*"|| s=="/"){
                int v2= stack.peek();
                stack.pop();
                int v1= stack.peek();
                stack.pop();
               if(s=="-"){
                   stack.push(v1 - v2);
               }else if(s=="+"){
                   stack.push(v1 + v2);
               }else if(s=="*"){
                   stack.push(v1 * v2);
               }
               else if(s=="/"){
                   stack.push(v1 / v2);
               }
            } else{
                stack.push(Integer.parseInt(s));
            }
        }
//        System.out.println("calculate:"+ stack.peek());
        return stack.peek();
    }

    public int titleToNumber(String columnTitle) {
        int ans=0;
        long power=1;
        for(int i=columnTitle.length()-1;i>=0;i--){
            int value=columnTitle.charAt(i)- 64;
            ans= (int) (ans+ value*power);
            power*= 26;
        }
        return ans;
        
    }
    public String convertToTitle(int columnNumber) {
        int remainder=columnNumber;
        StringBuilder builder= new StringBuilder();
        while(columnNumber>0){
            remainder = columnNumber % 26;
            char c = (char) ((remainder) + 64);
            builder.append(c);
            columnNumber=columnNumber/26;
        }
        return String.valueOf(builder.reverse());
    }
    public boolean validPalindrome(String s){
        for(int start=0,end=s.length()-1;start<=end;start++,end--){
            if(s.charAt(start)!= s.charAt(end)) return false;
        }
        return true;
    }
    public boolean validPalindrome2(String s) {
        for(int start=0,end=s.length()-1;start<=end;start++,end--){
            if(s.charAt(start)!= s.charAt(end)) {
                return validPalindrome(s.substring(start+1,end+1)) || validPalindrome(s.substring(start,end));
            }
        }
        return true;
    }
    public String convert(String s, int numRows) {
       String[] rows= new String[numRows];
        int row=0;
        int step=1;
        String result="";
        for(int k=0;k<numRows;k++){
            rows[k]="";
        }
        for(int j=0;j<s.length();j++){
            rows[row]+= s.charAt(j);
            if(row==0) step=1;
            if(row==numRows-1) step=-1;

            row= row+step;
        }
        for(int k=0;k<numRows;k++){
            result+=rows[k];
        }

        return result;
    }
    public boolean canJump(int[] nums) {
        int goodIndex=nums.length-1;
        for(int i= nums.length-2;i>=0;i--){
            if(i+nums[i]>=goodIndex) goodIndex= i;
        }
        if(goodIndex==0) return true;
        return false;
    }
    public String findReplaceString(String s, int[] indexes, String[] sources, String[] targets) {Arrays.sort(indexes);
        String result= "";
        List<String> list = new ArrayList<>();
        int offset=0;
        for(int i=0,k=0;i<s.length();i+=offset){
            offset=0;
            if(k<indexes.length && i==indexes[k]){
                String source = sources[k];
                String substring = s.substring(i, i+source.length());
                if(substring.equals(source)){
                   list.add(targets[k]);
                   offset=targets[k].length();
                }
                k++;
            }
            else list.add(String.valueOf(s.charAt(i)));
        }
        for(String str: list){
            result += str;
        }

        return result;
    }

    public void printPath(){
        LinkedList<String> linkedList = new LinkedList<>();
        String pwd="/a/b/c";
        String cd = "/.";
        for(String s:pwd.split("/")){
            if(!s.isEmpty()) linkedList.add(s);
        }
        for(String n: cd.split("/")){
            if(n.equals(".."))
                linkedList.removeLast();
            else if(n.equals(".")) {
            }
            else {
                linkedList.add(n);
            }
        }
        for(String temp:linkedList){
            System.out.print("/"+temp);
        }
    }

    public String longestPalindrome(String s) {

        return "";
    }

}
