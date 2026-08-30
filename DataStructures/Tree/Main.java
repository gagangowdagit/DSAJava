package Tree;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree{
    Node root = null;
    public void insert(int data){
        root = insertrec(root, data);
    }

    public Node insertrec(Node root ,int data ){
        if(root == null){
            root = new Node(data);
        }
        else if(data<root.data){
            root.left = insertrec(root.left, data);
        }
        else{
            root.right = insertrec(root.right, data);
        }
        return root;
    }

    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }

    public void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+" ");
    }

}

public class Main{
    public static void main(String[] args){
        Tree tree1  = new Tree();
        tree1.insert(6);
        tree1.insert(6);
        tree1.insert(4);
        tree1.insert(8);

        tree1.inorder(tree1.root);
        tree1.preorder(tree1.root);
        tree1.postorder(tree1.root);
    }
}