package GroupCoursework;

import java.util.Scanner;

/*
 * GAO, YU MIN
 * BERNARDO, LEAN GERARD 
 * VERDADERO, VINCE 
 */

public class StockItem {

    private String stockCode;
    private int quantity;
    private double price;
    private final double vat = 17.5;

    //Constructor
    public StockItem() {
    }

    public StockItem(String stockCode, int quantity, double price) {
        this.stockCode = stockCode;
        this.quantity = quantity;
        this.price = price;
    }

    //Getters and Setters
    public String getStockName() {
        return ("Unknown Stock Name");
    }

    public String getStockDescription() {
        return ("Unknown Stock Description");
    }

    public String getStockCode() {
        return this.stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceIncVAT() {
        return getPrice() * (1 + (getVAT() / 100));
    }

    public void setPriceIncVAT(double priceIncVAT) {
        setPrice(priceIncVAT / (1 + (getVAT() / 100)));
    }

    public double getVAT() {
        return this.vat;
    }

    public void addStock(int addStock) {
        if (addStock < 1) {
            System.out.println("Error: Cannot Add Less Than 1 Unit of Stock");
        } else if (addStock > 100) {
            System.out.println("Error: Cannot Add More Than 100 Units of Stock");
        } else {
            setQuantity(getQuantity() + addStock);
        }
    }

    public boolean sellStock(int sellStock) {
        if (sellStock < 1) {
            System.out.println("Error: Cannot Sell Less Than 1 Unit of Stock");
        } else if (sellStock <= getQuantity()) {
            setQuantity(getQuantity() - sellStock);
            return true;
        } else {
            System.out.println("Error: Cannot Sell More Than Available Units of Stock");
        }
        return false;
    }

    @Override
    public String toString() {
        return ("Stock Type: " + getStockName()
                + "\nStock Description: " + getStockDescription()
                + "\nStock Code: " + getStockCode()
                + "\nPrice (excl. VAT): £" + getPrice()
                + "\nPrice (inc. VAT): £" + getPriceIncVAT()
                + "\nTotal Units In Stock: " + getQuantity());
    }
}

//Class Used To Test StockItem

class StockItemTest {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        StockItem stock = new StockItem("W101", 10, 99.99);
                
        System.out.println("\nPrinting item stock information:");
        System.out.println(stock);

        System.out.print("\nUnits of Stock To Add: ");
        int addStockInput = input.nextInt();
        System.out.println("Increasing Stock By " + addStockInput + " Units");
        stock.addStock(addStockInput);
        
        System.out.println("\nPrinting item stock information:");
        System.out.println(stock);

        System.out.print("\nUnits Of Stock Sold: ");
        int sellStockInput = input.nextInt();
        System.out.println("Sold " + sellStockInput + " Units of Stock");
        stock.sellStock(sellStockInput);
        
        System.out.println("\nPrinting item stock information:");
        System.out.println(stock);

        System.out.print("\nEnter The New Price: £");
        double priceInput = input.nextDouble();
        System.out.println("Setting New Price At £" + priceInput + " Per Units");
        stock.setPrice(priceInput);
        
        System.out.println("\nPrinting item stock information:");
        System.out.println(stock);
    }
}