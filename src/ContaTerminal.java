import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bem-vindo ao cadastro de contas bancárias!");
        System.out.println("------------------------------------------");
        System.out.println("Insira seu nome, por favor" );
        String nome=scan.nextLine();
        System.out.println("Insira a agência ");
        String agencia=scan.nextLine();
        System.out.println("Insira o número da conta");
        int numero_conta= scan.nextInt();
        System.out.println("Deposite um valor inicial");
        double saldo=scan.nextDouble();
        contaBancaria conta_criada= new contaBancaria();
        conta_criada.AtributosConta(nome,numero_conta,agencia,saldo);
        System.out.println("------------------------------------------");
        conta_criada.exibirConta();

    }
    public static class contaBancaria{
        private String nome_cliente;
        private int numero_conta;
        private String agencia;
        private double saldo;

        public void AtributosConta(String nomeAtr,int numeroAtr,String agenciaAtr,double saldoAtr){
            this.nome_cliente=nomeAtr;
            this.numero_conta=numeroAtr;
            this.agencia=agenciaAtr;
            this.saldo=saldoAtr;

        }
        public void exibirConta(){
            System.out.println("Olá "+nome_cliente+" obrigado por criar uma conta em nosso banco");
            System.out.println("Sua agência é: "+agencia);
            System.out.println("Conta: "+numero_conta);
            System.out.println("Seu saldo de "+saldo+" já está disponível para saque");
        }
    }
}