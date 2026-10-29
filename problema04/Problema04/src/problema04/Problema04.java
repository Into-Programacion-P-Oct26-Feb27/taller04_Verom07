/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ingreso de variables por teclado
        Scanner entrada = new Scanner(System. in);
        entrada.useLocale(Locale.US);
        
        //declarar variables
        String cliente;
        double cpu;
        double teclado;
        double raton;
        double pantalla;
        double costoBase;
        double costoOperacional;
        double costoTotal;
        
        System.out.println("Ingrese nombres del cliente");
        cliente = entrada.nextLine();
        System.out.println("Ingrese el costo del CPU");
        cpu = entrada.nextDouble();
        System.out.println("Ingrese el costo del teclado");
        teclado = entrada.nextDouble();
        System.out.println("Ingrese el costo del ratón");
        raton = entrada.nextDouble();
        System.out.println("Ingrese el costo de la pantalla");
        pantalla = entrada.nextDouble();
        
        costoBase = cpu + teclado + raton + pantalla;
        costoOperacional = costoBase * 0.15;
        costoTotal = costoBase + costoOperacional;
        
        System.out.printf("Reporte:\nNombres del cliente: %s\nValores Inicales:\n"
                + "CPU: $ %.2f\nTeclado: $ %.2f\nRatón: $ %.2f\n"
                + "Pantalla: $ %.2f\n\nCosto base: $ %.2f\n"
                + "Costo adicional del 15°/₀: %.2f\n"
                + "Costo final: $ %.2f\n",
                cliente,
                cpu,
                teclado,
                raton,
                pantalla,
                costoBase,
                costoOperacional,
                costoTotal);
        
    }
    
}
