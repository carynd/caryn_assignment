package assignment2_v2;

import java.util.Stack;

public class MyCustomQueue {

    private static Stack<Integer> f;
    private static Stack<Integer> s;
    public MyCustomQueue() {
        f=new Stack<>();
        s=new Stack<>();
    }

    public void push(int x) {
        f.push(x);
        System.out.println("Pushed value: "+ x);
    }

    public int pop() {
       if(s.isEmpty()){
           moveValue();
       }
       if(s.isEmpty()){
           System.out.println("Empty queue");
           return -1;
       }
       return s.pop();
    }

    public int peek() {
        if(s.isEmpty()){
            moveValue();
        }
        if(s.isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
        return s.peek();
    }

    public boolean empty() {
        return f.isEmpty() && s.isEmpty();
    }

    public void clear(){
        f.clear();
        s.clear();
    }

    void moveValue(){
        while(!f.isEmpty()) {
            s.push(f.pop());
        }
    }

    public int size(){
        empty();
        return f.size()+s.size();
    }
}
