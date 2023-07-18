
package banco.entidades;
        /*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
        numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
        Las operaciones asociadas a dicha clase son:

        a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
        b) Agregar los métodos getters y setters correspondientes
        */
public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private double saldoActual;
    private double interes;

    public Cuenta() {
    }
    
    public Cuenta(int numeroCuenta, long dni) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = 0.0;
        this.interes = 0.0;
    }

    /*public Cuenta(int numeroCuenta, long dni, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }*/

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
