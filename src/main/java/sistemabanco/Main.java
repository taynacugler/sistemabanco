package sistemabanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	ArrayList<Funcionario> funcNovo= new ArrayList<Funcionario>();
	ArrayList<Cliente> Clientes = new ArrayList<Cliente>();
	
	//criar funcionario e cliente para teste
	RH testeRH = new RH ("Rh", "111");  
	testeRH.id_func = "rh";
	testeRH.senha_func = "senhaRH";
    Gerente testeG = new Gerente ("Gerente", "22");
    testeG.id_func = "gerente";
	testeG.senha_func = "senhaG";
    ADM testeADM = new ADM ("ADM", "333");
    testeADM.id_func = "adm";
	testeADM.senha_func = "senhaADM";
	funcNovo.add(testeADM);
	funcNovo.add(testeG);
	funcNovo.add(testeRH);
	
	
    Cliente cliente1 = new Cliente();
	cliente1.nome = "tayna";
	cliente1.cpf = "444";
			
	Conta contacliente1 = new Conta();
	contacliente1.id = "1";
	contacliente1.senha = "senha";
	contacliente1.saldo = 100;
			
	cliente1.conta = contacliente1;
	Clientes.add(cliente1);
	
	//chamar menu
	Telainicial logar = new Telainicial ();
	logar.login (cliente1, testeRH, Clientes, funcNovo);
    
	
	

	}
	
}
