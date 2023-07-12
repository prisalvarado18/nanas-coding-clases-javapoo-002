
package figuras;

import figuras.entidades.Circunferencia;
import figuras.servicios.ServicioCircunferencia;

public class Ejercicio002 {
    /*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
    tipo real. A continuación, se deben crear los siguientes métodos:
        a) Método constructor que inicialice el radio pasado como parámetro.
        b) Métodos get y set para el atributo radio de la clase Circunferencia.
        c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
        objeto.
        d) Método calcularArea(): para calcular el área de la circunferencia (Area = π ∗ radio2).
        e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).*/
    public static void main(String[] args) {   
        ServicioCircunferencia s1 = new ServicioCircunferencia();
        Circunferencia circunferencia = s1.crearCircunferencia();
        s1.imprimirDatos(circunferencia);
    }
}
