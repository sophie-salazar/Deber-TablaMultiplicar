
package com.mycompany.operaciones;

import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hasta que numero desea ver las tablas de multiplicar? ");
        int hasta = scanner.nextInt();

        // Crear una lista de tablas
        TablaMultiplicar[] tablas = new TablaMultiplicar[hasta - 1];
        
        for (int i = 2; i <= hasta; i++) {
            // Aquí se crea la tabla en orden ascendente
            tablas[i - 2] = new TablaAscendente(i);
        }

        // Interacción con el usuario
        System.out.print("Deseas ver las tablas en orden descendente (si/no)? ");
        String respuesta = scanner.next().toLowerCase();

        if (respuesta.equals("sí") || respuesta.equals("si")) {
            for (int i = 0; i < tablas.length; i++) {
                tablas[i] = new TablaDescendente(i + 2); // Convertimos a tabla descendente
            }
        }

        // Mostrar las tablas de multiplicar
        System.out.println("\nTablas de multiplicar:");
        int sumaTotal = 0;
        for (int i = 0; i < tablas.length; i++) {
            System.out.println("\nTabla del " + (i + 2) + ":");
            tablas[i].mostrarTabla();
            sumaTotal += tablas[i].sumarResultados();
        }

        // Mostrar la suma total de los resultados
        System.out.println("\nLa suma total de todos los resultados es: " + sumaTotal);

        scanner.close();
    }
}