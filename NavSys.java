package GroupCoursework;

import java.util.Scanner;

/*
 * GAO, YU MIN
 * BERNARDO, LEAN GERARD 
 * VERDADERO, VINCE 
 */

public class NavSys extends StockItem {

    public NavSys(String stockCode, int quantity, double price) {
        super(stockCode, quantity, price);
    }

    @Override
    public String getStockName() {
        return "Navigation System";
    }

    @Override
    public String getStockDescription() {
        return "GeoVision Sat Nav";
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

//Class Used To Test NavSys
class NavSysTest {

   public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        StockItem stock = new NavSys("NS102", 10, 124.99);
                
        System.out.println("\nPrinting item stock information:");
        System.out.println(stock);

        System.out.print("\nUnits of Stock To Add: ");
        int addStockInput = input.nextInt();
        System.out.println("Increasing Stock By " + addStockInput + " Units");
        stock.addStock(addStockInput);
        
        System.out.println("\nPrinting item stock information:");
        System.out.println(stock);

        System.out.print("\nUnits of Stock Sold: ");
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
