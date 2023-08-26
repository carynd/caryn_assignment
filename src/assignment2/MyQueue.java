package assignment2;

import java.util.Stack;

class MyQueue {
    public static Stack<Integer> f;
    public static Stack<Integer> s;
    public MyQueue() {
        f=new Stack<>();
        s=new Stack<>();
    }

    public void push(int x) {
        f.push(x);
        System.out.println("Pushed value: "+ x);
    }

    public int pop() {
        if(f.isEmpty() && s.isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }

        while(!f.isEmpty()){
            s.push(f.pop());
        }

        int ans= s.pop();

        while(!s.isEmpty()){
            f.push(s.pop());
        }
        return ans;
    }

    public int peek() {
        if(f.isEmpty() && s.isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
        while(!f.isEmpty()){
            s.push(f.pop());
        }

        int ans= s.peek();

        while(!s.isEmpty()){
            f.push(s.pop());
        }
        return ans;
    }

    public boolean empty() {
        if(f.isEmpty() && s.isEmpty()) return true;
        return false;
    }

    public void clear(){
        f.clear();
        s.clear();
    }

    public void add(int x){
        f.push(x);
    }
    public int poll(){
        if(!f.isEmpty()){
            return f.pop();
        }
        System.out.println("Empty queue");
        return -1;
    }

    public int size(){
        if(f.isEmpty()){
            System.out.println("Empty queue");
            return 0;
        }
        return f.size();
    }
}