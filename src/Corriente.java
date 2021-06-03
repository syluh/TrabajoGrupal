/**
 * Esta clase llamada corriente es una clase hija de "cuenta "
 * */

public class Corriente extends Cuenta {
    private int nroMaxCheques;
    private SecuencialCheque secuenciaCh;

   /**
    *
    * @param saldo ...Este parametro nos permitira escoger el sueldo de una cuenta corriente
    * @param numero ...Este parametro nos permitira escoger el número que tengra una cuenta corriente
    * */

    public Corriente(double saldo, String numero){
        super(saldo, numero);
    }

    /**
     *
     * Metodo get del atributo entero nroMaxCheques
     * @return El metodo devuelve el número máximo de cheques
     * */

    public int getNroMaxCheques() {
        return nroMaxCheques;
    }

    /**
     *
     * Metodo set del atributo entero nroMaxCheques
     * @param nroMaxCheques ... Este parametro nos permitira asignar cual sera el número máximo de cheques
     * */

    public void setNroMaxCheques(int nroMaxCheques) {
        this.nroMaxCheques = nroMaxCheques;
    }

    /**
     *
     * Metodo get del atributo secuenciaCh que es de tipo SecuencialCheque
     * @return El metodo devuelve el Secuencial de un cheque
     * */

    public SecuencialCheque getSecuenciaCh() {
        return secuenciaCh;
    }

    /**
     *
     * Metodo set del atributo secuenciaCh que es de tipo SecuencialCheque
     * @param secuenciaCh ... Este parametro nos permitira asignar el secuencial de un cheque
     * */

    public void setSecuenciaCh(SecuencialCheque secuenciaCh) {
        this.secuenciaCh = secuenciaCh;
    }
}
