/**
 * Esta es la clase principal del programa
 * @author Víctor Carrión e Isaac Álvarez
 * @version 02/06/2021
 * @since 1.0
 * */

public class ClienteBanco {
    public static void main(String[] args) {
        Ahorro ctAh1 = new Ahorro(100,"01", 0.05);
        System.out.println(ctAh1.getNumero());
        System.out.println(ctAh1.getSaldo());
        ctAh1.depositar(100);


        Corriente ctCnt1 = new Corriente(345 , "50");
        System.out.println(ctCnt1.getNumero());
        System.out.println(ctCnt1.getSaldo());
        ctCnt1.depositar(34);

        System.out.println("====Luego de depositar====");
        System.out.println(ctAh1.getNumero());
        System.out.println(ctAh1.getSaldo());

        System.out.println(ctCnt1.getNumero());
        System.out.println(ctCnt1.getSaldo());

        System.out.println("====Luego de retirar====");
        ctAh1.retirar(50);
        System.out.println(ctAh1.getNumero());
        System.out.println(ctAh1.getSaldo());

    }
}
