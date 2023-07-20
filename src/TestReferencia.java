public class TestReferencia {
    public static void main(String[] args){

        Cuenta primeraCuenta = new Cuenta();
       
        Cuenta segundaCuenta = new Cuenta();
        

        System.out.println("Saldo p cuenta :" + primeraCuenta.obtenerSaldo());
        System.out.println("Saldo 2da cuenta:" + segundaCuenta.obtenerSaldo());
       
        System.out.println("Saldo p cuenta :" + primeraCuenta.obtenerSaldo());
        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);

    }
}
