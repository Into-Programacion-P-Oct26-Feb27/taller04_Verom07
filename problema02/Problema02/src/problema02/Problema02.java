/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ingreso de variables por teclado
        Scanner entrada = new Scanner(System. in);
        entrada.useLocale(Locale.US);
        
        //declarar variables
        double base;
        double altura;
        double area;
        
        System.out.println("Ingrese la base del triángulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triángulo");
        altura = entrada.nextDouble();
        
        area = (base*altura)/2;
        
        System.out.printf("Base: %.2f\nAltura: %.2f\nÁrea: %.2f",
                base,
                altura,
                area);
    }
    
}
