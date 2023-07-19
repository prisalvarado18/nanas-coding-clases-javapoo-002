
package Literatura.entidades;
                            /*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
                            String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
                            una frase que puede ser una palabra o varias palabras separadas por un espacio en
                            blanco y a través de los métodos set, se guardará la frase y la longitud de manera
                            automática según la longitud de la frase ingresada.*/
public class Cadena {
    private String frase;
    private int longitudFrase;
    
    public Cadena (){
    }
    
    public Cadena(String frase){
        this.frase = frase;
        this.longitudFrase = frase.length();
    }
    
    /*public Cadena(String frase, int longitudFrase){
        this.frase = frase;
        this.longitudFrase = longitudFrase;
    }*/
    
    public String getFrase(){
        return frase;
    }
    
    public int getLongitudFrase(){
        return longitudFrase;
    }
    
    public void setFrase(String frase){
        this.frase = frase;
    }
    
    public void setLongitudFrase(int longitudFrase){
        this.longitudFrase = longitudFrase;
    }
}
