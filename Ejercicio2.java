package Package;

/*
Escriba un programa que pida al usuario un entero de tres dígitos, y entregue el número con los
dígitos en orden inverso (ejemplo: 345 resultado 543)
 */

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        int numero;
        int resto;
        int invertido = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor digita un número de 3 dígitos");
        numero = entrada.nextInt();

        while(numero > 0 ) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }

        System.out.println( "Número invertido: " + invertido );

    }

}