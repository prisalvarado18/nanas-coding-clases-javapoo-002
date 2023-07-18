/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.servicios;

import figuras.entidades.Rectangulo;
import java.util.Scanner;

/*La clase incluirá un método para crear el rectángulo
    con los datos del Rectángulo dados por el usuario. 

    También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del
    rectángulo. 

    Por último, tendremos un método que dibujará el rectángulo mediante
    asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
    setters y constructores correspondientes.
    Superficie = base * altura / Perímetro = (base + altura) * 2.*/
public class ServicioRectangulo {
    public Rectangulo crearRectangulo (){
        float base, altura;
        Scanner leer = new Scanner(System.in);
        System.out.printf("\n%15s","Base: ");
        base = Float.valueOf(leer.nextLine());
        System.out.printf("\n%15s","Altura: ");
        altura = Float.valueOf(leer.nextLine());
        return new Rectangulo(base,altura);
    }
    
    public float calcularArea(float base, float altura){
        float area = base * altura;
        return area;
    }
    
    public float calcularPerimetro(float base, float altura){
        float perimetro = 2*(base + altura);
        return perimetro;
    }
    
    public void dibujarReactangulo(float base, float altura){
        /*for(int i=0; i<base; i++){
             System.out.print("*");
        }*/
        String [][] dibujo = new String[(int)altura][(int)base];
        
        for(int i=0; i<altura; i++){
            for(int j=0; j<base; j++){
                if(i==0||j==0||i==altura-1||j==base-1){
                    dibujo[i][j]="*";
                } else {
                    dibujo[i][j]=" ";
                }
            }
        }
        
        for(int i=0; i<altura; i++){
            for(int j=0; j<base; j++){
                System.out.print(dibujo[i][j]);
            }
            System.out.println();
        }
       
    }
}
