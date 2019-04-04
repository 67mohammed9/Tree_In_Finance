package com.MOHAMMED;
import java.util.*;


public class Navigator {
    private int N;

    public Navigator(int N) {
        this.N = N;
    }
    public int getN() {
        return N;
    }

    enum move
    {
        UP,DOWN, NOMOVEMENT;

    }
    void traverse(BinomialTreeFactory tree)
    {
        int iterations = N;
        int percentage = tree.getP();
        int time = tree.getT();
        Node cursor = tree.getRoot();
        int tmp =0;
        int tmpIteration = 1;
        while(tmpIteration <= iterations)
        {
            //At T=0 there is no movement
            System.out.println(" ");
            System.out.println("Iteration: " + tmpIteration);
            System.out.println("Time: " + tmp + "          Random Value: NO VALUE" + "     Movement: " + move.NOMOVEMENT );
            System.out.println("_________________________________________________________________________________________");
            while(tmp < time)
            {
                //Random number is generated
                Random rand = new Random();
                int random = rand.nextInt(100);
                if(random <= percentage)//0-P inclusive
                {
                    //if random is less than probability then traverse up and print the movement the time and the random number that was compared
                    cursor = cursor.up;
                    System.out.println("Time: " + (tmp +1)+ "          Random Value: " +random+ "           Movement: " + move.UP );
                    System.out.println("_________________________________________________________________________________________");
                }
                else if( random > percentage)//P-100 exclusive
                {
                    //if random is greater than probability then traverse down and print the movement the time and the random number that was compared
                    cursor = cursor.down;
                    System.out.println("Time: " + (tmp +1)+ "          Random Value: " +random+ "           Movement: " + move.DOWN);
                    System.out.println("_________________________________________________________________________________________");
                }
                tmp++;
            }
            //reset for the next iteration
            tmp=0;
            tmpIteration++;
            cursor = tree.getRoot();
        }
    }

}