package com.MOHAMMED;

public class BinomialTreeFactory {
    private Node root;
    private int T;
    private int P;

    public Node getRoot() {
        return root;
    }

    public int getT() {
        return T;
    }
    public int getP() {
        return P;
    }

    // Default constructor
    public BinomialTreeFactory()
    {
        root = null;
        T=0;
        P=0;
    }

    //creates tree with given parameters
    public BinomialTreeFactory(Node root, int T, int P) {
        this.root = root;
        this.T=T;
        this.P=P;
    }


    //Recursive function to create and connect nodes of the tree
    public static Node create(int T, int P) {
        Node node = new Node();
        if(T==0) {
            return node;
        }
        node.up = create(T-1,P);
        node.down = create(T-1,P);
        return node;
    }

    //creates a tree of desired depth T
    public void makeTree(int T, int P)
    {
        root = create(T,P);
    }

}