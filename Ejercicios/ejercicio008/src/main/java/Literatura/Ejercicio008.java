
package Literatura;

import Literatura.entidades.Cadena;
import Literatura.servicios.ServicioCadena;
import java.util.Scanner;

/**
 *
 * @author palva
 */
public class Ejercicio008 {

    public static void main(String[] args) {
        int opcion;
        String frase, fraseInvertida, nuevaFrase;
        char caracter;
        int cantidadVocales, repeticiones;
        boolean contieneLetra;
        Scanner leer = new Scanner(System.in);
        System.out.printf("\n%15s","Ingrese una frase: ");
        frase = String.valueOf(leer.nextLine());
        Cadena cadena = new Cadena(frase);
        ServicioCadena servicio = new ServicioCadena();
        do{
            System.out.printf("\n%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n\n",
                "","1. Mostrar vocales",
                "","2. Invertir frase",
                "","3. Cantidad de repeticiones",
                "","4. Comparar longitud",
                "","5. Unir frases",
                "","6. Reemplazar letra 'a' ",
                "","7. Determinar si contiene una letra", 
                "","8. Salir");
            System.out.printf("%20s","Opción(1-8): ");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    cantidadVocales = servicio.mostrarVocales(cadena);
                    System.out.println("Cantidad de vocales: " + cantidadVocales);
                    break;
                case 2:   
                    fraseInvertida = servicio.invertirFrase(cadena);
                    System.out.println("Frase invertida: " + fraseInvertida);
                    break;
                case 3:
                    System.out.printf("\n%15s","Ingrese un carácter: ");
                    caracter = leer.next().charAt(0);
                    repeticiones = servicio.vecesRepetido(cadena, caracter);
                    System.out.println(caracter + " se repite " + repeticiones + " veces.");
                    break;
                case 4:
                    System.out.printf("\n%15s","Ingrese una nueva frase: ");
                    leer.nextLine();
                    nuevaFrase = leer.nextLine();
                    servicio.compararLongitud(cadena, nuevaFrase);
                    break;
                case 5:
                    System.out.printf("\n%15s","Ingrese una nueva frase: ");
                    leer.nextLine();
                    nuevaFrase = leer.nextLine();
                    servicio.unirFrases(cadena, nuevaFrase);
                    break;
                case 6:
                    System.out.printf("\n%15s","Ingrese un carácter: ");
                    caracter = leer.next().charAt(0);
                    servicio.reemplazar(cadena, caracter);
                    break;
                case 7:
                    System.out.printf("\n%15s","Ingrese una letra: ");
                    caracter = leer.next().charAt(0);
                    contieneLetra = servicio.contiene(cadena, caracter);
                    if(contieneLetra){
                        System.out.println(cadena.getFrase() + " SÍ contiene la letra " + caracter);
                    }else{
                        System.out.println(cadena.getFrase() + " NO contiene la letra " + caracter);
                    }
                    break;
                case 8:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.printf("\n%20s","Ingrese una opción válida");
                    break;
            }
        } while(opcion !=8);
    }
}
