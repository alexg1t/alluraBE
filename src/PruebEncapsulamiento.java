public class PruebEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Cliente cliente = new Cliente();
        cliente.setNombre("Alexander");
        cliente.setDocumento("qwertyuio");
        cuenta.setTitular(cliente);

        System.out.println(cliente.getNombre());
        System.out.println(cuenta.getTitular().nombre);

    }
}
