package src.poo;

import java.util.Date;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item tuna = new Item();
        System.out.println("Introduzca nombre del item; ");
        tuna.name = scanner.nextLine();
        System.out.println("Introduzca el precio del item; ");
        tuna.price = scanner.nextDouble();
        System.out.println("Introduzca el dia de vencimiento del item; ");
        int day = scanner.nextByte();
        System.out.println("Introduzca el mes de vencimiento del item; ");
        int month = scanner.nextByte();
        System.out.println("Introduzca el año de vencimiento del item; ");
        int year = scanner.nextInt() - 1900;
        tuna.expirationDate = new Date(year,month,day);
        tuna.calculateTax();


        if (tuna.canItBeSold(tuna.expirationDate)){
            System.out.println("Nombre del Item: " + tuna.name);
            System.out.println("Precio del Item: " + tuna.price);
            System.out.println("Impuesto del Item: " + tuna.tax);
            System.out.println("Total a pagar por el Item: " + tuna.getTotalToPay());
        } else {
            System.out.println("No se puede vender el Item " + tuna.name);
        }

    }
}
