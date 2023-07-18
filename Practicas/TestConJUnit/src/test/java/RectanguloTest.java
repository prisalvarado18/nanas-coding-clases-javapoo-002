
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import testconjunit.entities.Rectangulo;
import testconjunit.services.RectanguloService;

/**
 *
 * @author palva
 */
public class RectanguloTest {
    
    public RectanguloTest() {
    }
    
    RectanguloService rs;

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    /*@org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }*/

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    /*@BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }*/
    
    @BeforeEach
    public void setUp() {
        rs = new RectanguloService();
    }
    
    /*@AfterEach
    public void tearDown() {
    }*/

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void deberiaInicializarConColor(){
        assertNotNull(new Rectangulo(10,10).getColor());
    }
    @Test
    public void deberiaInicializarConColorRojo(){
        Rectangulo rectangulo = new Rectangulo(10,10); 
        assertEquals("Rojo", rectangulo.getColor());
    }
    @Test
    public void deberiaCalcularArea(){
        assertEquals(100,rs.calcularArea(new Rectangulo(10,10)),0);
        assertEquals(20,rs.calcularArea(new Rectangulo(4,5)),0);
        assertEquals(1,rs.calcularArea(new Rectangulo(1,1)),0);
    }
    @Test
    public void deberiaCalcularPerimetro(){
        assertEquals(40, rs.calcularPerimetro(new Rectangulo(10,10)),0);
        assertEquals(100, rs.calcularPerimetro(new Rectangulo(20,30)),0);
        assertEquals(30, rs.calcularPerimetro(new Rectangulo(5,10)),0);
    }
    @Test
    public void deberiaActivarODesactivar(){
        Rectangulo r = new Rectangulo(5,5);
        assertTrue(r.isActive());
        r.setActive(false);
        assertFalse(r.isActive());
    }
}
