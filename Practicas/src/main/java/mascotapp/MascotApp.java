/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author palva
 */
public class MascotApp {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Mascota m1 = new Mascota();
        //m1.apodo = "Chiquito";
        //System.out.println(m1.apodo + " " + m1.edad + " " + m1.tipo + " " + m1.color);
        Mascota m1 = new Mascota("Copito", leer.next(), "Gato");
        m1.setNombre("Copooo");
        System.out.println(m1); 
        m1.pasear(10);
        m1.pasear(10,2);
        System.out.println(m1); 
    }
}
