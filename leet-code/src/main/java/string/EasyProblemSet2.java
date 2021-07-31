package string;

import com.sun.deploy.util.StringUtils;

import java.util.*;

public class EasyProblemSet2 {
    public static void main(String[] args) {
        System.out.println(findLengthOfLastWord("Hi my name is Priya"));
        System.out.println(reverseStringUsingStack("abcdefg"));
        System.out.println(reverseString("abcdefg"));
        String[] input= {"bce","bceee","bcry","bc"};
        System.out.println("longest prefix:"+longestCommonPrefix(input));
        String s= "abc";
        System.out.println("test:"+s.indexOf("abc"));
    }

    public static int findLengthOfLastWord(String s){
        int length = s.length();int i=0; int count=0;
        while(i<length){
            if(s.charAt(i)!= ' '){
                i++;count++;
            } else {
                while(i<length && s.charAt(i)==' ') i++;
                if(i==length) return count;
                else count=0;
            }
        }
        return count;
    }
//Space = O(n) and time = O(n)
    public static String reverseStringUsingStack(String s){
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()) stack.push(c);
        StringBuilder builder = new StringBuilder();
        Iterator<Character> itr= stack.iterator();
        while (itr.hasNext()){
            builder.append(stack.pop());
        }
        return String.valueOf(builder);
    }
    public static String reverseString(String s){
        char[] reversed = s.toCharArray();
        for(int start=0, end=s.length()-1;start<=end; start++,end--){
            char temp = reversed[start];
            reversed[start]= reversed[end];
            reversed[end]= temp;
        }
        return String.valueOf(reversed);
    }
    public String reverseOnlyLetters(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] reversed = s.toCharArray();
        while (start < end) {
            Character startChar = reversed[start];
            Character endChar = reversed[end];
            if (!Character.isLetter(startChar)){
                start++;
            }
            if (!Character.isLetter(endChar)){
                end--;
            }
            if(Character.isLetter(startChar) && Character.isLetter(endChar)){
                Character temp= reversed[start];
                reversed[start] = reversed[end];
                reversed[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(reversed);
    }

    public String longestCommonPrefix1(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }
    public void test(){
        HashMap<Character,Integer> map= new HashMap<>();
        map.put('a',1);
    }
    public static String longestCommonPrefix(String[] input){
//        String shortestString = findShortestString(input);
        StringBuilder builder= new StringBuilder("");
        for(int j=0;j<input[0].length();j++){
            char c = input[0].charAt(j);
            for(int i=1;i<input.length && j<input[i].length(); i++){
                if(c != input[i].charAt(j)) return builder.toString();
            }
            builder.append(c);
        }
        return String.valueOf(builder);
    }

    private static String findShortestString(String[] input) {
        String shortest= input[0];
        for(int i=0;i<input.length; i++){
            if(input[i].length()<shortest.length()) {
                shortest=input[i];
            }
        }
        return shortest;
    }
    public List<String> fizzBuzz(int n) {
        ArrayList<String> output = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%3==0) {
                output.add("Fizz");
            } else if(i%5==0) {
                output.add("Buzz");
            } else if(i%15==0) {
                output.add("FizzBuzz");
            } else{
                output.add(String.valueOf(i));
            }
        }
        return output;
    }
    public boolean isIsomorphic(String s, String t) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!list.contains(c)) {
                list.add(c);
                char c1 = t.charAt(i);
                t=t.replaceAll(String.valueOf(c1),String.valueOf(c));
            }
        }
        System.out.println(s+":"+t);
        return (t.equals(s));
    }

}
