import java.util.Random;
import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int intentos = 5;
        Random numeroMagico = new Random();
        int aleatorio = numeroMagico.nextInt(100);
        System.out.println(aleatorio);


        for (int i = 0; i < intentos; i++) {
            System.out.println("Numero de intento por el usuario : ");
            int usuario = valor.nextInt();
            if (usuario == aleatorio) {
                System.out.println("El número Mágico es : "+ usuario);
                break;
            } else if (usuario < aleatorio) {
                System.out.println("El número mágico es mayor");

            }else{
                System.out.println("El número mágico es menor");
            }
            if (i == (intentos -1) && (usuario != aleatorio)){
                System.out.println("Fin de intentos, Número mágico no encontrado");
                break;
            }

        }



    }
}