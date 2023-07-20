public class PruebaMetodos {
    public static void main(String[] args){
        Cuenta miCuenta = new Cuenta();
        
        miCuenta.depositar(200);

        System.out.println(miCuenta.obtenerSaldo());
        miCuenta.retirar(20);

        System.out.println(miCuenta.obtenerSaldo());

        Cuenta miCuenta2 = new Cuenta();
        
        System.out.println("Saldo 1 previo"+miCuenta.obtenerSaldo());
        System.out.println("Saldo 2 previo"+miCuenta2.obtenerSaldo());
        miCuenta2.transferir(200, miCuenta);
        System.out.println("saldo 1 post"+miCuenta.obtenerSaldo());
        System.out.println("saldo 2 post"+miCuenta2.obtenerSaldo());


    }
}
