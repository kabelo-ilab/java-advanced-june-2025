package chapter7.abstraction;

/**
 * The type My rectangle.
 */
public class MyRectangle extends MyShape {
    private int length, width;

    /**
     * Instantiates a new My rectangle.
     *
     * @param length the length
     * @param width  the width
     */
    public MyRectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public String display() {
        return "Length: " + this.length + "\n"
                + "Width: " + this.width + "\n"
                + "Area =" + this.getArea();
    }


}
