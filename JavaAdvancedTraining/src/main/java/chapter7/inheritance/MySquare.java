package chapter7.inheritance;

/**
 * The type My square.
 * @author Kabelo Tlhape
 */
public class MySquare extends MyShape {

    /**
     * Instantiates a new My square.
     *
     * @param side the side
     */
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
