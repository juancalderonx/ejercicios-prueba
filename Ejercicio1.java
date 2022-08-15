package Package;

// Escriba un programa que calcule el promedio de n notas ingresadas por el usuario.

import java.util.Scanner;

public class Ejercicio1 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Por favor digite el total de notas a ingresar");
        int cantidadNotas = entrada.nextInt();

        calcularPromedio(cantidadNotas);

    }

    public static void calcularPromedio(int n){

        int total = 0;

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Digita al nota #"+ (i+1) +"");
            int nota = entrada.nextInt();
            total += nota;
        }

        double promedio = (double) total / n;
        System.out.println("El promedio es: " + promedio);

    }

}
