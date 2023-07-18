package enfermeria;

import enfermeria.entidades.Persona;
import enfermeria.servicios.ServicioPersona;

public class Ejercicio007 {

    /*A continuación, en la clase main hacer lo siguiente:
        Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
        los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
        tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
        persona es mayor de edad.
        Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
        distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

        cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
        también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores*/
    public static void main(String[] args) {
        ServicioPersona servicio = new ServicioPersona();
        int totalPersonas = 4;
        int totalMayores = 0;
        int porDebajoPeso = 0;
        int pesoIdeal = 0;
        int sobrepeso = 0;
        float porcentajetotalMayores = 0;
        float porcentajePorDebajoPeso = 0;
        float porcentajePesoIdeal = 0;
        float porcentajeSobrepeso = 0;

        Persona p1 = servicio.crearPersona("Maria", 61, 'M', 75, 1.59f);
        Persona p2 = servicio.crearPersona("Humberto", 62, 'H', 75, 1.80f);
        Persona p3 = servicio.crearPersona("Poli", 75, 'M', 35, 1.59f);
        Persona p4 = servicio.crearPersona("Copito", 17, 'H', 60, 1.59f);

        int imcP1 = servicio.calcularIMC(p1.getPeso(), p1.getAltura());
        int imcP2 = servicio.calcularIMC(p2.getPeso(), p2.getAltura());
        int imcP3 = servicio.calcularIMC(p3.getPeso(), p3.getAltura());
        int imcP4 = servicio.calcularIMC(p4.getPeso(), p4.getAltura());

        if (imcP1 == -1) {
            porDebajoPeso++;
            System.out.println(p1.getNombre() + " está por debajo de su peso ideal");
        } else if (imcP1 == 0) {
            pesoIdeal++;
            System.out.println(p1.getNombre() + " está en su peso ideal");
        } else {
            sobrepeso++;
            System.out.println(p1.getNombre() + " tiene sobrepeso");
        }

        boolean esMayorP1 = servicio.esMayorDeEdad(p1.getEdad());
        if (esMayorP1) {
            totalMayores++;
        }

        if (imcP2 == -1) {
            porDebajoPeso++;
            System.out.println(p2.getNombre() + " está por debajo de su peso ideal");
        } else if (imcP1 == 0) {
            pesoIdeal++;
            System.out.println(p2.getNombre() + " está en su peso ideal");
        } else {
            sobrepeso++;
            System.out.println(p2.getNombre() + " tiene sobrepeso");
        }

        boolean esMayorP2 = servicio.esMayorDeEdad(p2.getEdad());
        if (esMayorP2) {
            totalMayores++;
        }

        if (imcP3 == -1) {
            porDebajoPeso++;
            System.out.println(p3.getNombre() + " está por debajo de su peso ideal");
        } else if (imcP3 == 0) {
            pesoIdeal++;
            System.out.println(p3.getNombre() + " está en su peso ideal");
        } else {
            sobrepeso++;
            System.out.println(p3.getNombre() + " tiene sobrepeso");
        }

        boolean esMayorP3 = servicio.esMayorDeEdad(p3.getEdad());
        if (esMayorP3) {
            totalMayores++;
        }

        if (imcP4 == -1) {
            porDebajoPeso++;
            System.out.println(p4.getNombre() + " está por debajo de su peso ideal");
        } else if (imcP4 == 0) {
            pesoIdeal++;
            System.out.println(p4.getNombre() + " está en su peso ideal");
        } else {
            sobrepeso++;
            System.out.println(p4.getNombre() + " tiene sobrepeso");
        }

        boolean esMayorP4 = servicio.esMayorDeEdad(p4.getEdad());
        if (esMayorP4) {
            totalMayores++;
        }
        
        porcentajetotalMayores = (float)(totalMayores*100)/totalPersonas;
        porcentajePorDebajoPeso = (float)(porDebajoPeso*100)/totalPersonas;
        porcentajePesoIdeal = (float)(pesoIdeal*100)/totalPersonas;
        porcentajeSobrepeso = (float)(sobrepeso*100)/totalPersonas;
        
        System.out.println("% de personas mayores de edad: " + porcentajetotalMayores);
        System.out.println("% de personas por debajo de su peso ideal: " + porcentajePorDebajoPeso);
        System.out.println("% de personas en su peso ideal: " + porcentajePesoIdeal);
        System.out.println("% de personas que posee sobrepeso: " + porcentajeSobrepeso);
    }
}
