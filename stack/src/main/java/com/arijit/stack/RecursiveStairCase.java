package com.arijit.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RecursiveStairCase {

    public static void main(String[] args) {
        Stack<Stair> stairStack = new Stack<>();
        stairStack.add(new Stair(0,new ArrayList<>()));
        int finaStep = 4;

        while (!stairStack.isEmpty()){
            Stair currStair = stairStack.pop();
            if(currStair.number == 4){
                System.out.println(currStair.visited);
                continue;
            }

            int oneStair = currStair.number+1;
            if(oneStair <= finaStep){
                stairStack.add(new Stair(oneStair, currStair.visited));
            }

            int twoStair = currStair.number+2;
            if(twoStair <= finaStep){
                stairStack.add(new Stair(twoStair,currStair.visited));
            }

        }
    }
}

class Stair{

    public List<Integer> visited = new ArrayList<>();
    public int number;

    public Stair(int number, List<Integer> visited){
        this.number = number;
        this.visited.addAll(visited);
        this.visited.add(number);
    }
}
