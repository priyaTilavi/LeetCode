package string;

import java.util.HashMap;
import java.util.Map;


public class JewelsAndStones {
   /* You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

    The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

    Example 1:

    Input: J = "aA", S = "aAAbbbb"
    Output: 3
    */

    public static void main(String[] args) {
        JewelsAndStones jewelsAndStones= new JewelsAndStones();
        System.out.println("==>"+ jewelsAndStones.numJewelsInStones("aA","aAAbbbb"));

    }
    public int numJewelsInStones(String J, String S) {
        char[] a= S.toCharArray();
        int count=0;
        //Map<Character, Integer> map= new HashMap<>();

        for(Character inc:a){
            if(J.contains(inc+""));{
                //map.put()
                count++;
            }
        }
        return count;
    }

}
