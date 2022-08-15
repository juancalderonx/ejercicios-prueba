package Package;

/*
Realice una función que realice una multiplicación de dos números sin usar el símbolo “por” (*)
 */

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite un número");
        int num1 = entrada.nextInt();
        System.out.println("Digite otro número");
        int num2 = entrada.nextInt();

        multiplicacion(num1,num2);

    }

    public static void multiplicacion(int num1, int num2) {

        int suma = 0;

        if(num1 < num2) {
            for (int i = 1; i <= num1; i++) {
                suma += num2;
            }
        } else {
            for (int i = 1; i <= num2; i++) {
                suma += num1;
            }
        }

        System.out.println(num1 + " * " + num2 + " = " + suma);

    }
}