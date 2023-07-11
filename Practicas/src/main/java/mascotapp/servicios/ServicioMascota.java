
package mascotapp.servicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota {
    private Scanner leer = new Scanner(System.in);
    public Mascota crearMascota(){
        String nombre, apodo, tipo;
        
        System.out.printf("%10s","Nombre: ");
        nombre=leer.nextLine();
        System.out.printf("%10s","Apodo: ");
        apodo=leer.nextLine();
        System.out.printf("%10s","Tipo: ");
        tipo=leer.nextLine();
        
        return new Mascota(nombre, apodo, tipo);
    }
}
