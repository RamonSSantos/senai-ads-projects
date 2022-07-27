package progprincipal;

import interfacegrafica.Fabrica;

public class Principal {

	public static void main(String[] args) {

		Fabrica fabrica = new Fabrica();
		fabrica.exibirMenu();
	}
}