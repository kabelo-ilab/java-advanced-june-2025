package chapter7.inheritance;

public class MySquare extends MyShape {

    public MySquare(int side){
        super(side,0);
    }

    @Override
    public double getArea(){
        return this.length * this.length;
    }
    @Override
    public void display(){
        System.out.println("Side: " + this.length);
        System.out.println("Area: " + this.getArea());
    }


}
