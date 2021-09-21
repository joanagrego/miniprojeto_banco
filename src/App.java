public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta();
        System.out.println("------------------------");
        c1.abrirConta("cc");
        c1.setNumConta(445566);
        c1.setTipoConta("cc");
        c1.setDono("João");
        //c1.depositar();
        c1.pagarMensalidade();
        //c1.sacar();
        c1.status();
        System.out.println("------------------------");

        Conta c2 = new Conta();
        c2.abrirConta("cp");
        c2.setNumConta(778899);
        c2.setTipoConta("cp");
        c2.setDono("Maria");
        //c2.depositar();
        c2.pagarMensalidade();
        //c2.sacar();
        c2.status();


    }
}
