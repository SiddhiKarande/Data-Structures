public class CircularQueue {
    
    static class Queue{
        static int arr[];

        static int size;
        static int rear;
        static int front;
        
        Queue(int n){
            arr = new int[size];
           size = n;
            rear = -1;
            front = -1;
           
            
        }

        public static boolean isFull(){
            return (rear  + 1)%size == front;
        }

        public static boolean isEmpty(){
            return rear == -1 && front ==-1;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Full");
                return;
            }
            if(front == -1){
                front = 0;
            }

            rear = (rear + 1)%size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }

            int result = arr[front];
            if(rear == front){
                 rear = front = -1;
                 return -1;
            }else{
            front = (front + 1)%size;
                return result;
            }
            //return result;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }
    
    public static void main(String args[]){
        Queue q = new Queue(10);
        q.add(11);
        q.add(22);
        q.add(33);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
