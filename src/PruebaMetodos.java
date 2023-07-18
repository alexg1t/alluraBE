public class PruebaMetodos {
    public static void main(String[] args){
        Cuenta miCuenta = new Cuenta();
        miCuenta.saldo = 300;
        miCuenta.depositar(200);

        System.out.println(miCuenta.saldo);
        miCuenta.retirar(20);

        System.out.println(miCuenta.saldo);

        Cuenta miCuenta2 = new Cuenta();
        miCuenta2.saldo=500;
        System.out.println("Saldo 1 previo"+miCuenta.saldo);
        System.out.println("Saldo 2 previo"+miCuenta2.saldo);
        miCuenta2.transferir(200, miCuenta);
        System.out.println("saldo 1 post"+miCuenta.saldo);
        System.out.println("saldo 2 post"+miCuenta2.saldo);


    }
}
