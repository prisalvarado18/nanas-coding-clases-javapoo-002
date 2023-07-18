
package banco;

import banco.entidades.Cuenta;
import banco.servicios.ServicioCuenta;
import java.util.Scanner;

public class Ejercicio005 {

    public static void main(String[] args) {
        int opcion;
        double deposito, retiro;
        Scanner leer = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        ServicioCuenta servicio = new ServicioCuenta();
        do{
            System.out.printf("\n%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n\n",
                "","1. Ingresar datos",
                "","2. Realizar un depósito",
                "","3. Retirar dinero",
                "","4. Extracción rápida",
                "","5. Consultar saldo",
                "","6. Consultar datos", 
                "","7. Salir");
            System.out.printf("%20s","Opción(1-7):");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    cuenta = servicio.crearCuenta();
                    break;
                case 2:   
                    System.out.printf("\n%15s","Ingrese la cantidad que desea depositar: ");
                    deposito = Double.valueOf(leer.next());
                    servicio.ingresar(cuenta, deposito);
                    break;
                case 3:
                    System.out.printf("\n%15s","Ingrese la cantidad que desea retirar: ");
                    retiro = Double.valueOf(leer.next());
                    servicio.retirar(cuenta, retiro);
                    break;
                case 4:
                    servicio.extraccionRapida(cuenta);
                    break;
                case 5:
                    servicio.consultarSaldo(cuenta);
                    break;
                case 6:
                    servicio.consultarDatos(cuenta);
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.printf("\n%20s","Ingrese una opción válida");
                    break;
            }
        }while(opcion !=7);
    }
}
