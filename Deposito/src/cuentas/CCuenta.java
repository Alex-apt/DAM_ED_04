/**
 * Paquete de cuentas
 * @author Manuel Alejandro Rodriguez Henriquez
 */
package cuentas;

/**
 * Clase CCuenta con 4 variables
 * Gestiona el ingreo y retiro de dinero
 * @version 1 todos los métodos tienen la version 1
 * @author alex
 */
public class CCuenta {

    /**
     * Variables de la clase CCuenta
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacio de la clase CCuenta
     */
    public CCuenta()
    {
    }
    /**
     * Constructor de la clase CCuenta
     * @param nom de tipo String
     * @param cue de tipo String
     * @param sal de tipo double
     * @param tipo de tipo double
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Método get del atributo cuenta
     * @return cuenta de tipo String
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * Método set del atributo cuenta, cambia su valor
     * @param cuenta de tipo String
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * Método get del atributo saldo
     * @return saldo de tipo double
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Método set del atributo saldo, cambia su valor
     * @param saldo de tipo double
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * 
     * @deprecated método obsoleto ya que para actualizar el valor del atributo nombre esta el método setNombre
     * @deprecated  usar el método setNombre
     * @param nom de tipo String
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    /**
     * @deprecated método obsoleto ya que para obtener el valor del atributo nombre esta el método getNombre
     * @deprecated  usar el método getNombre
     * @return 
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * @version 2
     * cambia a private ya que es una función de uso interno de la clase CCuenta
     * Se usa en el método retirar
     * @return 
     */
    private double estado()
    {
        return getSaldo();
    }

    /**
     * Método ingresar, ingresa dinero en la cuenta
     * @param cantidad de tipo double
     * @throws Exception -> cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Método para retirar dinero de la cuenta
     * @param cantidad de tipo double
     * @throws Exception cantidad negativa o cantidad mayor que el saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @deprecated método obsoleto ya que para obtener el valor del atributo cuenta esta el método getCuenta
     * @deprecated  usar el método getCuenta
     * @return 
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * Método get del atributo nombre
     * @return el nombre de tipo String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set del atributo nombre, cambia su valor
     * @param nombre de tipo String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get del atributo tipo de interés
     * @return tipo de interés de tipo double
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método set del atributo tipo de interés, cambia su valor
     * @param tipoInterés de tipo double
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
