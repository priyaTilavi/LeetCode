import com.sun.source.tree.Tree;
import javafx.util.Pair;

import java.util.*;

public class Util {

    public static void main(String[] args) {

        //linked list
        LinkedList<Integer> ls= new LinkedList<>();
        ls.add(3);
        ls.add(5);
        ls.addLast(4);
        ls.addFirst(1);

        for(Integer i:ls) System.out.println(i);

        //Hash Map
        HashMap<Integer,String> map = new HashMap<>();
        map.put(2, "Priya");
        map.put(1, "Nisha");
        map.put(7, "Neha");

        //Tree Map
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2, "Priya");
        treeMap.put(1, "Nisha");
        treeMap.put(7, "Neha");

        //Linked Map
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(2, "Priya");
        linkedMap.put(1, "Nisha");
        linkedMap.put(7, "Neha");


        //queue
        Queue<Integer> queue = new LinkedList<>();
        queue.poll();
        queue.peek();
        queue.add(1);
        queue.remove();
        //stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.lastElement();
        stack.peek();

        //priority queue
        PriorityQueue<String> priority = new PriorityQueue<>();
        priority.add("a");
        priority.add("b");
        priority.add("c");



        //List of Entry
        List<Pair<Integer,Integer>> entryList = new LinkedList<>();
//        Map.Entry a = new Map.Entry("a", 2);
        entryList.add(new Pair(2,2));;
//        entryList.add(new Entry("b", 2));

        for(String s:priority){
            System.out.println("priority:"+s);
        }


        Iterator it = ls.listIterator();
        Iterator it2 = map.entrySet().iterator();
        Iterator it3 = treeMap.entrySet().iterator();
        Iterator it4 = linkedMap.entrySet().iterator();

        for(int i=0; i<ls.size();i++) System.out.println("ls:" + ls.get(i));
        for(int i: map.keySet()) System.out.println(map.get(i));

        while(it2.hasNext()){
            System.out.println("map:"+ it2.next());
        }
        while(it3.hasNext()){
            System.out.println("tree map:"+ it3.next());
        }
        while(it4.hasNext()){
            System.out.println("linked map:"+ it4.next());
        }

        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> book= new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            book.put(name,phone);
        }
        ArrayList list= new ArrayList();
        while(in.hasNext()){
            String string = in.next();
            // Write code here
            list.add(string);
        }
        Iterator s= list.listIterator();
        while (s.hasNext()){
            if(book.containsKey(s.next())){
                System.out.println(book.get(s.next()));
            }else {
                System.out.println("Not found");
            }
        }

        in.close();



    }

}
