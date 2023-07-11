
package biblioteca.servicios;

import biblioteca.entidades.Libro;
import java.util.Scanner;

public class ServicioLibro {
    String isbn, titulo, autor;
    int numeroPaginas;
    private Scanner leer = new Scanner(System.in);
    public Libro cargarLibro(){
        System.out.printf("%10s","ISBN: ");
        isbn=leer.nextLine();
        System.out.printf("%10s","Título: ");
        titulo=leer.nextLine();
        System.out.printf("%10s","Autor: ");
        autor=leer.nextLine();
        System.out.printf("%10s","Número de páginas: ");
        numeroPaginas=leer.nextInt();
        
        return new Libro(isbn, titulo, autor, numeroPaginas);
    }
    
    public void informarLibro(){
        System.out.printf("\n%20s%s","ISBN: ", isbn);
        System.out.printf("\n%20s%s","Título: ", titulo);
        System.out.printf("\n%20s%s","Autor: ", autor);
        System.out.printf("\n%20s%d","Número de páginas: ", numeroPaginas);
    }

}
