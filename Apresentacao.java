// Caike Batista, Guilherme Moll, Micael Luan

import java.time.LocalDate;
import java.util.HashMap;

public class Apresentacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concessionaria c = new Concessionaria();
		Residencial a = new Residencial(true, "micael", "Faustin Pasquali", LocalDate.parse("2022-05-23"), "47996532896");
		c.addTelefone(a);
		Telefone procurado = c.procuraTelefone("47996532896");
	}

	protected Object frmLista;

}
