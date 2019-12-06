package linkedlist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainClass {

    public static void main(String[] args) {
        MainClass object = new MainClass();
        LinkedInOperation operation = new LinkedInOperation();
        String[] s={"sad","asd","sadsd"};
        //s.indexOf()
        String m="ddsfdf";
        System.out.println(m.contains("sd"));
        Node head=null;
        head= operation.insertNodeAtEnd(head,2);
        head= operation.insertNodeAtEnd(head,5);
        head= operation.insertNodeAtEnd(head,3);
        head= operation.insertNodeAtEnd(head,1);
        operation.print(head);

        Node reversedHead=operation.reverseList(head);
        operation.print(reversedHead);

        Map<String,String> map= new HashMap<>();

//        Iterator<String> = map.entrySet()
//
//                for(String s= map){
//
//                }
//


    }
}
