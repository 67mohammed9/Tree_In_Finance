//Assignment 2 Tree in Finance

package com.MOHAMMED;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Time.");
        int time = myObj.nextInt();  // Read user input
        System.out.println("Enter Probability.");
        int probability = myObj.nextInt();
        System.out.println("Enter the number of iterations.");
        int iteration = myObj.nextInt();
        Node root = BinomialTreeFactory.create(time, probability);
        BinomialTreeFactory tree = new BinomialTreeFactory(root, time, probability);
        Navigator n = new Navigator(iteration);
        n.traverse(tree);

    }
}
