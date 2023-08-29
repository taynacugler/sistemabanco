package sistemabanco;
import java.util.ArrayList;
import java.util.Scanner; 

public class OperacoesbancoRH {


	 public Funcionario cadastroFuncionario () {
	
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o nome do novo funcionário:");
		String nome_func = scan.nextLine();
		System.out.println("Digite o CPF do novo funcionário:");
		String cpf_func = scan.nextLine();
		System.out.println("Digite a ID do novo funcionário:");
		String id_f = scan.nextLine();
		System.out.println("Crie a senha para o novo funcionário:");
		String senha_f = scan.nextLine();
		System.out.println("Digite o saldo inicial do novo funcionário:");
		double saldo_f = scan.nextDouble();
		System.out.println("Digite 1 se o funcionario for do tipo gerente. Digite 2 se o funcionario for do tipo ADM. Digite 3 se o funcionario for do tipo RH.");
		int tipoFunc = scan.nextInt();
		
		
	
		
		Funcionario novo_func = null; 
		
		if (tipoFunc == 1) {
			System.out.println("Esse funcionario é tipo Gerente");			
			novo_func = new Gerente(nome_func, cpf_func); 
		}
		else if (tipoFunc == 2)
		{
			System.out.println("Esse funcionario é tipo ADM");			
			novo_func = new ADM(nome_func, cpf_func); 
		}	
		else if (tipoFunc == 3)
		{
			System.out.println("Esse funcionario é tipo RH");	
			novo_func = new RH(nome_func, cpf_func); 
		}
		
		novo_func.setNome (nome_func);
		novo_func.setCpf (cpf_func);
		novo_func.setId_func(id_f);
		novo_func.setSenha_func(senha_f);
		Conta conta_func = new Conta();
		conta_func.setSaldo (saldo_f);
		conta_func.setSenha (senha_f);
		conta_func.setId (id_f);
		
		novo_func.conta = conta_func;

		
	
		

		return novo_func;
		
	}

	   public void PagarFunc(double saldo, Funcionario funcionario) {

		double salario = 0.0;

		if (funcionario instanceof RH)
			salario = 2500.0;

		if (funcionario instanceof ADM)
			salario = 2000.0;

		if (funcionario instanceof Gerente)
			salario = 10000.0;

		funcionario.getConta().deposita(salario);
		// return funcionario.conta.saldo;

	}
	   public Funcionario removeFunc (ArrayList<Funcionario> func) {
			int num = 0;
			
			Scanner a = new Scanner (System.in);
			System.out.println("Digite o ID do Funcionario que você quer excluir: ");
			String idPesq  = a.nextLine();
			
		    for (Funcionario f : func) {
		        if (f.conta.getId().equals(idPesq)) {
		            return f;
		        }
		    }
		    return null;

		}
}
