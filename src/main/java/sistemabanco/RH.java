package sistemabanco;

//import java.util.Scanner;

public class RH extends Funcionario {

	public RH(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}
    OperacoesbancoRH op = new OperacoesbancoRH();
    
	public Funcionario cadastroFuncionario() {
		return op.cadastroFuncionario();
	}

	public void PagarFunc(double saldo, Funcionario funcionario) {
		op.PagarFunc(saldo, funcionario);
	}

	@Override
	public String toString() {
		return String.format("RH [id_func=%s, senha_func=%s, nome=%s, cpf=%s, conta=%s]", id_func, senha_func, nome,
				cpf, conta);
	} 
    
    
//
		
	}


