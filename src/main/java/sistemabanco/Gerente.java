package sistemabanco;

public class Gerente extends Funcionario {

	public Gerente(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}
	OperacoesbancoRH op_rh = new OperacoesbancoRH();
	OperacaobancoADM op_adm = new OperacaobancoADM();
	public Funcionario cadastroFuncionario() {
		return op_rh.cadastroFuncionario();
	}
	public void PagarFunc(double saldo, Funcionario funcionario) {
		op_rh.PagarFunc(saldo, funcionario);
	}
	public Cliente abrirContaCliente() {
		return op_adm.abrirContaCliente();
	}
	

}
