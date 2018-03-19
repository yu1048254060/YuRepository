package com.bc;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(7);
        stack.push(6);
        sortstack(stack);
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }

    private static void sortstack(Stack<Integer> stack) {
        Stack<Integer> help=new Stack<Integer>();
        while(!stack.empty()){
            int cur=stack.pop();
            while(!help.empty()&&help.peek()>cur){
               stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()){
            stack.push(help.pop());
        }
    }
}
