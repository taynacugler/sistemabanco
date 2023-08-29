package sistemabanco;
import java.util.ArrayList;
import java.util.Scanner; 

public class OperacaobancoADM {
	public Cliente abrirContaCliente() {
			
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o nome do novo cliente:");
		String nome_cliente = scan.nextLine();
		System.out.println("Digite o CPF do novo cliente:");
		String cpf_cliente = scan.nextLine();
		System.out.println("Digite a ID do novo cliente:");
		String id_cliente = scan.nextLine();
		System.out.println("Crie a senha para o novo cliente:");
		String senha_cliente = scan.nextLine();
		System.out.println("Digite o saldo inicial do novo cliente:");
		double saldo_cliente = scan.nextDouble();
		
			
		Cliente cliente = new Cliente ();
		cliente.setNome (nome_cliente);
		cliente.setCpf (cpf_cliente);
		
		Conta contacli = new Conta();
		contacli.setId(id_cliente);
		contacli.setSenha(senha_cliente);
		contacli.setSaldo(saldo_cliente);
		
		cliente.conta = contacli;
			
		return cliente;
		
		}
	public Cliente removeCliente (ArrayList<Cliente> cli) {
		int num = 0;
		
		Scanner a = new Scanner (System.in);
		System.out.println("Digite o ID do cliente: ");
		String idPesq  = a.nextLine();
		
	    for (Cliente c : cli) {
	        if (c.conta.getId().equals(idPesq)) {
	            return c;
	        }
	    }
	    return null;

	}

}
