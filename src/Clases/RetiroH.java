package Clases;

public class RetiroH extends ClaseP{
    @Override
    public void Transacciones(){
        System.out.print("Cuanto deseas retirar?  .");
        Retiro();
        if (retiro <= getSaldo()){
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("Retiraste:"+retiro);
            System.out.println("----------------------------");
            System.out.println("Tu saldo actual es:"+getSaldo());
            System.out.println("----------------------------");
        }else {
            System.out.println("---------------------");
            System.out.println("Saldo insuficiente.");
            System.out.println("---------------------");
        }
    }

}
