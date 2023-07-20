public class TestReferencia3 {
    public static void main(String[] args){
        Cuenta cuentaDiego = new Cuenta(323);

        cuentaDiego.titular = new Cliente();

        cuentaDiego.titular.nombre= "Diego";
     
        System.out.print(cuentaDiego.titular);

    }
}
