package assignment2_v2;

public class Main {
    public static void main(String[] args) {
        MyCustomQueue myQueue=new MyCustomQueue();
        myQueue.push(1);
        myQueue.push(3);
        myQueue.push(5);

        System.out.println("Front element: " + myQueue.peek());
        System.out.println("queue empty: " + myQueue.empty());

        System.out.println("Popped element: " + myQueue.pop());
        System.out.println("Front element: " + myQueue.peek());

        myQueue.push(4);
        System.out.println("Size: " + myQueue.size());
        System.out.println("Popped element: " + myQueue.pop());
        System.out.println("Popped element: " + myQueue.pop());
        System.out.println("queue empty: " + myQueue.empty());


        myQueue.clear();
        System.out.println("Popped element: " + myQueue.pop());
        System.out.println("queue empty: " + myQueue.empty());

        myQueue.push(8);
        //System.out.println("Popped element: " + myQueue.pop());
        //System.out.println("Front element: " + myQueue.peek());
        //System.out.println("Size: " + myQueue.size());

        MyCustomQueue myQueue1=new MyCustomQueue();
        myQueue1.push(11);
        System.out.println("Size: " + myQueue.size());
        System.out.println("Size: " + myQueue1.size());
        myQueue.clear();
        System.out.println("Size: " + myQueue.size());
        System.out.println("Size: " + myQueue1.size());


    }
}

