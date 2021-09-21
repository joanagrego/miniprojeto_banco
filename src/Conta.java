import java.util.Scanner;

public class Conta {
    
    int numConta;
    protected String tipoConta; // cc ou cp
    private String dono;
    private double saldo;
    private boolean status; //true - aberta ou false - fechada

    public Conta(){  //Construtor
        this.saldo = 0;
        this.status = false; 
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status = true;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    

    public void abrirConta(String tipo){
        this.setTipoConta(tipo);
        this.setStatus(false);

        if (tipo == "cc"){
            this.setSaldo(50);
        }else{
            this.setSaldo(150);
        }
        System.out.println("Conta aberta.");
    }

    public void fecharConta(){
        if (this.getSaldo() != 0 ){
            System.out.println("Você não pode fechar sua conta no momento. Vá até a agência mais proxima.");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada.");
        }
    }

    public void depositar(){
        if (this.isStatus() != true){
            System.out.println("Sua conta não está ativa. Vá até a agência mais proxima.");
        }else{
            System.out.println("Quanto você deseja depositar? ");
            Scanner sc = new Scanner(System.in);
            double deposito = sc.nextDouble();
            this.setSaldo(getSaldo() + deposito);
            System.out.println("Depósito realizado com sucesso na conta de " + getDono());
        }

    }

    public void sacar(double saque){
        if (this.isStatus() != true){
            System.out.println("Sua conta não está ativa.Vá até a agência mais proxima.");
        }else{
            if (this.getSaldo() > 0){
                System.out.println("Quanto você deseja sacar? ");
                Scanner sc = new Scanner(System.in);
                saque = sc.nextDouble();
                if (saque > this.getSaldo()){
                    System.out.println("O valor que você deseja sacar é maior que o valor de seu saldo. Tente um valor menor.");
                }else{
                    this.setSaldo(getSaldo() - saque);
                    System.out.println("Saque realizado com sucesso na conta de " + getDono());
                }
            }else{
                System.out.println("Sem saldo ou saldo negativo.");
            }
        }
    }
    public void pagarMensalidade(){
        int mensalidade = 0;
        if (this.getTipoConta() == "cc"){
            mensalidade = 12;
        }else{
            mensalidade = 20;
        }
        if (this.isStatus() == true){
            this.setSaldo(getSaldo() - mensalidade);
            System.out.println("Mensalidade da conta de " + getDono() + " paga com sucesso.");
        }else{
            System.out.println("Impossível realizar pagamento. Conta inativa.");
        }
    }

    public void status(){
        System.out.println("Status da conta - Aberta(true)/Fechada(false): " + this.getSaldo());
        System.out.println("Nome do cliente: " + this.getDono());
        System.out.println("Saldo do cliente: " + this.getSaldo());
        System.out.println("Tipo da conta cliente: " + this.getTipoConta());
        System.out.println("Numero da conta cliente: " + this.getNumConta());
    }
}
