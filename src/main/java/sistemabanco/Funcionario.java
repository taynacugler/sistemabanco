package sistemabanco;

public class Funcionario extends Pessoa {
	public Funcionario(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}
	protected String id_func;
	protected String senha_func;
	
	public String getId_func() {
		return id_func;
	}
	public Funcionario() {
		super();
	}
	public void setId_func(String id_func) {
		this.id_func = id_func;
	}
	public String getSenha_func() {
		return senha_func;
	}
	public void setSenha_func(String senha_func) {
		this.senha_func = senha_func;
	}
	@Override
	public String toString() {
		return String.format("Funcionario [id_func=%s, senha_func=%s, nome=%s, cpf=%s, conta=%s]", id_func, senha_func,
				nome, cpf, conta);
	}
	

}
