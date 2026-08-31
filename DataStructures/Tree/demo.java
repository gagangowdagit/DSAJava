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
        root = insertrec(root,data);
    }

    public Node insertrec(Node root, int data){
        if(root==null){
            root = new Node(data);
        }
        else if(data<root.data){
            root.left = insertrec(root.left, data);
        }
        else{
            root.left = insertrec(root.left, data);
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

    public boolean search(Node root,int target){
        if(root==null){
            return false;
        }
        if(root.data==target){
            return true;
        }
        if(target<root.data){
            return search(root.left,target);
        }
        else{
            return search(root.right,target);
        }
    }
}
public class demo {
    public static void main(String[] args){

    }
}
