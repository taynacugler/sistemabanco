package sistemabanco;

//import java.util.Scanner;

public class ADM extends Funcionario {

	public ADM(String nome, String cpf) {
		super(nome, cpf);
	
		
		
	}
	
	OperacaobancoADM op_adm = new OperacaobancoADM();
	public Cliente abrirContaCliente() {
		return op_adm.abrirContaCliente();
	}	
	

}
