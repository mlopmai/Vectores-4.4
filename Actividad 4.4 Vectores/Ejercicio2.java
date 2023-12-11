/**
 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores 
 * enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y 
 * mostrará en qué posiciones del array aparece N. 
 * 
 * @author Manuel López Mairate
 */


public class Ejercicio2 {
    public static void main(String[] args) {

        //Contador para las veces que un numero es igual al introducido
        int contador = 0;

        


        //For el cual da numeros aleatorios al array y luego los compara con el numero introducido, sumandole al contador
        int[] numero = new int[100];
        for (int i = 0; i<numero.length;i++){

            //10 en el Math.random para que el numero maximo sea 10 y +1 para que el numero minimo sea 1
            numero[i] = (int)(Math.random()*10)+1;

        } 

        System.out.println("Inserte un numero entero");
        int n = Integer.parseInt(System.console().readLine());


        //For con un if para que si el numero es igual al introducido
        for (int i = 0; i< numero.length; i++){

            if (numero[i] == n){
                contador++;
            }

        }

        System.out.println("Numeros iguales al introducido: " + contador);
    }
}
