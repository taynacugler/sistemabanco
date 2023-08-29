package sistemabanco;

import java.util.ArrayList;
import java.util.Scanner;

public class OperacaobancoGerente {
public Cliente mostrarLista (ArrayList<Cliente> cli) {
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
