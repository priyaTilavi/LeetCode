import javafx.util.Pair;

import java.util.Stack;

public class RemoveAllAdjacent {

    public String removeDuplicates(String s, int k) {
        Stack<Pair<Character,Integer>> stack = new Stack<Pair<Character, Integer>>();
        for(Character c:s.toCharArray()){
            if(stack.isEmpty() || c!=stack.peek().getKey()){
                Pair pair = new Pair(c, 1);
                stack.push(pair);
            } else {
                Pair<Character, Integer> pop = stack.pop();
                stack.push(new Pair(pop.getKey(),pop.getValue()+1));
                if(stack.peek().getValue()==k){
                    stack.pop();
                }
            }
        }
        StringBuffer sb = new StringBuffer();
       while(!stack.isEmpty()){
           Pair<Character, Integer> pop = stack.pop();
           Integer i = pop.getValue();
           while(i>0){
               sb.append(pop.getKey());
               i--;
           }
       }
       return String.valueOf(sb.reverse());
    }
}
