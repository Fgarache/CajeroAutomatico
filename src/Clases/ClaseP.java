package Clases;

import java.util.Scanner;

public abstract class ClaseP {

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void operaciones() {
        int bandera = 0;
        int seleccion = 0;
        do {
            do {
                //ciclo codigo
                System.out.println("SELECCIONE UNA OPCCION");
                System.out.println("    1. CONSULTA DE SALDO.");
                System.out.println("    2. RETIRO DE EFECTIVO.");
                System.out.println("    3. DEPOSITO DE EFECTIVO.");
                System.out.println("    4. SALIR.");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) { //ciclo de obccion incorrecta
                    bandera = 1;
                } else {
                    System.out.println("**********************");
                    System.out.println("Opccion no disponible");
                    System.out.println("**********************");
                }
                //consulta de saldo
                if (seleccion ==1){
                    ClaseP mensaje = new ConsultaH();
                    mensaje.Transacciones();
                }

                //retiro de efectivo
                else if (seleccion ==2){
                    ClaseP mensaje =  new RetiroH();
                    mensaje.Transacciones();

                }
                //deposito de afectivo
                else if (seleccion ==3){
                    ClaseP mensaje = new DepositoH();
                    mensaje.Transacciones();

                }
                //obcion salir
                else if (seleccion ==4){
                    System.out.println("***********************");
                    System.out.println("Gracias, Vuelva pronto");
                    System.out.println("***********************");
                    bandera=2;
                }


            } while (bandera == 0);
        } while (bandera !=2);

    }
    //metodo solicitar retiro
    public void  Retiro (){
        retiro = entrada.nextInt();

    }

    //metodo deposito
    public void Deposito (){
        deposito = entrada.nextInt();
    }

    public  abstract void Transacciones();


    //metodos setter y getter

    public int getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;}
}
