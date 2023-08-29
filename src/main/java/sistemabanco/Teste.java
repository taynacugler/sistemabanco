package sistemabanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Funcionario> funcNovo= new ArrayList<Funcionario>();
		ArrayList<Cliente> Clientes = new ArrayList<Cliente>();
//      //RH testeRH = new RH ("tayna", "444");
//      
//     Gerente testeG = new Gerente ("tayna", "444");
//      // ADM testeADM = new ADM ("tayna", "444");
//
//
//      
////    Funcionario func = teste.cadastroFuncionario();
////    teste.PagarFunc(func.conta.saldo, func);
////    System.out.println("O saldo do funcionario após o pagamento é" + func.conta.saldo);
////	MenuFunc teste = new MenuFunc ();
////	    int aux = 0;
////		
////		do {
////			aux = teste.menuFunc(testeG, funcNovo, Clientes);
//			
//			
//			
//		//} while(aux != 5);
//    //criando clientes
       Cliente cliente1 = new Cliente();
		cliente1.nome = "tayna";
		cliente1.cpf = "444";
				
		Conta contacliente1 = new Conta();
		contacliente1.id = "1";
		contacliente1.senha = "senha";
		contacliente1.saldo = 100;
				
		cliente1.conta = contacliente1;
		Clientes.add(cliente1);
		
		
		Cliente cliente2 = new Cliente();
		cliente2.nome = "ana";
		cliente2.cpf = "333";
				
		Conta contacliente2 = new Conta();
		contacliente2.id = "2";
		contacliente2.senha = "senha2";
		contacliente2.saldo = 200;
				
		cliente2.conta = contacliente2;
		Clientes.add(cliente2);
		
		
//		Menucliente teste = new Menucliente ();
//	    int aux = 0;
//	
//		do {
//			aux = teste.menuCli(cliente2, contacliente2, Clientes, funcNovo);
//		} while (aux != 5);
//		
   
	    
		
		
	
	
}
}
