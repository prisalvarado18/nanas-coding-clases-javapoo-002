/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cafeteria;

import cafeteria.entidades.Cafetera;
import cafeteria.servicios.ServicioCafetera;
import java.util.Scanner;

/**
 *
 * @author palva
 */
public class Ejercicio006 {

    public static void main(String[] args) {
        int opcion;
        float cantidadActual, tamanoTaza, cafeAnadido;
        Scanner leer = new Scanner(System.in);
        Cafetera cafetera = new Cafetera();
        ServicioCafetera servicio = new ServicioCafetera();
        do{
            System.out.printf("\n%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n\n",
                "","1. Llenar cafetera",
                "","2. Servir taza",
                "","3. Vaciar cafetera",
                "","4. Agregar café",
                "","5. Salir");
            System.out.printf("%20s","Opción(1-5):");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    servicio.llenarCafetera(cafetera);
                    break;
                case 2:   
                    System.out.printf("\n%15s", "Tamaño de taza vacía: ");
                    tamanoTaza = Float.valueOf(leer.next()); 
                    servicio.servirTaza(cafetera, tamanoTaza);
                    break;
                case 3:
                    servicio.vaciarCafetera(cafetera);
                    break;
                case 4:
                    System.out.printf("\n%15s","Cantidad de café a añadir: ");
                    cafeAnadido = Float.valueOf(leer.next());
                    servicio.agregarCafe(cafetera, cafeAnadido);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.printf("\n%20s","Ingrese una opción válida");
                    break;
            }
        }while(opcion !=5);
    }
}
