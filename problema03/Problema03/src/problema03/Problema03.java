/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ingreso de variables por techado
        Scanner entrada = new Scanner(System. in);
        entrada.useLocale(Locale.US);
        
        //declarar variables
        String titular;
        String direccion;
        double costoMinuto;
        int minutosConsumidos;
        double totalPago;
        
        System.out.println("Ingrese el nombre del titular");
        titular = entrada.nextLine();
        System.out.println("Ingrese su dirección");
        direccion = entrada.nextLine();
        
        System.out.println("Ingrese su costo por minutos");
        costoMinuto = entrada.nextDouble();
        System.out.println("Ingrese sus minutos consumidos");
        minutosConsumidos = entrada.nextInt();
        
        totalPago = costoMinuto * minutosConsumidos;
        
        System.out.printf("===============================\n"
                + "PLANILLA DE SERVICIO TELEFÓNICO"
                + "\n================================\nTitular: %s\nDirección: %s"
                + "\n--------------------------------\nCosto por minuto: $%.2f\n"
                + "Minutos consumidos: %d\n---------------------------------\n"
                + "VALOR TOTAL A PAGAR: $%.2f"
                + "\n=================================\n",
                titular,
                direccion,
                costoMinuto,
                minutosConsumidos,
                totalPago);
    }
    
}
