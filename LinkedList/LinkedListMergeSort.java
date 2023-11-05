//package data_stuctures;

public class LinkedListMergeSort {

        public static void main(String args[]){
            
            LinkedListMergeSort ll =new LinkedListMergeSort();
            ll.printLinkedList();
            ll.addAtFront(1);
            ll.addAtFront(2);
            ll.AddInMiddle(1, 3);
    
            ll.printLinkedList();

            ll.head = ll.mergeSort(ll.head);
            ll.printLinkedList();
            
        }
    

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

        private Node getMid(Node head){
            Node slow = head;
            Node fast = head.next;

            while(fast !=null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        private Node merge(Node head1, Node head2){
            Node mergedLL = new Node(-1);
            Node temp = mergedLL;

            while(head1 != null && head2!=null){
                if(head1.data <= head2.data){
                    temp.next = head1;
                    head1 = head1.next;
                    temp = temp.next;
                }else{
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;

                }
            }
            while(head1 !=null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }

            while(head2 != null){
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

            return mergedLL.next;
        }
    
        public Node mergeSort(Node head){
            if(head == null || head.next == null){
                return head;
            }
            //find mid
            Node mid = getMid(head);

            //partition and sort
            Node rightHead = mid.next;
            mid.next = null;
            Node newLeft = mergeSort(head);
            Node newRight = mergeSort(rightHead);
            //merge
            return merge(newLeft, rightHead);
        }
        
    }
