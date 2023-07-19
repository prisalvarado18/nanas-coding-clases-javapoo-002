package Literatura.servicios;

import Literatura.entidades.Cadena;

/*Deberá además implementar los
                            siguientes métodos:
                            a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
                            frase ingresada.
                            b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
                            ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
public class ServicioCadena {

    public int mostrarVocales(Cadena cadena) {
        int cantidadVocales = 0;
        int longitudFrase = cadena.getLongitudFrase();
        String frase = cadena.getFrase();
        for (int i = 0; i < longitudFrase; i++) {
            char letra = frase.toUpperCase().charAt(i);
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                cantidadVocales++;
            }
        }
        return cantidadVocales;
    }

    public String invertirFrase(Cadena cadena) {
        String frase = cadena.getFrase();
        int longitudFrase = cadena.getLongitudFrase();
        String nuevaFrase = "";
        for (int i = longitudFrase-1; i >= 0; i--) {
            nuevaFrase += frase.charAt(i);
        }
        return nuevaFrase;
    }

    /*c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
            contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
            d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
    public int vecesRepetido(Cadena cadena, char letra) {
        String frase = cadena.getFrase();
        int longitudFrase = cadena.getLongitudFrase();
        int repeticiones = 0;
        for (int i = 0; i < longitudFrase; i++) {
            if (frase.charAt(i) == letra) {
                repeticiones++;
            }
        }
        return repeticiones;
    }

    /*e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
                compone la clase con otra nueva frase ingresada por el usuario.*/
    public void compararLongitud(Cadena cadena, String nuevaFrase) {
        int longitudFrase = cadena.getLongitudFrase();
        int longitudNuevaFrase = nuevaFrase.length();

        if (longitudFrase < longitudNuevaFrase) {
            System.out.println("La nueva frase es más larga");
        } else {
            System.out.println("La nueva frase es más corta");
        }
    }

    /*f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
                            con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
                            encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
                            la frase resultante.
    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
                            ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
    public void unirFrases(Cadena cadena, String frase) {
        String fraseOriginal = cadena.getFrase();
        String fraseResultante = fraseOriginal + " " + frase;
        System.out.println(fraseResultante);
    }

    public void reemplazar(Cadena cadena, char letra) {
        String frase = cadena.getFrase();
        int longitudFrase = cadena.getLongitudFrase();
        String nuevaFrase = "";
        for (int i = 0; i < longitudFrase; i++) {
            char caracterIngresado = letra;
            if (frase.charAt(i) == 'a') {
                nuevaFrase += caracterIngresado;
            } else {
                nuevaFrase += frase.charAt(i);
            }
        }
        System.out.println(nuevaFrase);
    }

    public boolean contiene(Cadena cadena, char letra) {
        String frase = cadena.getFrase();
        int longitudFrase = cadena.getLongitudFrase();
        for (int i = 0; i < longitudFrase; i++) {
            if(frase.charAt(i)==letra){
                return true;
            }
        }
        return false;
    }
}
