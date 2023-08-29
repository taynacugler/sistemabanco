package sistemabanco;

public class Cliente extends Pessoa {
	public Cliente () {
		
	}

	@Override
	public String toString() {
		return String.format("Cliente [nome=%s, cpf=%s, conta=%s]", nome, cpf, conta);
	}

}
