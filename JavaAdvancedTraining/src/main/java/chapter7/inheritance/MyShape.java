package chapter7.inheritance;
/*protected - attributes are accessible within the parent
* class and any other child class that inherits from the parent
* class*/
public class MyShape {
    protected int length, width;

    public MyShape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public void display(){
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Area: " + this.getArea());
    }
}
