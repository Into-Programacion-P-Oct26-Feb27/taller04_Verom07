/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ingreso de variables por teclado
        Scanner entrada = new Scanner(System. in);
        entrada.useLocale(Locale.US);
        
        //declarar variables
        String cliente;
        double precioN;
        double precioY;
        double precioD;
        double precioS;
        double descuentoN;
        double descuentoY;
        double descuentoD;
        double descuentoS;
        double precioFN;
        double precioFY;
        double precioFD;
        double precioFS;
        double costoSinD;
        double costoD;
        double ahorro;
        
        System.out.println("Ingrese nombres del cliente");
        cliente = entrada.nextLine();
        System.out.println("Ingrese precio mensual de Netflix");
        precioN = entrada.nextDouble();
        System.out.println("Ingrese precio mensual de YouTube Premium");
        precioY = entrada.nextDouble();
        System.out.println("Ingrese el precio mensual de Dropbox");
        precioD = entrada.nextDouble();
        System.out.println("Ingrese pregio mensual de Spotify");
        precioS = entrada.nextDouble();
        
        descuentoN = precioN * 0.23;
        descuentoY = precioY * 0.23;
        descuentoD = precioD * 0.45;
        descuentoS = 0;
        
        precioFN = precioN - descuentoN;
        precioFY = precioY - descuentoY;
        precioFD = precioD - descuentoD;
        precioFS = precioS - descuentoS;
        
        costoSinD = precioN + precioY + precioD + precioS;
        costoD = precioFN + precioFY + precioFD + precioFS;
        ahorro = costoSinD - costoD;
        
        System.out.printf("\n==========================\n"
                + "Servicios digitales:\n--------------------------\n"
                + "Nombre del cliente: %s\n---------------------------\n"
                + "Precio Original:\n"
                + "Netflix: $%.2f\nYouTube Premium: $%.2f\n"
                + "Dropbox: $%.2f\nSpotify: $%.2f\n-----------------------\n"
                + "Descuentos:\n"
                + "Netflix: %.2f\nYouTube Premium: %.2f\n"
                + "Dropbox: %.2f\nSpotify; %.2f\n------------------------\n"
                + "Precio con descuento:\n"
                + "Netflix: $%.2f\nYouTube Premium: %.2f\nDropbox: %.2f\n"
                + "Spotify: $%.2f\n-------------------------\n\n"
                + "Costo mensual total sin promociones: $%.2f\n"
                + "Ahorro mensual: $%.2f\n"
                + "Valor a pagar mensual con promociones: $%.2f\n"
                + "=========================\n",
                cliente,
                precioN,
                precioY,
                precioD,
                precioS,
                descuentoN,
                descuentoY,
                descuentoD,
                descuentoS,
                precioFN,
                precioFY,
                precioFD,
                precioFS,
                costoSinD,
                ahorro,
                costoD);
    }
    
}
