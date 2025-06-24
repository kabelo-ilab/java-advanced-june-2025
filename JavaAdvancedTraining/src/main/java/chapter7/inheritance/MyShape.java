package chapter7.inheritance;

/**
 * The type My shape.
 * @author Kabelo Tlhape
 */
/*protected - attributes are accessible within the parent
* class and any other child class that inherits from the parent
* class*/
public class MyShape {
    /**
     * The Length and The width.
     */
    protected int length, width;

    /**
     * Instantiates a new My shape.
     *
     * @param length the length
     * @param width  the width
     */
    public MyShape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Get area of a shape.
     *
     * @return the area of a shape as {@code double}
     */
    public double getArea(){
        return this.length * this.width;
    }

    /**
     * Display details.
     */
    public void display(){
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Area: " + this.getArea());
    }
}
