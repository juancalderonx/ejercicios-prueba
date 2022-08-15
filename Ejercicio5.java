package Package;

import java.util.Scanner;

/*
Escriba un programa que permita determinar el número mayor perteneciente a un conjunto de n números,
donde tanto el valor de n como el de los números deben ser ingresados por el usuario.
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el tamaño del conjunto de datos");
        int tamaño = entrada.nextInt();

        int datos [] = new int[tamaño];

        for (int i = 0; i < datos.length; i++) {
            System.out.println("Por favor digite un número para la posición " + (i+1));
            datos[i] = entrada.nextInt();
        }

        int numMayor = datos[0];

        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > numMayor) {
                numMayor = datos[i];
            }
        }

        System.out.println("El número mayor es: " + numMayor);

    }
}