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
        int outputdata[];
        outputdata = new int[3]; // AlmacenarÃ© los datos para iterar al final los mensajes
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

        outputdata[0] = average;
        outputdata[1] = major;
        outputdata[2] = minor;

        for (int i = 0; i < 3; i++) {
            if (outputdata[i] > 80 && outputdata[i] <= 100) {
                System.out.println("INVIABLE SANITARIAMENTE");
            } else if (outputdata[i] > 35 && outputdata[i] <= 80) {
                System.out.println("ALTO");
            } else if (outputdata[i] > 14 && outputdata[i] <= 35) {
                System.out.println("MEDIO");
            } else if (outputdata[i] > 5 && outputdata[i] <= 14) {
                System.out.println("BAJO");
            } else if (outputdata[i] >= 0 && outputdata[i] <= 5)
                System.out.println("SIN RIESGO");
        }

    }
}