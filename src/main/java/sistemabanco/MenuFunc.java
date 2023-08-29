package sistemabanco;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuFunc {
	

public int menuFunc (Cliente cliente, Funcionario func, ArrayList<Cliente> cli, ArrayList<Funcionario> funci) {
	
    System.out.println("====================MENU DOS FUNCIONARIOS===================================");
	System.out.println("====================ESCOLHA UMA DAS OPCOES:=================================");
	System.out.println("====================1- FAZER CADASTRO DE NOVO FUNCIONARIO===================");
	System.out.println("====================2- FAZER CADASTRO DE NOVO CLIENTE=======================");
	System.out.println("====================3- FAZER PAGAMENTO DE FUNCIONARIO=======================");
	System.out.println("====================4- VER CONTA DOS CLIENTES===============================");
	System.out.println("====================5- EXCLUIR CLIENTE=========================================");
	System.out.println("====================6- EXCLUIR FUNCIONARIO=========================================");
	System.out.println("====================7- SAIR DO MENU=========================================");
	Scanner scan = new Scanner (System.in);
	int opcao = scan.nextInt();


	if (opcao == 1)
	{
		System.out.println("====================1- FAZER CADASTRO DE NOVO FUNCIONARIO===================");
		if (func instanceof RH || func instanceof Gerente)
		{ 
			System.out.println("====================Voce pode fazer essa funcao===================");
		    OperacoesbancoRH op = new OperacoesbancoRH();
			Funcionario funcionarioNovo = op.cadastroFuncionario();
			System.out.println(funcionarioNovo);
			funci.add(funcionarioNovo);
//			for (Funcionario f : funci)
//			{
//				System.out.println(f);
//			}
			
		}
		else {
			System.out.println("====================voce nao pode fazer essa funcao===================");
		}
	}
	else if (opcao == 2)
	{
		System.out.println("====================2- FAZER CADASTRO DE NOVO CLIENTE=======================");
		if (func instanceof ADM || func instanceof Gerente)
		{ 
			System.out.println("====================Voce pode fazer essa funcao===================");
			OperacaobancoADM op = new OperacaobancoADM();
			Cliente clienteNovo = op.abrirContaCliente();
			System.out.println(clienteNovo);
			cli.add(clienteNovo);
//			for (Cliente c : cli) {
//				System.out.println(c);
//			}
	        
			
		}
		else {
			System.out.println("====================voce nao pode fazer essa funcao===================");
		}
	}
	else if (opcao == 3)
	{
		System.out.println("====================3- FAZER PAGAMENTO DE FUNCIONARIO=======================");
		if (func instanceof RH || func  instanceof Gerente)
		{ 
			System.out.println("====================Voce pode fazer essa funcao===================");
			OperacoesbancoRH op = new OperacoesbancoRH();
			System.out.println("Qual o Id do funcionario?");
			String idFunc =  scan.nextLine();
			for (Funcionario f : funci)
		        if (f.getId_func().equals(idFunc)) {
		        	op.PagarFunc(f.conta.saldo, f);
			        }
			
			
		}
		else {
			System.out.println("====================voce nao pode fazer essa funcao===================");
		}

		
	}
	else if (opcao == 4)
	{
		System.out.println("====================4- VER CONTA DOS CLIENTES===============================");
		if (func instanceof Gerente)
		{ 
			System.out.println("====================Voce pode fazer essa funcao===================");
			OperacaobancoGerente op = new OperacaobancoGerente();
			Cliente mostraCliente = op.mostrarLista(cli);
			System.out.println(mostraCliente);
			System.out.println("clique em qualquer tecla para sair");
			int pause = scan.nextInt();
			
		}
		else {
			System.out.println("====================voce nao pode fazer essa funcao===================");
		}
	}
	else if (opcao == 5)
	{
		System.out.println("====================5-EXCLUIR UM CLIENTE=======================");
		if (func instanceof ADM || func instanceof Gerente)
		{ 
			System.out.println("====================Voce pode fazer essa funcao===================");
			OperacaobancoADM op = new OperacaobancoADM();
			Cliente clienteExcluir = op.removeCliente(cli);
			cli.remove(clienteExcluir);
			        
			
		}
		else {
			System.out.println("você não pode fazer essa função");
		}
	}
	else if (opcao == 6)
	{
		System.out.println("====================6-EXCLUIR UM FUNCIONARIO=======================");
		if (func instanceof RH || func instanceof Gerente)
		{ 
			System.out.println("====================Voce pode fazer essa funcao===================");
			OperacoesbancoRH op = new OperacoesbancoRH();
			Funcionario funcExcluir = op.removeFunc(funci);
			funci.remove(funcExcluir);
			        
			
		}
		else {
			System.out.println("você não pode fazer essa função");
		}
		
	}
	else if (opcao == 7)
	{
		System.out.println("====================7- SAIR DO MENU=========================================");
		Telainicial logar = new Telainicial ();
        logar.login (cliente, func, cli, funci);
	}
	return opcao;
	
	
	
	
	
} 

	

}
