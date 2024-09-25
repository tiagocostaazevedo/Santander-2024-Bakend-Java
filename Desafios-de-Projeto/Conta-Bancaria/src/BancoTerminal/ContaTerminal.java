package BancoTerminal;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //To  do: Conhecer e importar a classe Scanner

        //exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores

        //exibir a mensagem conta criada

        /*
        "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque"
         */

        String nomeCliente ;
        String agenciaConta ;
        int numeroConta ;
        double depositarConta ;
        double saldoConta = 0d;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Por favor informe sua agência: ");
        agenciaConta = scanner.next();

        System.out.println("Insira o número da sua conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Insira o valor a ser depositado na conta: ");
        depositarConta = scanner.nextDouble();

        saldoConta += depositarConta;


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");


    }


}
