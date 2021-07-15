import javafx.util.Pair;

import java.util.*;

public class MediumProblemSet1 {

    public String intToRoman(int num) {
        String output="";
        Map<Integer,String> map = new HashMap();
        Stack<String> stack = new Stack<String>();
        setup(map);
        int number= num;
        String s = num + "";
        int level = s.length()-1;
        int remainder=0;
        while (number>0){
            int pow = (int) Math.pow(10, level);
            remainder = number%pow;
            int key = number / pow - remainder ;
            if(map.containsKey(key)){
                output+=map.get(key);
            }
            number = remainder;
        }

        return output;
    }
    private void setup(Map<Integer, String> map) {
        map.put(1,"I");
        map.put(5,"V");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");
    }


    //Determine if a 9 x 9 Sudoku board is valid
    public boolean isValidSudoku(char[][] board) {

        for(int i=0;i<board.length;i++){
            return validateSubset(board[i]);
        }

        return true;
    }

    private boolean validateSubset(char[] board){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int j=0;j<board.length;j++){
            char c = board[j];
            int i1 = getDefaultValueInMap(map, c);
            if(!Character.isDigit(c) && c!='.'|| i1>0){
                return false;
            }
            if(c!='.'){
                map.put(c,i1+1);
            }
        }

        return true;
    }

    private int getDefaultValueInMap(Map<Character, Integer> map, char c) {
        return map.get(c) != null && map.containsKey(c) ? map.get(c) : 0;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-1;i++){
            int temp = nums[i]+nums[i+1];
//            for(){
//
//            }

        }
        return result;
    }

    public int romanToInt(String s) {
        Map<Character, Integer> lookup = setup();
        int add=0;
        for(Character c:s.toCharArray()){
            add+=lookup.get(c);
        }
        return add;
    }

    private Map<Character,Integer> setup() {
        HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
//        Map<Character, Pair<Integer, Boolean>> map= new HashMap<Character, Pair<Integer, Boolean>>();
//        map.put('I',new Pair(1,true));
//        map.put('V',new Pair(5,false));
//        map.put('X',new Pair(10,true));
//        map.put('L',new Pair(50,false));
//        map.put('C',new Pair(100,true));
//        map.put('D',500);
//        map.put('M',1000);
        return map;
    }
    public int removeElement(int[] nums, int val) {
        int write=0;

        for(int i =0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[write]= nums[i];
                write++;
            }
        }
        return write;
    }
}
