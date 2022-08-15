package Package;

/*
Escriba un programa que pida al usuario dos números enteros, y luego entregue la suma de todos los números que
están entre ellos. Por ejemplo, si los números son 1 y 7, debe entregar como resultado 2 + 3 + 4 + 5 + 6 = 20.
 */

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor digite un número");
        int num1 = entrada.nextInt();
        System.out.println("Por favor otro número");
        int num2 = entrada.nextInt();

        int contador = 0;

        for (int i = num1+1; i < num2; i++) {
            contador += i;
        }

        System.out.println(contador);

    }

}