/**
 * Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
 *  utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
 * cuántos valores del array son igual o superiores a R.
 * 
 * @author Manuel López Mairate
 */

public class Ejercicio1{
    public static void main(String[] args) {

        //Contador para las veces que un numero es igual al real
        int contador = 0;

      
        

        //Array que almacena 100 numero con un for el cual va añadiendo un numero aleatorio con math random
        double[] numero = new double[100];
        for (int i = 0; i<numero.length;i++){

            numero[i] = Math.random();
            

        }

        //Pedir el valor real
        System.out.println("Inserte un valor real");
        double numerodecimal = Double.parseDouble(System.console().readLine());
        
        //For con un if que dice si el numero es mayor
        for (int i = 0; i<numero.length; i++){
            if (numerodecimal <= numero [i]){
                contador++;
            }
        }

        System.out.println("Numeros superiores o iguales: " + contador);
    }
}