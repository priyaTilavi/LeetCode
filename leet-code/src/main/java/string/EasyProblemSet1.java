package string;


import java.util.*;

public class EasyProblemSet1 {
    public static void main(String[] args) {
        EasyProblemSet1 easyProblemSet1 = new EasyProblemSet1();
        //Problem 1: Jewels and stone
//        System.out.println("==>"+ easyProblemSet1.numJewelsInStones("aA","aAAbbbb"));
        //Problem 2: Number of Steps to Reduce a Number to Zero
//        System.out.println(easyProblemSet1.numberOfSteps(14));
//        System.out.println(easyProblemSet1.minSteps("leetcode","practice"));
        System.out.println(countingValleys(8,"UDDDUDUU"));
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0}));
        System.out.println(repeatedString("aba",10));
        System.out.println(removeDuplicates(new int[]{1,1,2}));

    }

    /* You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
        The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
        Input: J = "aA", S = "aAAbbbb"
        Output: 3
    */
    private int numJewelsInStones(String j, String s) {
        int count=0;
        for(Character c: s.toCharArray()){
            if(j.contains(c.toString())){
                count++;
            }
        }
        return count;
    }

//    Given a non-negative integer num, return the number of steps to reduce it to zero.
//    If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

    private int numberOfSteps (int num) {
        int numberOfSteps = 0;
        while(num!=0){
            num = num%2==0 ? num /2 : num-1;
            numberOfSteps++;
        }
        return numberOfSteps;
    }
//Given two equal-size strings s and t. In one step you can choose any character of t and replace it with another character.
//Return the minimum number of steps to make t an anagram of s.

    public int minSteps(String s, String t) {
        //find common letters
//        List<Character> listS = new ArrayList<>();

        for(Character c: t.toCharArray()){
            if (s.contains(c.toString())) {
               s = s.substring(0,s.indexOf(c.toString())) + s.substring(s.indexOf(c.toString())+1);
            }
        }
        return s.length();
        //ans: is diffrenece betweeen two words
    }
    public int minSteps2(String s, String t) {
        //find common letters
        //ans: is diffrenece betweeen two words
        int[] ss = new int[26];
        int[] tt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ss[s.charAt(i) - 'a']++;
            tt[t.charAt(i) - 'a']++;
        }

        int r = 0;
        for (int i = 0; i < 26; i++) {
            r += Math.abs(ss[i] - tt[i]);
        }
        return r / 2;
    }
    public int numSquares(int num) {
        int temp=0;

       for(int i=0;i<temp&& temp!=0 ;i++){
           temp= (int) Math.floor(Math.sqrt(num));

       }
        return temp;
    }

    // find no of valley Example path ='UDDDUDUU'
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int count =0;
        int valley=0;
        char[] charAr = path.toCharArray();

        for(int i=0;i<charAr.length;i++){
            if(charAr[i] == 'U') count +=1;
            else count -=1;

            if(count == 0 && charAr[i]=='U'){
                valley+=1;
                count = 0;
            }
        }
        return valley;
    }

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int count=0;
        //0 0 1 0 0 1 0
        int i=0;
        for(;i<c.length-2;){
            if(c[i+2]!=1){
                i+=2;
            }
            else{
                i+=1;
            }
            count++;
        }
        if(i==c.length-2) {
            i++;
            count++;
        }

    return count;
    }
    static int sockMerchant(int n, int[] ar) {
       Map<Integer,Integer> map= new HashMap<>();
       int count=0;
        for(int i=0;i<n;i++){
          if(map.containsKey(ar[i])){
              map.remove(ar[i]);
              count++;
          }
          else{
              map.put(ar[i],1);
          }
        }
        Arrays.sort(new int[]{4,5,7});
       return count;
    }

    static long repeatedString(String s, long n) {
        if(s.length()==1 && s.charAt(0)=='a') return n;
        int count=0;
        double length= (double) s.length();
        for(char c: s.toCharArray()){
            if(c=='a') count++;
        }
        double ceil = Math.ceil(count * n / length);
        return ((int) ceil);
    }

    public static int removeDuplicates(int[] nums) {
        int dup=0;

        for(int i=0;i<nums.length-dup-1;){
            if(nums[i]==nums[i+1]){
                for(int j=i+1;j<nums.length-1;j++){
                    nums[j]= nums[j+1];
                }
                dup++;
            }
            else
                i++;

        }
        return nums.length-dup;
    }
    public char nextGreatestLetter(char[] letters, char target) {
        int[] arr= new int[26];
        for(char c:letters){
            arr[c- 'a']= 1;
        }
        int index= target- 'a';
        while(arr[index]!=1 && index<26){
            index++;
        }
        System.out.println(index);

        return (char) ('a' + index);

    }
    public boolean lemonadeChange(int[] bills) {
       int five=0;int ten=0;
        for(int i=0;i<bills.length;i++){
           if(bills[i]==5) five++;
            if(bills[i]==10){
               if(five<=0) return false;
               else five--;
               ten++;
            }
            if(bills[i]==20){
                if(five>0 && ten>0) {
                    five--;
                    ten--;
                }
                if(five>=3){
                   five+=3;
                }
            }
        }
        return true;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] res= new int[nums1.length];
        List<Integer> list= new ArrayList<>();
        for(int a:nums2) list.add(a);

        for(int i=0;i<nums1.length;i++){

        }
        return res;
    }

}
