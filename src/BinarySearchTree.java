

public class BinarySearchTree <T extends Comparable<T>> implements Tree<T> {

    private Node root;


    /// region constructers
    public BinarySearchTree(){
        this.root = null;
    }

    public BinarySearchTree(T data){
        this.root = new Node(data);
    }
    /// endregion

    /// region interface stuff
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void insert(T data) {
        root = insert(root, data);
    }

    @Override
    public void delete(T target) {

    }

    @Override
    public boolean contains(T target) {
        return false;
    }
    /// endregion

    /// region BST specific
    public T getMin(Node node){
        if (node == null){
            return null;
        }

        node = node.left;
        if (node.left==null){
            return node.data;
        }else {
            return getMin(node);
        }
    }

    public T getMax(Node node){

        if (node == null){
            return null;
        }

        node = node.right;
        if (node.right==null){
            return node.data;
        }else {
            return getMax(node);
        }

    }

    private Node insert(Node current, T data){

        if (current == null){
            return new Node(data);
        }

        // no empty spot, keep moving
        if(data.compareTo(current.data) < 0){
            // attempt tp insert data in the left subtree
            current.left = insert(current.left, data);
        }else if (data.compareTo(current.data)>0){
            // attempt to insert the new data into the right tree
            current.right = insert(current.right, data);
        }

        return current;

    }

    private Node delete(Node current, T target){
        return null;
    }

    private boolean contains(Node current, T target){
        return false;
    }
    /// endregion

    private class Node{

        Node left;
        Node right;
        T data;


        Node (T data){
            this.data = data;
            left = right = null;
        }
    }

}
