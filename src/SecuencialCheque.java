/**
 * Esta clase llamada SecuencialCheque nos permite crear un cheque con un inicio y un final
 * */

public class SecuencialCheque {
    private String inicio;
    private String fin;

    /**
     * Metodo get del atributo String inicio
     * @return devuelve el valor del inicio
     * */

    public String getInicio() {
        return inicio;
    }
    /**
     * Metodo set del atributo String inicio
     * @param inicio ... Este parametro nos permitira asignar el inicio
     * */

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    /**
     * Metodo get del atributo String fin
     * @return devuelve el valor del fin
     * */

    public String getFin() {
        return fin;
    }

    /**
     * Metodo set del atributo String inicio
     * @param fin ... Este parametro nos permitira asginar el final
     * */

    public void setFin(String fin) {
        this.fin = fin;
    }
}
