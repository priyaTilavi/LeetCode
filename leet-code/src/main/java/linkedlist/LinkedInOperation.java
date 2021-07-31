package linkedlist;

public class LinkedInOperation {

    public Node insertNodeAtEnd(Node head,int val){
        Node temp= new Node(val);
        if(head==null) return temp;
        else{
            Node n;
            for(n=head;n.next!=null;n=n.next){ }
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
    // insert node before this value
    public Node insertBeforeNode(Node head,int insertBeforeValue, int value){
        Node newNode= new Node(value);
        Node prev=null;
        if(head==null) return newNode;
        if(head.next==null && head.key==insertBeforeValue) {
            newNode.next=head;
            return newNode;
        }
        if(head.next==null && head.key!=insertBeforeValue){
            return head;
        }
        else {
            Node n=head;
            for(;n.next!=null && n.key!=insertBeforeValue;n=n.next) {
               prev=n;
            }
            if(n.next!=null){
                newNode.next=n;
                prev.next=newNode;
            }
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

//    Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1.
//  `The linked list holds the binary representation of a number.
    public int getDecimalValue(Node head) {
        int result=0;
        int size=0;
        for(Node n= head; n!=null; n= n.next, size++){ }
        int index=size-1;
        while(head!=null){
            result += head.key* Math.pow(2,index);
            index--;
            head= head.next;
        }
        return result;

    }
    public Node mergeTwoLists(Node l1, Node l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;

        Node merge=null;
        if(l1.key<l2.key){
            merge = l1;
            merge.next= mergeTwoLists(l1.next, l2);
        } else {
            merge = l2;
            merge.next= mergeTwoLists(l1, l2.next);
        }
        return merge;
    }
    public Node swapPairs(Node head) {
        if(head==null || head.next==null) return head;
        Node n = head;
        Node prev= head.next;
        while (n.next!=null && n.next.next!=null){
            Node first= n;
            Node second= n.next;
            Node nextNode = second.next;
            second.next= first;
            first.next = nextNode;
            n= nextNode;
        }

       return prev;
    }
    //234. Palindrome Linked List
    // Given the head of a singly linked list, return true if it is a palindrome.
    public boolean isPalindrome(Node head) {
        StringBuilder s= new StringBuilder();
        for(Node n=head;n!=null;n=n.next){
            s.append(n.key);
        }
        System.out.println(s);
        System.out.println(s.reverse());
        return (s.toString().equals(s.reverse().toString()));
    }
    public Node middleNode(Node head) {
        int size = getSizeOfLinkedList(head);
        int middle = (int) Math.ceil(size/2);
        for (int i=0;i<middle;i++){
            head=head.next;
        }
        return head;
    }

    private int getSizeOfLinkedList(Node head) {
        int size=0;
        for(Node n = head; n!=null; n=n.next){
            size++;
        }
        return size;
    }

    public Node removeNthFromEnd(Node head, int n) {
        if(head==null) return null;
        int index = getSizeOfLinkedList(head)-n;
        Node prev=null;
        Node node=head;
        for(int i=0;i<index;i++,node=node.next){
            prev=node;
        }
        System.out.println(node.key);
        prev=node.next;

        return head;
    }
//138. Copy List with Random Pointer
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node newNode=null;
        Node prev=null;
        for(Node n=head, copyNode=newNode;n!=null;n=n.next, copyNode=copyNode.next){
            copyNode = new Node(n.key);
            prev.next = copyNode;
//            copyNode.random = new Node();

        }

        return newNode;
    }
}
