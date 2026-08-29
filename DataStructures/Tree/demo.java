package Tree;

class Node{
    int data;
    Node right;
    Node left;
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree{
    Node root;

    public void insert(int data){
        root = insertrec(root,data);
    }

    public Node insertrec(Node root, int data){
        if(root==null){
            root = new Node(data);
        }
        else if(data<root.data){
            root.left = insertrec(root.left,data);
        }
        else{
            root.right = insertrec(root.left, data);
        }
        return root;
    }
}

public class demo{
    public static void main(String[] args){

    }
}