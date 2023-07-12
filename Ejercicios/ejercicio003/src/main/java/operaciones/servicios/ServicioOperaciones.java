
package operaciones.servicios;

import java.util.Scanner;
import operaciones.entidades.Operacion;

public class ServicioOperaciones {
    /*d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
        en los atributos del objeto.
        e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
        f) Método restar(): calcular la resta de los números y devolver el resultado al main

        g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
        fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
        Si no, se hace la multiplicación y se devuelve el resultado al main
        h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
        una división por cero, el método devuelve 0 y se le informa al usuario el error se le
        informa al usuario. Si no, se hace la división y se devuelve el resultado al main.*/
    public Operacion crearOperacion(){
        float numero1, numero2;
        Scanner leer = new Scanner(System.in);
        System.out.printf("%20S", "Calculadora");
        System.out.printf("\n%15s","x: ");
        numero1 = Float.valueOf(leer.nextLine());
        System.out.printf("%15s","y: ");
        numero2 = Float.valueOf(leer.nextLine());
        return new Operacion(numero1, numero2);
    }
    
    public float sumar(float a, float b){
        float suma;
        suma = a + b;
        return suma;
    }
    
    public float restar(float a, float b){
        float resta;
        resta = a - b;
        return resta;
    }
    
    public float multiplicar(float a, float b){
        float multiplicacion;    
        
        if(a==0 || b==0){
            return 0;
        } else {
            multiplicacion = a * b;
            return multiplicacion;
        } 
    }
    
    public float dividir(float a, float b){
        float division;
       
        if(b==0){
            return 0;
        } else {
            division = a / b;
            return division;
        }
        
    }
    
}
