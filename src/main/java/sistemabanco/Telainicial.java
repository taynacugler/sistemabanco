package sistemabanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Telainicial {

	public void login (Cliente testeCli, Funcionario RH, ArrayList<Cliente> cli, ArrayList<Funcionario> funci) {
		int opcao = 0;
	    String id = "";
	    String senha = "";
		while (opcao>2 || opcao<1) {
			System.out.println("Escolha de menu: digite 1 para entrar como cliente, digite 2 para entrar como funcionário e digite 0 para sair");
			Scanner scan = new Scanner (System.in);
			opcao = scan.nextInt();
		}
		if (opcao == 1)
		{
			
			Cliente clienteEncontrado = null;
			
			System.out.println("Digite seu id de cliente");
			Scanner scan = new Scanner (System.in);
			id = scan.nextLine();
			for (Cliente c : cli)
			{
				if (c.conta.getId().equals(id)) {

				do { System.out.println("Digite sua senha do cliente ou digite 0 para sair");
						senha = scan.nextLine();
//						if (senha == "0")
//						{
//							break;
//						}
						
						
				}while(!c.conta.getSenha().equals(senha));
				


					clienteEncontrado = c;

					}

					
					
				
			}
			
			if (clienteEncontrado== null) {
				System.out.println("nao existe cliente");
			}
			else {
				System.out.println("menu");
				Menucliente abrir = new Menucliente();
				int aux1 = 0;
				  do {
				 aux1 = abrir.menuCli (testeCli, RH, cli, funci);
				  } while (aux1 != 5);
			}
//				     
			}
			
			
		
		else if (opcao == 2) {

			Funcionario funcEncontrado = null;
			
			System.out.println("Digite seu id de funcionario");
			Scanner scan = new Scanner (System.in);
			id = scan.nextLine();
			for (Funcionario f: funci)
			{
				if (f.getId_func().equals(id)) {

				do { System.out.println("Digite sua senha ou digite 0 para sair");
						senha = scan.nextLine();
//						if (senha == "0")
//						{
//							break;
//						}
						
						
				}while(!f.getSenha_func().equals(senha));
				


					funcEncontrado = f;

					}

					
					
				
			}
			
			if (funcEncontrado== null) {
				System.out.println("nao existe funcionario");
			}
			else {
				System.out.println("menu");
		  MenuFunc abrir = new MenuFunc();
		  int aux = 0;
		  do {
				aux = abrir.menuFunc (testeCli, RH, cli, funci);
		  } while (aux != 7);
			}
		}
		else if (opcao == 0)
		{
			
		}
	}
}
