public class NodeSum {
   
        static class Node{
            int data;
            Node right;
            Node left;
    
            Node(int data){
                this.data = data;
                this.right = null;
                this.left = null;
            }
        }
    
        public static int sum(Node root){
            if(root == null){
                return 0;
            }

            int ls = sum(root.left);
            int rs = sum(root.right);

            int sum = ls + rs + root.data;
            return sum;
        }
        public static void main(String args[]){
    
            /*  1
               /  \
              2     3
             /  \    \
            4    5    6
    
            */
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.right = new Node(6);
    
           System.out.println(sum(root));
    
        }
        
}
    



