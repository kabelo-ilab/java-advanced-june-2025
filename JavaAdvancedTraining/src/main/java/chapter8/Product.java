package chapter8;
/*This class will throw exceptions based on the following rules:
Rules
    - A product description should be at least 5 characters long
*   - Price cannot be zero or negative*/
public class Product {
    private String code, description;
    private double price;
    private int qtyInStock;

    public Product(String code, String desc, double price, int qtyInStock) {
        setCode(code);
        setDescription(desc);
        setPrice(price);
        setQtyInStock(qtyInStock);
    }

    public void sell(int qtyToSell) throws LowStockException{
        if (qtyToSell > qtyInStock){
            throw new LowStockException("Not enough quantity to sell. \nThe current quantity in stock is: " + getQtyInStock());
        }
        this.qtyInStock = this.qtyInStock - qtyToSell;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() < 5){
            throw new IllegalArgumentException("Description should be at least 5 characters long. \nCurrent description: [" + description + "]");
        }
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            throw new IllegalArgumentException("Price cannot be zero or negative. \nCurrent price is: [" + price + "]");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "Code = '" + getCode() + '\'' +
                ", Description = '" + getDescription() + '\'' +
                ", Price = " + getPrice() +
                ", Qty In Stock = " + getQtyInStock();
    }
}
