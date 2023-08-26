package assignment3;

public class Rectangle extends Shape{
    int length;
    int breadth;

    Rectangle(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    @Override
    double calculateArea() {
        return this.length*this.breadth;
    }
}
