
package figuras.entidades;
/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
    base y un atributo privado altura. */
public class Rectangulo {
    private float base;
    private float altura;

    public Rectangulo() {
    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }
    
    
}
