package com.seal.trainning;
//https://www.cs.usfca.edu/~galles/visualization/Algorithms.html

import javax.xml.soap.SOAPPart;

public class Main {
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        MyStack.StackNode node1;
        node1 = new MyStack.StackNode();
        node1.setValue(1);
        MyStack.StackNode node2;
        node2 = new MyStack.StackNode();
        node2.setValue(2);
        stack.Push(node1);
        stack.Push(node2);
        MyStack.StackNode node = stack.Pop();
        System.out.println(node.getValue());
        node=stack.Pop();
        System.out.println(node.getValue());
    }
}
