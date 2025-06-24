package chapter7.interfaces;

import chapter7.Account;

/*To inherit from an interface, we use the keyword
* 'implements' instead of 'extends'
* Interfaces are used to allow multiple inheritance*/
public class MyRectangle implements IShape, IGraphics {

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String display() {
        return "";
    }

    @Override
    public void draw() {

    }

    @Override
    public void applyPaint(String color) {

    }
}
