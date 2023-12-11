/**
 * Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
 * Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego 
 * mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y 
 * por debajo de la media.
 * 
 * @author Manuel López Mairate
 */

public class Ejercicio3 {
    public static void main(String[] args) {

        double media = 0;
        double suma_altura = 0;
        double mayor = 0;
        double menor = 0;

        int contador_encimamedia = 0;
        int contador_debajomedia = 0;

        System.out.print("Inserte la cantidad de altura que va a insertar: ");
        int cantidad_alturas = Integer.parseInt(System.console().readLine());
        


        //Creación de el array y un for para calcular la media de las alturas
        double[] altura = new double[cantidad_alturas];
        for (int i = 0; i<altura.length ;i++){


            System.out.println("Inserte la altura numero: " + i);
            altura[i] = Double.parseDouble(System.console().readLine());


            suma_altura = suma_altura + altura[i];

            mayor = altura[0];
            if (mayor > altura[i]){
                mayor = mayor;
            }else if( mayor < altura[i]){
                mayor = altura[i];
            }

            menor = altura[0];
            if(menor > altura[i]){
                menor = altura[i];
            }else if(menor < altura[i]){
                menor = menor;
            }
        };


        media = (suma_altura / cantidad_alturas );
        System.out.println(" ");
        System.out.println("La altura media es: " + media);
        System.out.println(" ");
        System.out.println("La altura mas alta es: " + mayor);
        System.out.println(" ");
        System.out.println("La altura mas baja es: " + menor);
        System.out.println(" ");



        //for para saber cuantos de ellos están por encima de la media y cuantos por debajo de la media
        for (int i = 0; i<altura.length ;i++){


            if (altura[i] > media){
                contador_encimamedia++;
            }else{
                contador_debajomedia++;
            }
        
        }

        System.out.println("Contador de personas por encima de la media: " + contador_encimamedia);
        System.out.println(" ");
        System.out.println("Contador de personas por debajo de la media: " + contador_debajomedia);
  
    }
}
