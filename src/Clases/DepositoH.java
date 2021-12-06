package Clases;

public class DepositoH extends ClaseP{
    @Override
    public void Transacciones() {
        System.out.print("Cuanto desas depositar:  ");
        Deposito();

        transacciones = getSaldo();
        setSaldo(transacciones+deposito);
        System.out.println("deposito:"+deposito);
        System.out.println("-----------------------------------");
        System.out.println("Tu saldo Actual es: "+getSaldo());
        System.out.println("-----------------------------------");


    }
}
