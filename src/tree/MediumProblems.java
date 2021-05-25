package tree;

import java.util.Map;
import java.util.TreeMap;

public class MediumProblems {

//    Alice has a hand of cards, given as an array of integers.
//
//    Now she wants to rearrange the cards into groups so that each group is size W, and consists of W consecutive cards.
//
//    Return true if and only if she can.

    public static void main(String[] args) {
//        int[] hand = {1,2,3,6,2,3,4,7,8};
        int[] hand = {1,2,3,4,5};
        System.out.println(isNStraightHand(hand, 4));
    }

    static public boolean isNStraightHand(int[] hand, int W) {
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        for(int i: hand) {
            if(treeMap.containsKey(i)){
                treeMap.put(i,treeMap.get(i)+1);
            }else {
                treeMap.put(i,1);
            }
        }
        for(Map.Entry<Integer, Integer> i:treeMap.entrySet()){
            System.out.println(i );

        }
        while(treeMap.size()>0){
            int first= treeMap.firstKey();
            for(int card= first; card<first+W; card++){
                if(!treeMap.containsKey(card)) return false;

                if(treeMap.get(card) ==1) treeMap.remove(card);
                else{
                    treeMap.replace(card,treeMap.get(card)-1);
                }
            }
        }

        return true;

    }

}
