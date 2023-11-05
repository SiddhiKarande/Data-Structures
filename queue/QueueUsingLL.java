public class QueueUsingLL {
    static class Node{
        // static int head;
        // static int tail;
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    static class  Queue {
        static Node head = null;
        static Node tail = null;
        
        //empty
        public static boolean isEmpty(){
            return tail ==null && head == null;
        }

        //add
        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
           
            int front = head.data;
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }return front;


        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int front = head.data;
            return front;
        }
        
    }

    public static void main(String arg[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.print(q.peek() +" ");
            q.remove();
        }
    }
}
