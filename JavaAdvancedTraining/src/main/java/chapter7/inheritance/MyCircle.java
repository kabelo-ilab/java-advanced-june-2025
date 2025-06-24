package chapter7.inheritance;

/**
 * @author Kabelo Tlhape
 * The type My circle.
 */
public class MyCircle extends MyShape {

    /**
     * Instantiates a new My circle.
     *
     * @param radius the radius
     */
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
