import java.util.ArrayList;

class BST {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Inserting a node in BST
    public static Node insert(Node root, int key) {

        if(root == null) {
            root = new Node(key);
            return root;
        }

        if(root.data > key) {
            //left subtree
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        
        return root;
    }

    //For printing the nodes inorder    left subtree -> root -> right subtree
    public static void inorder(Node root) {
        
        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //Search a key in BST - o(H) time complexity
    public static Boolean search(Node root, int key) {
        
        if(root == null) {
            return false;
        }

        if(root.data > key) {
            return search(root.left, key);
        } else if(root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    //Delete a node
    public static Node delete(Node root, int val) {

        if(root.data > val) {
            root.left = delete(root.left, val);
        } else if(root.data < val) {
            root.right = delete(root.right, val);
        }

        else { //root.data == val
            //case 1
            if(root.left == null && root.right == null) {
                return null;
            }

            //case 2
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            //case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node inorderSuccessor(Node root) {

        while(root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void printInRange(Node root, int x, int y) {


        if(root == null) {
            return;
        }

        if(root.data >= x && root.data <= y) {
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        } else if(root.data >= y) {
            printInRange(root.left, x, y);
        } else {
            printInRange(root.right, x, y);
        }


    }

    //Number of paths from root to leaf
    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {

        if(root == null) {
            return;
        }

        path.add(root.data);

        //leaf
        if(root.left == null && root.right == null) {
            printPath(path);
        } else {
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    public static void printPath(ArrayList<Integer> path) {
        for(int i = 0; i<path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int[] values = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i = 0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        if(search(root, 4)) {
            System.out.println("Key found");
        } else {
            System.out.println("Key not found");
        }

        delete(root, 6);
        inorder(root);
        System.out.println();

        printInRange(root, 3, 10);
        System.out.println();

        printRootToLeaf(root, new ArrayList<>());

    }
}