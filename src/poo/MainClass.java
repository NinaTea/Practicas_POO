package src.poo;

import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        Item tuna = new Item();
        tuna.name = "Atún Gomez";
        tuna.price = 180.00;
        tuna.expirationDate = new Date(2021,8,12);
        tuna.calculateTax();


        if (tuna.canItBeSold(tuna.expirationDate)){
            System.out.println("Nombre del Item: " + tuna.name);
            System.out.println("Precio del Item: " + tuna.price);
            System.out.println("Impuesto del Item: " + tuna.tax);
            System.out.println("Total a pagar por el Item: " + tuna.getTotalToPay());
        } else {
            System.out.println("No se puede vender el Item Atún Gomez");
        }

    }
}
