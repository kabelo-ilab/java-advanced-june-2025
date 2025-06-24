package chapter7.inheritance;

public class MyCircle extends MyShape {

    public MyCircle(int radius){
        super(0,radius);
    }

    @Override
    public double getArea(){
        return Math.PI * (this.width * this.width);
    }
    @Override
    public void display(){
        System.out.println("Radius: " + this.width);
        System.out.println("Area: " + this.getArea());
    }
}
