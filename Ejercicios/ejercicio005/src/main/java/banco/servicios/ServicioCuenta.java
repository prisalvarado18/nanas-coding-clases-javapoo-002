
package banco.servicios;

import banco.entidades.Cuenta;
import java.util.Scanner;

        /*c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
        d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
        y se la sumara a saldo actual.
        e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
        la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
        pondrá el saldo actual en 0.
        f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
        usuario no saque más del 20%.
        g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
        h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
public class ServicioCuenta {
    public Cuenta crearCuenta (){
        int numeroCuenta;
        long dni;
        Scanner leer = new Scanner(System.in);
        System.out.printf("\n%15s","Ingrese su número de cuenta: ");
        numeroCuenta = Integer.valueOf(leer.nextLine());
        System.out.printf("\n%15s","Ingrese su DNI: ");
        dni = Long.valueOf(leer.nextLine());
        return new Cuenta(numeroCuenta,dni);
    }
    
    public void ingresar(Cuenta cuenta, double ingreso){
        cuenta.setSaldoActual(cuenta.getSaldoActual()+ingreso);
    }
    
    public void retirar(Cuenta cuenta, double retiro){
        cuenta.setSaldoActual(cuenta.getSaldoActual()- retiro);
    }
    
    public void extraccionRapida(Cuenta cuenta){
        double saldoActual = cuenta.getSaldoActual();
        double limiteExtraccion = saldoActual*0.2;
        
        if(limiteExtraccion>1){
            cuenta.setSaldoActual(saldoActual-limiteExtraccion);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void consultarSaldo(Cuenta cuenta){
        System.out.println(cuenta.getSaldoActual());
    }
    
    public void consultarDatos(Cuenta cuenta){
        System.out.println("DNI: " + cuenta.getDni());
        System.out.println("Nro. cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }
}
