import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int dia;
        dia = lector.nextInt();
        lector.close();
        System.out.println("El numero digitado es: " + dia);
    }
}
