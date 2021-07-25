package linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        MainClass object = new MainClass();
        LinkedInOperation operation = new LinkedInOperation();
        String[] s={"sad","asd","sadsd"};
        //s.indexOf()
        String m="ddsfdf";
//        System.out.println(m.contains("sd"));
        Node head=null;
        head= operation.insertNodeAtEnd(head,2);
        head= operation.insertNodeAtEnd(head,5);
        head= operation.insertNodeAtEnd(head,3);
        head= operation.insertNodeAtEnd(head,1);
//        operation.print(head);

        List<HashMap<Integer,Integer>> list= new ArrayList<>();


        head= operation.reverseList(head);
        operation.print(head);
        System.out.println("insert before:");
//        Node node = operation.swapPairs(head);
//        operation.print(node);
        Node n = operation.insertBeforeNode(head,5,4);
        operation.print(n);
    }
}
