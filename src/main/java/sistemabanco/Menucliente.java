package sistemabanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Menucliente {
       double valor;
       Conta destino;
	public int menuCli (Cliente cliente, Funcionario func, ArrayList<Cliente> cli, ArrayList<Funcionario> funci) {
		int opcao = 0;
		Scanner scan = new Scanner (System.in);
		while (opcao<1 || opcao>5) {
		System.out.println("====================MENU DOS CLIENTES=======================================");
		System.out.println("====================ESCOLHA UMA DAS OPCOES:=================================");
		System.out.println("====================1- VER INFORMAÇOES DA SUA CONTA=========================");
		System.out.println("====================2- DEPOSITAR NA SUA CONTA===============================");
		System.out.println("====================3- SACAR DINHEIRO=======================================");
		System.out.println("====================4- TRANFERIR DINHEIRO===================================");
		System.out.println("====================5- SAIR DO MENU=========================================");
		opcao = scan.nextInt();
		}
		if (opcao == 1)
		{
			System.out.println("====================1- VER INFORMAÇOES DA SUA CONTA=========================");
			System.out.println(cliente);
		
			
		}
		else if (opcao == 2)
		{
			System.out.println("====================2- DEPOSITAR NA SUA CONTA===============================");
			System.out.println("Qual o valor que você quer depositar na sua conta?");
			int valor = scan.nextInt();
			while (valor<=0) {
				System.out.println("Valor do deposito não pode ser negativo, escolha um valor maior que zero e menor que:" + cliente.conta.saldo);
				valor = scan.nextInt();
			}
			cliente.conta.deposita (valor);
			System.out.println("Valor em sua conta atualizado:" + cliente.conta.saldo);

		}
		else if (opcao == 3)
		{
			System.out.println("====================3- SACAR DINHEIRO=======================================");
			System.out.println("Qual o valor que você quer sacar na sua conta?");
			int valor = scan.nextInt();
			while (valor>cliente.conta.saldo || valor<=0) {
				System.out.println("Valor do saque não pode ser negativo e nem maior que o saldo, escolha um valor maior que 0 e menor que:" + cliente.conta.saldo);
				valor = scan.nextInt();
			}
			
				
			cliente.conta.saca (valor);
			System.out.println("Valor em sua conta atualizado:" + cliente.conta.saldo);

		}
		else if (opcao == 4)
		{
			System.out.println("====================4- TRANFERIR DINHEIRO===================================");
			System.out.println("Qual o valor que você quer transferir?");
			int valor = scan.nextInt();
			System.out.println("Qual o id  da conta  para qual você quer transferir?");
			int destinoID = scan.nextInt();
			while (valor>cliente.conta.saldo || valor<=0) {
				System.out.println("Valor da transferencia não pode ser negativo e nem maior que o saldo, escolha um valor maior que 0 e menor que:" + cliente.conta.saldo);
				valor = scan.nextInt();
			}	
			for (Cliente c : cli) {
	        if (c.conta.getId().equals(destinoID)) {
	        	c.conta.saldo = c.conta.saldo + valor;
		        }
	        else {
	        	System.out.println("Conta de destino não existe");
	        }
	        
		}
			cliente.conta.saldo = cliente.conta.saldo - valor;
			System.out.println("Valor em sua conta atualizado:" + cliente.conta.saldo);
		}
		else if (opcao == 5)
		{
			System.out.println("====================5- SAIR DO MENU=========================================");
			Telainicial logar = new Telainicial ();
			logar.login (cliente, func, cli, funci);
		
		}
		return opcao;
	}

}
