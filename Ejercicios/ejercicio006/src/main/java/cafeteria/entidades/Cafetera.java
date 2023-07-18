
package cafeteria.entidades;
        /*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
        (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
        cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
        métodos:
         Constructor predeterminado o vacío
         Constructor con la capacidad máxima y la cantidad actual
         Métodos getters y setters.
        */
public class Cafetera {
    private float capacidadMaxima;
    private float cantidadActual;

    public Cafetera(){
        this.capacidadMaxima = 100;
        this.cantidadActual = 0;
    };    
    
    public Cafetera(float capacidadMaxima, float cantidadActual){
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public float getCapacidadMaxima(){
        return capacidadMaxima;
    }
    
    public float getCantidadActual(){
        return cantidadActual;
    }
    
    public void setCapacidadMaxima(float capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
    }
    
    public void setCantidadActual(float cantidadActual){
        this.cantidadActual = cantidadActual;
    }
    
}
