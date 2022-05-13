package banco;

import java.util.HashMap;
import java.util.Map;

//exercicio 3

public class TestaMapa {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente(1984, 007, 2000, "8008135-3", "fuyuki");
		c1.deposita(10000);

		ContaCorrente c2 = new ContaCorrente(4891, 700, 2000, "1924029-3", "kuroshi");
		c2.deposita(3000);

		// cria o mapa
		Map<String, ContaCorrente> mapaDeContas = new HashMap<String, ContaCorrente>();

		// adiciona duas chaves e seus valores
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);

		// qual a conta do diretor?
		ContaCorrente contaDoDiretor = (ContaCorrente) mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
	}
}