package dam_ed04_actividad;

import cuentas.CCuenta;


public class Main {

    /**
     * Método que crea una cuenta de la clase CCuenta
     * Muestra el saldo con que se creo la cuenta
     * Hace un retiro y un ingreso
     */
    public static void operativa_cuenta(){
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        /**
         * @version 2
         * se ha cambiado cuenta1.estado() por cuenta1.getSaldo()
         */
        saldoActual = cuenta1.getSaldo();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    
    public static void main(String[] args) {
        
        operativa_cuenta();
    }
    
   
}
