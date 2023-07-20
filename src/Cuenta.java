class Cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular = new Cliente();

   public void depositar(double valor){
        this.saldo = this.saldo+valor;

   }
   public boolean retirar(double valor){
        if(this.saldo >= valor){
            this.saldo = this.saldo-valor;
            return true;
        }
        else{
            return false;
        }
   }

   public boolean transferir(double valor , 
                            Cuenta cuenta){
        
        if (this.saldo >=valor){
            this.saldo = this.saldo-valor;
            cuenta.saldo=cuenta.saldo+valor;
            return true;
        }
        else{
            return false;
        }
        
        


   }

   public double obtenerSaldo(){
            // usar getSaldo() como convencion lol
        return this.saldo;
   }
   public void setSaldo(double saldo) {
       this.saldo = saldo;
   }

   public void setAgencia(int agencia) {
    if ( agencia> 0){
       this.agencia = agencia;}
       else{
        System.out.println("No se permiten menores a 0");
       }
   }

   public int getAgencia() {
       return agencia;
   }
   public void setTitular(Cliente titular) {
       this.titular = titular;
   }
   public Cliente getTitular() {
       return titular;
   }
}
