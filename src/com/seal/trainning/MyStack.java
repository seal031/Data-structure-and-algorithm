package com.seal.trainning;

import java.util.ArrayList;
import java.util.List;

//Stack (Array Implementaion)
//堆栈（数组实现）
public class MyStack {
    static class StackNode{
        private int value;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    private List<StackNode> list=new ArrayList<StackNode>();
    private int index=0;

    void Push(StackNode node){
        list.add(index,node);
        index++;
    }

    StackNode Pop(){
        if(list.size() == 0){
            return null;
        }
        else{
            index--;
            StackNode node = list.get(index);
            return  node;
        }
    }
}
