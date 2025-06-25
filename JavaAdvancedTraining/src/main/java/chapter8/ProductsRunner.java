package chapter8;

public class ProductsRunner {
    public static void main(String[] args) {
        //datatype[] arrayName = new datatype[size]
        Product objPr = new Product("C", "Coke Light", 10, 10);
        Product objPr1 = new Product("M", "Mango", 9, 5);
        Product objPr2 = new Product("ML", "Clover Milk", 23.50, 15);
        Product objPr3 = new Product("EG", "Large Eggs", 100.50, 5);
        Product objPr4 = new Product("Bread", "Albany Brown", 18.99, 25);

        Product[] arProducts = new Product[5];

        arProducts[0] = objPr1;
        arProducts[1] = objPr2;
        arProducts[2] = objPr3;
        arProducts[3] = objPr4;
        arProducts[4] = objPr;

        try{
            for (int i = 0; i < arProducts.length; i++) {
                arProducts[i].increasePrice(4);
                arProducts[i].sell(4);
                System.out.println(arProducts[i]);
                System.out.println();
            }
        }catch(HighPriceIncreaseException ex){
            System.err.println(ex.getMessage());
        }catch(LowStockException ex){
            System.err.println(ex.getMessage());
        }




    }
}
