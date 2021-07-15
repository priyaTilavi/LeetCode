import java.util.*;

public class Util {

    public static void main(String[] args) {

        //linked list
        LinkedList<Integer> ls= new LinkedList<>();
        ls.add(3);
        ls.add(5);
        ls.addLast(4);
        ls.addFirst(1);
        ls.peek();

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

        //stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.lastElement();

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
