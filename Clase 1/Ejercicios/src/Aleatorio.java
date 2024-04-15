import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100); // Genera un numero aleatorio entre 0 al 100
        int intentos = 0;

        while (intentos < 5) {
            System.out.print("Ingrese un numero del 0 al 100:"); //Pide al usuario el primer numero
            int numUsuario = teclado.nextInt();
            intentos++;
            // realiza la comparacion del numero del usuario al que se genero
            if (numUsuario == numeroAleatorio){
                System.out.println("Adivinaste el número");
                break;
            } else if( numUsuario < numeroAleatorio){
                System.out.println("El numero que escribio es MENOR al que se genero");
            } else{
                System.out.println("El numero que escribio es MAYOR al que se genero");
            }
        }
        if (intentos == 5){
            System.out.println("Perdio, el numero aleatorio era: " + numeroAleatorio);
        }
    }
}
