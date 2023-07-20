public class PruebaAcceso {
    public static void main(String[] args){
        Cuenta cuenta = new Cuenta();
        cuenta.setAgencia(-2);
        cuenta.retirar(300);
        
        System.out.println(cuenta.getAgencia());    
        System.out.println(cuenta.obtenerSaldo());



    }
    
}
