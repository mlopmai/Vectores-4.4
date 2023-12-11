/**
 * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con 
 * distintas opciones La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una  
 * posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta que el usuario elija la opción ‘c’ que terminará el programa
 * 
 * @author Manuel López Mairate
 */

public class Ejercicio5 {
    public static void main(String[] args) {


        int contador = 0;
        int valor = 0;
        int posicion = 0;
        int[] numero = new int[10];


        String opcion;


        //Este do hará en bucle el switch mientas la opción sea distinta que "c"
        do {
            System.out.println("---Menú---");
            System.out.println("-a) Mostrar valores");
            System.out.println("b) Introducir valores");
            System.out.println("c) Salir");
            System.out.println("----------");
            System.out.println("");
            System.out.print("Elija una opción: ");
            opcion = System.console().readLine();

            switch (opcion) {
                case "a":

                    //Este for mostrará de uno en uno todos los valores de el array
                    System.out.println("Valores: ");
                    for (int i = 0; i<numero.length; i++){
                        System.out.println("Valor " + contador + "= " +numero[i]);
                        contador ++;
                    }

                    System.out.print("Pulse Enter para continuar:");
                    System.console().readLine();
                    break;

                case "b":

                    //Aquí cambiaremos el valor de el array eligiendo posición y valor
                    System.out.println("Cambiando valores...");
                    System.out.print("Inserte el valor que desea introducir: ");
                    valor = Integer.parseInt(System.console().readLine());
                    System.out.print("Inserte la posción en la que desea introducir el valor: ");
                    posicion = Integer.parseInt(System.console().readLine());

                    numero[posicion] = valor;
                    break;

                case "c":

                    System.out.println("Cerrando programa...");
                    break;

                default:
                    System.out.println("Opción Erronea o Inexistente");
                    break;
            }

        } while (!opcion.equals("c"));

    }
}
