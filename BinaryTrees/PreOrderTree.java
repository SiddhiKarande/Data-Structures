import java.util.LinkedList;
import java.util.Queue;

class PreOrderTree{
    static class Node{
         int data;
         Node left;
         Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class  BinaryTree {
    static int idx = -1;
    public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;

    }
    public static void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }
    public static void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curNode = q.remove();
            if(curNode == null){
                System.out.println();
                if(q.isEmpty()){
                    return;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curNode.data + " ");
                if(curNode.left != null){
                    q.add(curNode.left);
                }
                if(curNode.right != null){
                    q.add(curNode.right);
                }
            }
        }
    }
    
}


    public static void main(String args[]){
        int preOrder[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(preOrder);
        System.out.println(root.data);

        bt.preOrderTraversal(root);
        System.out.println();
        bt.inOrderTraversal(root);
        System.out.println();
        bt.postOrderTraversal(root);
        System.out.println();
        bt.levelTraversal(root);
    }

    
}