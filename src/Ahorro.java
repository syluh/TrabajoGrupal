/**
 * La clase ahorro es Hija de la clase cuenta, la misma cuenta con un atributo interesAnual
 * */

public class Ahorro extends Cuenta {
    private double interesAnual;

    /**
     * @param saldo ... Este parametro nos deja asignar un saldo
     * @param numero ... Este parametro nos deja asignar un número
     * @param interesAnual ... Este parametro nos permite asignar un interes anual*/

    public Ahorro(double saldo, String numero, double interesAnual) {
        super(saldo, numero);
        this.interesAnual = interesAnual;
    }

    /** Metodo get de numero para asignar siglas de cuenta de ahorros
     * @return devuelve CTA-AH + el numero  */

    @Override
    public String getNumero() {
        return "CTA-AH-".concat(super.getNumero());
    }

    /**
     * Metodo get del atributo interesAnual
     * @return develve el interes anual
     * */

    public double getInteresAnual(){
        return interesAnual;
    }

    /**
     * Metodo para validar que el monto es mayor que 0
     * @param monto ... Este parametro nos permtie asignar un monto
     * @return devuelve el monto*/

    private boolean isMontoValido(double monto){
        return monto > 0;
    }

    /**
     * Metodo para retirar un monto
     * @param monto ... Este parametro nos deja asignar un monto */

    public void retirar(double monto){
        if (isMontoValido(monto)){
            setSaldo(getSaldo() - monto);
        }else{
            throw new IllegalArgumentException("El monto no es válido");
        }
    }
}
