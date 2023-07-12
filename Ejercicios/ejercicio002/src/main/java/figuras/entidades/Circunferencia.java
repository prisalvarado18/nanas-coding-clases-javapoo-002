
package figuras.entidades;
        /*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
        tipo real. A continuación, se deben crear los siguientes métodos:
        a) Método constructor que inicialice el radio pasado como parámetro.
        b) Métodos get y set para el atributo radio de la clase Circunferencia.*/

public class Circunferencia {
    private float radio;

    public Circunferencia() {
    }

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    
}
