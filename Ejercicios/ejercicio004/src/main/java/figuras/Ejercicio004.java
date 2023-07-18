
package figuras;

import figuras.entidades.Rectangulo;
import figuras.servicios.ServicioRectangulo;
import java.util.Scanner;

    /*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
    base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
    con los datos del Rectángulo dados por el usuario. También incluirá un método para
    calcular la superficie del rectángulo y un método para calcular el perímetro del
    rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
    asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
    setters y constructores correspondientes.
    Superficie = base * altura / Perímetro = (base + altura) * 2.*/
public class Ejercicio004 {

    public static void main(String[] args) {
        int opcion;
        float area, perimetro;
        Scanner leer = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();
        ServicioRectangulo servicio = new ServicioRectangulo();
        do{
            System.out.printf("\n%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n"
                +"%25s%s\n\n",
                "","1. Ingresar valores",
                "","2. Calcular área",
                "","3. Calcular perímetro",
                "","4. Dibujo",
                "","5. Salir");
            System.out.printf("%20s","Opción(1-5):");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    rectangulo = servicio.crearRectangulo();
                    break;
                case 2:
                    area = servicio.calcularArea(rectangulo.getBase(), rectangulo.getAltura());
                    System.out.printf("\n%10s%5.2f","Area: ",area);
                    break;
                case 3:
                    perimetro = servicio.calcularPerimetro(rectangulo.getBase(), rectangulo.getAltura());
                    System.out.printf("\n%10s%5.2f","Area: ",perimetro);
                    break;
                case 4:
                    servicio.dibujarReactangulo(rectangulo.getBase(), rectangulo.getAltura());
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
