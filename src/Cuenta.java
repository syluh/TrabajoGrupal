
import java.time.LocalDate;

/**
 * La clase Cuenta nos permitira crear objetos con un saldo, un número y una fecha de Apertura
 * */

public class Cuenta {
    private double saldo;
    protected String numero;
    private LocalDate fechaApertura;

    /**
     * @param saldo ... Este parametro nos permite asignar un saldo
     * @param numero ... Este parametro nos permite asignar un número*/

    public Cuenta(double saldo, String numero) {
        setSaldo(saldo);
        this.numero = numero;
        fechaApertura = LocalDate.now();
    }

    /**
     *
     * Metodo get del atributo decimal saldo
     * @return El metodo devuelve el saldo
     *
     * */

    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo set del atributo decimal saldo
     * @param saldo ... Este parametro nos permitira asignar el saldo
     * @throws  IllegalArgumentException
     * */

    public final void setSaldo(double saldo) {
        if(!validarSaldoNoNegativo(saldo) ){
            this.saldo = saldo;
        }else{
            throw new IllegalArgumentException("Saldo negativo");
        }

    }
    /**
     *
     * Metodo get del atributo cadena numero
     * @return El metodo devuelve el numero que tendra la cuenta
     *
     * */

    public String getNumero() {
        return numero;
    }

    /**
     * Metodo set del atributo decimal saldo
     * @param numero ... Este parametro nos permitira asignar el numero de cuenta
     * */

    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Metodo para validar si el saldo es mayor que 0
     * @return el metodo devuelve el saldo
     * */
    private boolean validarSaldoNoNegativo(double saldo){
        return saldo < 0;
    }

    /**
     * Metodo para depositar un monto
     * @param monto Este parametro nos permitira asignar el monto a depositar
     * @throws  IllegalArgumentException
     * */

    public void depositar(double monto){
        if( monto > 0){
            this.saldo = this.saldo + monto;
        }else{
            throw new IllegalArgumentException("Monto negativo");
        }
    }
}
