/**
 * Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el 
 * primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del 
 * primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
 * 
 * @author Manuel López Mairate
 */


public class Ejercicio4 {
    public static void main(String[] args) {
        
        //Primer array el cual tiene un contador para ir sumandole e ir dandole valor a este.
        int[] num = new int[100];
        int contador = 1;
        int contador_reverse = 100;
        for(int i = 0; i<num.length; i++){

            num[i] = contador;
            System.out.println(num[i]);
            contador++;
        }


        //Segundo array el cual tiene copia el array de forma inversa
        int y = 99;
        int[] inverso = new int[100];
        for (int i = 0; i<inverso.length; i++){

            inverso[i] = num[y];
            System.out.println(inverso[i]);
            y--;

        }

    }
}
