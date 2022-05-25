package GroupCoursework;

/*
 * GAO, YU MIN
 * BERNARDO, LEAN GERARD 
 * VERDADERO, VINCE 
 */

public class WiperBlades extends StockItem {

    public WiperBlades(String stockCode, int quantity, double price) {
        super(stockCode, quantity, price);
    }

    @Override
    public String getStockName() {
        return "Wiper Blades";
    }

    @Override
    public String getStockDescription() {
        return "Bosch Wiper Blades"; 
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
