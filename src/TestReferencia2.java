public class TestReferencia2 {
    public static void main(String[] args){
        Cliente diego= new Cliente();
        diego.nombre = "Diego";
        diego.documento = "323232";
        diego.telefono="90232323";

        Cuenta cuentaDiego = new Cuenta();
       
        cuentaDiego.titular = diego;

        System.out.println(cuentaDiego.titular.documento);
    }
}
