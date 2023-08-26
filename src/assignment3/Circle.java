package assignment3;

public class Circle extends Shape {
    int radius;

    Circle(int r){
        this.radius=r;
    }

    @Override
    public double calculateArea(){
        return Math.PI*this.radius*this.radius;
    }
}
