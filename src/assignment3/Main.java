package assignment3;

public class Main {
    public static void main(String[] args) {
        Circle c1=new Circle(3);
        Rectangle r1=new Rectangle(2,5);
        Triangle t1=new Triangle(4,3);

        System.out.println(c1.calculateArea());
        System.out.println(r1.calculateArea());
        System.out.println(t1.calculateArea());

    }
}
