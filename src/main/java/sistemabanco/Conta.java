package sistemabanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Conta {
	
	protected String id;
	protected String senha;
	
	
	public Conta(String id, String senha, double saldo) {
		super();
		this.id = id;
		this.senha = senha;
		this.saldo = saldo;
	}
	protected double saldo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	void saca (double valor) {
		double novoSaldo = this.saldo - valor;
		this.saldo = novoSaldo;
		}
	void deposita (double valor) {
		double novoSaldo = this.saldo + valor;
		this.saldo = novoSaldo;
		
		}
	void transfere (Conta destino, double valor, Cliente envia) {
        envia.conta.saldo = envia.conta.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }
	public Conta() {
		super();
	}
	@Override
	public String toString() {
		return String.format("Conta [id=%s, senha=%s, saldo=%s]", id, senha, saldo);
	}

	
	
	

}
