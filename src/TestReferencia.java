public class TestReferencia {
    public static void main(String[] args){

        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo =200;
        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.saldo=100;

        System.out.println("Saldo p cuenta :" + primeraCuenta.saldo);
        System.out.println("Saldo 2da cuenta:" + segundaCuenta.saldo);
        segundaCuenta.saldo+=400;
        System.out.println("Saldo p cuenta :" + primeraCuenta.saldo);
        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);

    }
}
