public class LinkedList{

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //to add at begin
    public void addAtFront(int data){
        Node newNode = new Node(data);
        size ++;

        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add at last
    public void addAtBack(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    //add in middle of linked list
    public void AddInMiddle(int idx , int data){
        int  i =0;
        if(idx == 0){
            addAtFront(data);
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        
        while(i <idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next =temp.next;
        temp.next = newNode;

    }

    public void printLinkedList(){
        Node temp = head;
        if(head == null){
            System.out.println("Empty");
        }
        while(temp !=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }System.out.println("null");
    }

    public static void main(String args[]){
        
        LinkedList ll =new LinkedList();
        ll.printLinkedList();
        ll.addAtFront(1);
        ll.addAtFront(2);
        ll.AddInMiddle(1, 3);

        ll.printLinkedList();
        
    }
}