package src.poo;

import java.util.Date;

public class Item {
    public String name;
    public double price;
    public double tax;
    public Date expirationDate;

    public double getTotalToPay(){
        return price + tax;
    }
    public void calculateTax(){
        tax = price * 0.19;
    }
    public boolean canItBeSold(Date expirationDate){
        Date today = new Date();
        return expirationDate.after(today);
    }
}
