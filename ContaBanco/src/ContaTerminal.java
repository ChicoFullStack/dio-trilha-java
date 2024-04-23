import java.util.Scanner;

// TODO:Conhecer e importar a classe Scanner 

// Exibir as mensagens para o nosso usuario

//Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada com sucesso e os dados
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        double saldo;
        String nomeCliente;

        //TODO:Conhecer e importar a classe Scanner        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta.");
        numero = sc.nextInt();
        System.out.println("Digite a agência.");
        agencia = sc.next();
        System.out.println("Digite o nome co cliente");
        nomeCliente = sc.next();
        System.out.println("Digite o saldo da sua conta.");
        saldo = sc.nextDouble();
        
        
        System.out.println("Olá ," + nomeCliente);
        System.out.println("obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero);
        System.out.println(" e seu saldo " + saldo + " já esta disponível para saque.");
        
     
        sc.close();

        
    }
}
