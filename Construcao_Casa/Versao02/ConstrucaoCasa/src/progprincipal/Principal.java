package progprincipal;//Declaracao do pacote progprincipal

import interfacegrafica.MenuOpcoes;//Importando a classe MenuOpcoes do pacote interfacegrafica

public class Principal {//Declaracao da classe Principal

	public static void main(String[] args) {//Declaracao do metodo main()
		
		//Criando o objeto menu instanciando-o para a classe MenuOpces
		MenuOpcoes menu = new MenuOpcoes();
		//Acessando o metodo exibirMenu() pelo objeto menu
		menu.exibirMenu();
	}
}