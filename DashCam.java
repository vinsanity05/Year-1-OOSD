package GroupCoursework;

/*
 * GAO, YU MIN
 * BERNARDO, LEAN GERARD 
 * VERDADERO, VINCE 
 */

public class DashCam extends StockItem {

    public DashCam(String stockCode, int quantity, double price) {
        super(stockCode, quantity, price);
    }

    @Override
    public String getStockName() {
        return "Dash Cam";
    }

    @Override
    public String getStockDescription() {
        return "Nextbase Dash Cam"; 
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
