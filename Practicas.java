package com.mycompany.practicas;

import java.util.Scanner;

public class Practicas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limite = 0;
        int suma = 0;
    
        System.out.print("Ingrese el limite del numero: ");
        limite = in.nextInt();
        
        for (int i = 2; i < limite; i++) {
            if (esPrimo(i)) {
                System.out.println(i + " es Numero primo");
                suma +=  i; 
            }
        } 
        
        System.out.println("La suma de los numeros primos hasta " + limite + " es " + suma);
    }
    
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        
        int raiz = (int) Math.sqrt(n);
        
        for (int i = 2; i <= raiz; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
