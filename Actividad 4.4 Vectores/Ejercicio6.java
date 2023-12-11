/**
 * 
 * Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y 
 * luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un 
 * valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería 
 * 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al 
 * usuario V, I además de N (nº de valores a crear).
 * 
 * @author Manuel López Mairate
 */

public class Ejercicio6 {
    public static void main(String[] args) {

        //Pide los valores necesarios
        System.out.println("Inserte la cantidad de valores que desea almacenar:");
        int cantidadvalores = Integer.parseInt(System.console().readLine());
        System.out.println("");
        System.out.println("Inserte el valor incial:");
        int valorinciail = Integer.parseInt(System.console().readLine());
        System.out.println("");
        System.out.println("Inserte el incremento:");
        int incremento = Integer.parseInt(System.console().readLine());
        System.out.println("");

        //Se crea el array. Es un array el cual tiene un valor principal introducido en pantalla y se le va incrementando por el incremento insertado, dandole valor al array
        int[] secuencia = new int[cantidadvalores];
        secuencia[0]= valorinciail;
        for (int i = 0; i<secuencia.length; i++){

            secuencia[i] = valorinciail;
            valorinciail = valorinciail + incremento;

        }


        //Imprimimos el array
        for (int i = 0; i<secuencia.length; i++){

            System.out.print(secuencia[i] + ", ");

        }

    }
    
}
