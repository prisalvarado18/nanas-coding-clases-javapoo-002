
package cafeteria.servicios;
                            /* Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
                            máxima.
                             Método servirTaza(float): se pide el tamaño de una taza vacía, el método recibe el
                            tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
                            cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
                            método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
                            cuanto quedó la taza.
                             Método vaciarCafetera(): pone la cantidad de café actual en cero.
                             Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
                            recibe y se añade a la cafetera la cantidad de café indicada.*/
import cafeteria.entidades.Cafetera;

public class ServicioCafetera {
    public void llenarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }
    
    public void servirTaza(Cafetera cafetera, float tamanoTaza){
        float cantidadActual = cafetera.getCantidadActual();
        if(cantidadActual>=tamanoTaza){
            cafetera.setCantidadActual(cantidadActual-tamanoTaza);
            System.out.println("Se sirvió una taza de " + tamanoTaza + "ml");
        }else{
            System.out.println("Cantidad de café en la cafetera es insuficiente");
            System.out.println("Se sirvió una taza de " + cantidadActual + "ml");
            cafetera.setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera cafetera, float cafeAnadido){
        float nuevaCantidad = cafetera.getCantidadActual() + cafeAnadido;
        cafetera.setCantidadActual(nuevaCantidad);
        if(nuevaCantidad>cafetera.getCapacidadMaxima()){
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        }else{
            cafetera.setCantidadActual(nuevaCantidad);
        }
    }
           
}
