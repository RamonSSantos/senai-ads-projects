package progprincipal;

import java.text.ParseException;

import interfacegrafica.MenuOpcoes;

public class Principal {

	public static void main(String[] args) throws ParseException {

		MenuOpcoes menu = new MenuOpcoes();
		menu.exibirMenu();
	}
}