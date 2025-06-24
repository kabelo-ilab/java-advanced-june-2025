package chapter7.inheritance;

public class MyShapeRunner {
    public static void main(String[] args) {
        MyRectangle objRec = new MyRectangle(4,6);
        objRec.display();

        System.out.println("===========================");
        MySquare objSq = new MySquare(5);
        objSq.display();

        System.out.println("=============================");
        MyCircle objCircle = new MyCircle(7);
        objCircle.display();

    }
}
