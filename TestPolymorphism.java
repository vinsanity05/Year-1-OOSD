package GroupCoursework;

import java.util.Scanner;

/*
 * GAO, YU MIN
 * BERNARDO, LEAN GERARD 
 * VERDADERO, VINCE 
 */

public class TestPolymorphism {

    public static void itemInstance(StockItem s) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("\nPrinting item stock information:");
        System.out.println(s);

        System.out.print("\nUnits of Stock To Add: ");
        int addStockInput = input.nextInt();
        System.out.println("Increasing Stock By " + addStockInput + " Units");
        s.addStock(addStockInput);
        
        System.out.println("\nPrinting item stock information:");
        System.out.println(s);

        System.out.print("\nUnits of Stock Sold: ");
        int sellStockInput = input.nextInt();
        System.out.println("Sold " + sellStockInput + " Units of Stock");
        s.sellStock(sellStockInput);
        
        System.out.println("\nPrinting item stock information:");
        System.out.println(s);

        System.out.print("\nEnter The New Price: £");
        double priceInput = input.nextDouble();
        System.out.println("Setting New Price At £" + priceInput + " Per Units");
        s.setPrice(priceInput);
        
        System.out.println("\nPrinting item stock information:");
        System.out.println(s);
    }

    public static void main(String[] args) {
        StockItem[] s = new StockItem[4];
        s[0] = new NavSys("NS102", 10, 99.99);
        s[1] = new DashCam("DC302", 15, 150);
        s[2] = new CarStereo("CS105", 5, 50);
        s[3] = new WiperBlades("WB203", 20, 30);

        for (int i = 0; i < 4; i++) {
            TestPolymorphism.itemInstance(s[i]);
        }
    }

}
