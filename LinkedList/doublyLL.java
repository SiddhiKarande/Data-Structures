
public class doublyLL {
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next= null;
            this.prev = null; 
        }
        
    }
        public static Node head;
        public static Node tail;
        public static int size;

    public void add(int data){
        Node newNode = new Node(data);
        //at at start
        if(head == null){
            head = tail =newNode;
            return;
        }  
        newNode.next = head;
        head.prev = newNode;
        head= newNode;
    }

    public void printDLL(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){

        doublyLL dll = new doublyLL();
        dll.printDLL();
        dll.add(1);
        dll.add(2);
        dll.add(3);
        dll.printDLL();


    }
    
}
