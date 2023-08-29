package sistemabanco;

public class Pessoa {
	
	
public Pessoa() {

	}
public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
protected String nome;
protected String cpf;
protected Conta conta; 
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public Conta getConta() {
	return conta;
}
public void setConta(Conta conta) {
	this.conta = conta;
}
}
