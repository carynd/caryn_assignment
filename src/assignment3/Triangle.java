package assignment3;

public class Triangle extends Shape{
    int base;
    int height;

    Triangle(int b,int h){
        this.base=b;
        this.height=h;
    }

    @Override
    public double calculateArea(){
        return 0.5*this.base*this.height;
    }
}
