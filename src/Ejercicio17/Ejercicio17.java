package Ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        // Nombrar las variables
        double RadioCirculo,  AreaCirculo, PerimetroCirculo;
        // Método de entrada
        Scanner entrada  = new Scanner(System.in);
        // Leer la entrada
        System.out.println("Ingrese el radio del circulo: ");
        RadioCirculo  = entrada.nextDouble();
        // Area y perimetro del circulo
        AreaCirculo = (Math.PI) * Math.pow(RadioCirculo, 2);
        PerimetroCirculo = 2 * RadioCirculo * (Math.PI);
        System.out.println("El radio del circulo es: " + RadioCirculo);
        System.out.println("El área del circulo es: " + (double) Math.round(AreaCirculo * 1000)/1000);
        System.out.println("El perimetro del circulo es: " + (double) Math.round(PerimetroCirculo * 1000)/1000);
    }
}