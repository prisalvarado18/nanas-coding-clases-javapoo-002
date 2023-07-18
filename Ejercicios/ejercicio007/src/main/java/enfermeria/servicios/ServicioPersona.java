package enfermeria.servicios;

import enfermeria.entidades.Persona;

/* Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
                            al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
                            Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
                            O. Si no es correcto se deberá mostrar un mensaje*/

 /*Método calcularIMC(): calcular si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
                            Si esta fórmula da por resultado un valor menor que 20,
                            significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
                            Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
                            persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
                            de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
                            función devuelve un 1.*/

 /* Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
                            devuelve un booleano.*/
public class ServicioPersona {

    public Persona crearPersona(String nombre, int edad, char sexo, float peso, float altura) {
        do {
            if (sexo != 'H' && sexo != 'M' && sexo != 'O') {
                System.out.println("AVISO: M: Mujer, H:Hombre, O:Otro");
            }
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(float peso, float altura) {
        float IMC = peso / (altura * altura);
        if (IMC < 20) {
            return -1;
        } else if (IMC > 20 && IMC < 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }
}
