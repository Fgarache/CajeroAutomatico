package Clases;

public class DepositoH extends ClaseP{
    @Override
    public void Transacciones() {
        System.out.println("Cunato desas depositar:");
        Deposito();

        transacciones = getSaldo();
        setSaldo(transacciones+deposito);
        System.out.println("deposito:"+deposito);
        System.out.println("Tu saldo Actual es: "+getSaldo());

1
    }
}
