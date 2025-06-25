package chapter8;

/**
 * @author Kabelo Tlhape
 * The type Product.
 */
/*This class will throw exceptions based on the following rules:
Rules
    - A product description should be at least 5 characters long
*   - Price cannot be zero or negative*/
public class Product {
    private String code, description;
    private double price;
    private int qtyInStock;

    /**
     * Instantiates a new Product.
     *
     * @param code       the code
     * @param desc       the description
     * @param price      the price
     * @param qtyInStock the qty in stock
     */
    public Product(String code, String desc, double price, int qtyInStock) {
        setCode(code);
        setDescription(desc);
        setPrice(price);
        setQtyInStock(qtyInStock);
    }

    /**
     * Sell the product.
     *
     * @param qtyToSell the quantity to sell
     * @throws LowStockException if the {@code qtyToSell} is more than the available quantity in stock
     */
    public void sell(int qtyToSell) throws LowStockException{
        if (qtyToSell > qtyInStock){
            throw new LowStockException("Not enough quantity to sell " + getDescription() + ". \nThe current quantity in stock is: " + getQtyInStock() +
                    "\nThe requested quantity is: " + qtyToSell);
        }
        this.qtyInStock = this.qtyInStock - qtyToSell;
    }

    /**
     * Increase the price of the product by a {@code percentage}
     * @param percentage percentage to increase the price
     * @throws HighPriceIncreaseException when the increase amount is more than 10
     */
    public void increasePrice(double percentage) throws HighPriceIncreaseException{
        double increase = this.price * (percentage / 100);
        if (increase > 10){
            throw new HighPriceIncreaseException("The price increase on " + getDescription() +
                    " is too high [" + increase + "]");
        }
        this.price = this.price + increase;
    }

    /**
     * Gets quantity in stock.
     *
     * @return the {@code int} quantity in stock
     */
    public int getQtyInStock() {
        return qtyInStock;
    }

    /**
     * Sets quantity in stock.
     *
     * @param qtyInStock the quantity in stock
     */
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    /**
     * Gets code.
     *
     * @return the {@code String} code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the product code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets description.
     *
     * @return the {@code String} product description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     * @throws IllegalArgumentException if the length of {@code description} is less than 5 characters
     */
    public void setDescription(String description) {
        if (description.length() < 5){
            throw new IllegalArgumentException("Description should be at least 5 characters long. \nCurrent description: [" + description + "]");
        }
        this.description = description;
    }

    /**
     * Gets price.
     *
     * @return the {@code double} price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
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
