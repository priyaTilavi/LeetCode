package linkedlist;

public class LinkedInOperation {

    public Node insertNodeAtEnd(Node head,int val){
        Node temp= new Node(val);
        if(head==null) return temp;
        else{
            Node n;
            for(n=head;n.next!=null;n=n.next){

            }
            n.next=temp;
        }
        return head;
    }
    public Node insertBeforeNode(Node head,Node prev, int value){
        Node newNode= new Node(value);
        if(prev==null) return newNode;
        else{
            Node temp= prev.next;
            prev.next=newNode;
            newNode.next=temp;
        }
        return head;
    }

    public void print(Node head){
        for(Node n=head;n!=null;n=n.next){
            System.out.println(n.key);
        }
    }

    public Node reverseList(Node head){
        Node prev= null;
        Node next = null;
        Node current= head;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }


}
