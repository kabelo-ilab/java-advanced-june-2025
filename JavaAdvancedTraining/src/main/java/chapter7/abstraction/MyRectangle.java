package chapter7.abstraction;

public class MyRectangle extends MyShape {
    private int length, width;

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

    //draw the shape
    //paint
}
