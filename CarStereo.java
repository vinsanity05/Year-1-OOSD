package GroupCoursework;

/*
 * GAO, YU MIN
 * BERNARDO, LEAN GERARD 
 * VERDADERO, VINCE 
 */

public class CarStereo extends StockItem {

    public CarStereo(String stockCode, int quantity, double price) {
        super(stockCode, quantity, price);
    }

    @Override
    public String getStockName() {
        return "Car Stereo";
    }

    @Override
    public String getStockDescription() {
        return "JVC Car Stereo"; 
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
