/*
 * El siguiente ejercicio le soliicta al usuario un dato y el sistena le retornara
 * el correspondiente dia de la semana al que corresponde el numero.
 * para efectos del ejercicio se utiliza el dia lunes como primer dia de la semana.
 * 
 * Fases del ejercicio:
 * 1. Intriducir datos.
 * 2. Validar datos.
 * 3. Ejecutar instrucciones.
 * 4. Imprimir resultados.
 */

import java.util.Scanner;

public class Ejercicio1a {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int dia;
        try {
            dia = lector.nextInt();
        } catch (Exception ex) {
            dia = 9;
        }

        lector.close();
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia no valido");
        }
        System.out.println("El numero digitado es: " + dia);
    }
}
