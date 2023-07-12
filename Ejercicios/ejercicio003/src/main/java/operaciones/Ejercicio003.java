
package operaciones;

import java.util.Scanner;
import operaciones.entidades.Operacion;
import operaciones.servicios.ServicioOperaciones;

public class Ejercicio003 {
    public static void main(String[] args) {
        /*ServicioOperaciones s1 = new ServicioOperaciones();
        Operacion operacion = s1.crearOperacion();
        s1.imprimirDatos(operacion);*/
        int opcion;
        float suma, resta, multiplicacion, division;
        Scanner leer = new Scanner(System.in);
        Operacion operacion = new Operacion();
        ServicioOperaciones servicio = new ServicioOperaciones();
        do{
            System.out.printf("\n%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n\n",
                "","1. Ingresar valores",
                "","2. Sumar",
                "","3. Restar",
                "","4. Multiplicar",
                "","5. Dividir",
                "","6. Salir");
            System.out.printf("%20s","Opción(1-6):");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    operacion = servicio.crearOperacion();
                    break;
                case 2:
                    suma = servicio.sumar(operacion.getNumero1(), operacion.getNumero2());
                    System.out.printf("\n%10s%5.2f","Suma: ",suma);
                    break;
                case 3:
                    resta = servicio.restar(operacion.getNumero1(), operacion.getNumero2());
                    System.out.printf("\n%10s%5.2f","Resta: ",resta);
                    break;
                case 4:
                    multiplicacion = servicio.multiplicar(operacion.getNumero1(), operacion.getNumero2());
                    System.out.printf("\n%10s%5.2f","Multiplicación: ",multiplicacion);
                    break;
                case 5:
                    division = servicio.dividir(operacion.getNumero1(), operacion.getNumero2());
                    System.out.printf("\n%10s%5.2f","División: ",division);
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.printf("\n%20s","Ingrese una opción válida");
                    break;
            }
        }while(opcion !=6);
    }
}
