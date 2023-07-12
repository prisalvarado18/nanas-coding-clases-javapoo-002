package figuras.servicios;

import figuras.entidades.Circunferencia;
import java.util.Scanner;
        /*c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
        objeto.
        d) Método calcularArea(): para calcular el área de la circunferencia (Area = π ∗ radio2).
        e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).*/
public class ServicioCircunferencia {

    public Circunferencia crearCircunferencia() {
        float radio;
        Scanner leer = new Scanner(System.in);
        System.out.printf("%10s", "Radio: ");
        radio = Float.valueOf(leer.nextLine());
        return new Circunferencia(radio);
    }

    public float calcularArea(float radio) {
        //Area = π ∗ radio2
        float area;
        area = (float) Math.PI * (radio * radio);
        return area;
    }

    public float calcularPerimetro(float radio) {
        //Perimetro = 2 ∗ π ∗ radio
        float perimetro = (float) Math.PI * radio * 2;
        return perimetro;
    }
    
    public void imprimirDatos(Circunferencia circunferencia){
        System.out.printf("%20s\n","DATOS DE LA CIRCUNFERENCIA");
        System.out.printf("%12s%5.2f\n","Radio: ",circunferencia.getRadio());
        System.out.printf("%12s%5.2f\n","Área: ",calcularArea(circunferencia.getRadio()));
        System.out.printf("%12s%5.2f\n","Perímetro: ",calcularPerimetro(circunferencia.getRadio()));
    }
}
