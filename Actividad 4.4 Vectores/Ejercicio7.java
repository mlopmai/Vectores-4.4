/**
 * Crea un programa que cree un array de enteros e introduzca la siguiente
 * secuencia de
 * valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10
 * diez veces, y luego la
 * muestre por pantalla.
 * 
 * No se si este ejercicio estará hecho de la manera que usted quiere, debido a
 * que no termino de entenderlo
 * 
 * @author Manuel López Mairate
 */

public class Ejercicio7 {
    public static void main(String[] args) {

        //Esto es para calcular el tamaño de el array
        int tamaño = 10;
        int[] array = new int[tamaño * (tamaño+1) /2];


        //Con este int, pondremos las veces que se repetirá por numero de array, es decir
        //el numero 2, se hará dos veces y se imprimirá dos veces
        int repeticion = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                array[repeticion] = i;
                repeticion++;
            }
        }
        
        //Con este for imprimiremos los valores en pantalla
        for (int i = 0 ; i < array.length; i++){

            System.out.print(array[i] + ",");

        }
    }
}
