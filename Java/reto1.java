/*
 * Reto No. 1
 * 
 * Se requiere leer un vector de tamano n de entrada en el que cada
 * elemento indique el porcentaje de la clasificacion IRCA.
 * 
 * SALIDAS:
 *  a.average de nivel de riesgo de la calidad del agua segun los datos ingresados
 *  b.Nivel de riesgo mas alto encontrado en la calidad del agua.
 *  c.Nivel de riesgo mas bajo encontrado en la calidad del agua.
 * 
 * Ejemplo:
 *  Ingresos:
 *      7,7,9,5,30,70,25,4
 *      
 */

import java.util.Scanner;

public class reto1 {

    public static void main(String[] args) {
        // INSTANCIAR SCANNER
        Scanner keyboard = new Scanner(System.in);

        // DEFINIR VARIABLES;
        int n = 0;
        int salida[];
        salida = new int[3]; // Almacenaré los datos para iterar al final los mensajes
        int average = 0;
        int major = 0;
        int minor = 100;
        int array[];

        // OBTENER TAMANO DEL ARREGLO POR EL USUARIO
        try {
            n = keyboard.nextInt(); // Obtiene el numero que sera el tamano del arreglo
        } catch (Exception exc) {
            System.out.println("Error interno");
        }

        array = new int[n]; // Creaccion del objeto para almacenar
        try {
            // Para cada indice del array obtenemos los datos, el tamano del arreglo es la
            // misma n
            for (int i = 0; i < n; i++) {
                array[i] = keyboard.nextInt(); // Se captura del dato ingresado y se almacena en el indice de i
            }
        } catch (Exception exc) {
            System.out.println("Error Interno al intentar almacenar los datos ingresados");
        }

        // SALIDAS
        /*
         * Calcular el average de los valores ingresados.
         * 
         * a. Average
         * b. Mayor
         * c. Menor
         */
        // ----------
        for (int i = 0; i < n; i++) {
            average = average + array[i]; // Iteramos cada registro del array
            // Utilizo operador ternario para reducir codigo
            major = (array[i] > major) ? array[i] : major; // Identificamos el mayor
            minor = (array[i] < minor) ? array[i] : minor; // Identificamos el menor
        }
        average = average / n; // Calulamos el average.
        // Almaceno no valores optenidos de las anteriores instrucciones para iterar
        // posteriormente a cada
        // uno de los valores y evitar duplicar el codigo de los if.

        salida[0] = average;
        salida[1] = major;
        salida[2] = minor;

        for (int i = 0; i < 3; i++) {
            if (salida[i] > 80 && salida[i] <= 100) {
                System.out.println("INVIABLE SANITARIAMENTE");
            } else if (salida[i] > 35 && salida[i] <= 80) {
                System.out.println("ALTO");
            } else if (salida[i] > 14 && salida[i] <= 35) {
                System.out.println("MEDIO");
            } else if (salida[i] > 5 && salida[i] <= 14) {
                System.out.println("BAJO");
            } else if (salida[i] >= 0 && salida[i] <= 5)
                System.out.println("SIN RIESGO");
        }

    }
}