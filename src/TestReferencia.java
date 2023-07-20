public class TestReferencia {
    public static void main(String[] args){

        Cuenta primeraCuenta = new Cuenta(33);
       
        Cuenta segundaCuenta = new Cuenta(22);
        

        System.out.println("Saldo p cuenta :" + primeraCuenta.obtenerSaldo());
        System.out.println("Saldo 2da cuenta:" + segundaCuenta.obtenerSaldo());
       
        System.out.println("Saldo p cuenta :" + primeraCuenta.obtenerSaldo());
        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);

    }
}
