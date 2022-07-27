package interfacegrafica;//Declaracao do pacote interfacegrafica

import javax.swing.JComboBox;//Importando JComboBox
import javax.swing.JOptionPane; //Importando JOptionPane

import classesobjetoscasa.Casa;//Importando a classe Casa do pacote classesobjetoscasa
import classesobjetoscasa.Janela;//Importando a classe Janela do pacote classesobjetoscasa
import classesobjetoscasa.Porta;//Importando a classe Porta do pacote classesobjetoscasa

import java.util.ArrayList;//Importando ArrayList
import java.util.List;//Importando List

public class MenuOpcoes {//Declaracao da classe MenuOpcoes
	
	//Declaracao do método dinamico exibirMenu() - está sendo acessado pelo objeto menu
	public void exibirMenu() {
		
		//Criando o objeto casa e instanciando-o para a classe Casa
		Casa casa = new Casa();
		
		//Criando o menu de opcoes
		while(true) {//Enquanto for true (nao receber false > execute o que está dentro do while)
			
			//Declaracao da variavel acao tipo int
			//Solicitando ao usuario a acao a ser executada
			int acao=Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opcao: \n\n"
					+ "1- Construir Casa \n"
					+ "2- Pintar Casa \n"
					+ "3- Mover Porta(s) \n"
					+ "4- Mover Janela(s) \n"
					+ "5- Informacoes da Casa \n"
					+ "6- SAIR \n\n", "Menu Principal", JOptionPane.QUESTION_MESSAGE));
		
			/*
			 * Estrutura condicional que verifica qual opcao do menu foi escolhida
			 */
				
			switch(acao) {
			
			/*
			 * Caso a opcao escolhida seja 1, chamar o método que permitirá fazer as
			 * entradas de dados necessarias para a construcao da casa
			 */
				case 1:
					dadosConstCasa(casa);//Acessa o metodo interno da classe dadosConstCasa passando como parametro o objeto casa
				break;
				
				case 2:
					pintarCasa(casa);//Acessa o metodo interno da classe pintarCasa passando como parametro o objeto casa
				break;
				
				case 3:
					moverPorta(casa);//Acessa o metodo interno da classe moverPorta passando como parametro o objeto casa
				break;
				
				case 4:
					moverJanela(casa);//Acessa o metodo interno da classe moverJanela passando como parametro o objeto casa
				break;
                                
                case 5:
					exibirInformacoes(casa);//Acessa o metodo interno da classe exibirInformacoes passando como parametro o objeto casa
                break;
				
				case 6:
					System.exit(0);//Encerra o programa
				break;
				
				default:
					JOptionPane.showMessageDialog(null, "Opcao Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
				break;
			}
		}
	}
	
	private void dadosConstCasa(Casa casa) {
		
		//Entrada de dados
		String descricao=JOptionPane.showInputDialog(null, "Descricao da casa: \n\n", "Informacoes da casa", JOptionPane.QUESTION_MESSAGE);
		String cor=JOptionPane.showInputDialog(null, "Informe a cor da casa: \n\n", "Informacoes da casa", JOptionPane.QUESTION_MESSAGE);
	
		int quantidadePorta=Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de portas: \n\n", "Informacoes da casa", JOptionPane.QUESTION_MESSAGE));
		int quantidadeJanela=Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de janelas: \n\n", "Informacoes da casa", JOptionPane.QUESTION_MESSAGE));
	
		/*
		 * Declaracao do array listaDeJanelas e array listaDePortas
		 * Lista de objetos que estao sendo identificados pelas classes Janela/Porta
		 */
		List<Janela> listaDeJanelas = new ArrayList<Janela>();
		List<Porta> listaDePortas = new ArrayList<Porta>();
		
		//Extrutura de repeticao, iniciando com 0, indo até a quantidade de janelas informada pelo usuario e incremento + 1 apos o termino da passagem
		for(int i=0; i<quantidadeJanela; i++) {
			
			//Adicionando no objeto listaDeJanelas as informacoes obtidas do metodo solicitarJanelas passandro como parametro a variavel declarada dentro do for
			listaDeJanelas.add(solicitarJanelas(i));
		}
		
		//Extrutura de repeticao, iniciando com 0, indo até a quantidade de portas informada pelo usuario e incremento + 1 apos o termino da passagem
		for(int i=0; i<quantidadePorta; i++) {
			
			//Adicionando no objeto listaDePortas as informacoes obtidas do metodo solicitarPortas passandro como parametro a variavel declarada dentro do for
			listaDePortas.add(solicitarPortas(i));
		}
		
		//Armazena os valores das entradas de dados para os atributos do objeto casa
		//Variaveis: descricao,cor / Objetos: listaDeJanelas,listaDePortas (encapsulamento de dados)
		casa.construirCasa(descricao, cor, listaDeJanelas, listaDePortas);
		
		//Impressao na Console
		//System.out.println(casa.getDescricao());
		//System.out.println(casa.getCor());
		
		//for(Janela janela : casa.getListaDeJanelas()) {
			
			//Impressao na Console
			//System.out.println("Descricao: " + janela.getIdentificacao());
			//System.out.println("Situacao" + janela.getStatus());
		//}
		
		//for(Porta porta : casa.getListaDePortas()) {
			
			//Impressao na Console
			//System.out.println("Descricao" + porta.getIdentificacao());
			//System.out.println("Situacao" + porta.getStatus());
		//}
	}
	
	private Janela solicitarJanelas(int i) {
		
		//Cria o objeto janela apontando para a instancia da classe Janela
		Janela janela = new Janela();
		
		//Incrementa a variavel i de 1
		i=i+1;
		
		//Entrada de dados
		String identificacao=JOptionPane.showInputDialog(null, "Digite a descricao da janela" + (i) + ": \n\n", "Janela", JOptionPane.QUESTION_MESSAGE);
		int status=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o status da janela " + identificacao + "\n 1 Para aberta: \n 2 Para fechada: \n\n", "Janela", JOptionPane.QUESTION_MESSAGE));
		
		/*
		 * Chama o metodo setIdentificacao() passando como parametro a identificacao da janela
		 * processada no momento para que esta seja armazenada no atributo identificacao da classe Janela
		 */
		janela.setIdentificacao(identificacao);
		
		/*
		 * Chama o metodo setStatus() e de acordo com o status informado pelo usuario
		 * repassa o valor para ser armazenado no atributo status da classe Janela
		 */
		
		if(status==1) {
			
			janela.setStatus(1);
		} else {
			
			janela.setStatus(2);
		}
		
		//System.out.println(janela.getIdentificacao());
		//System.out.println(janela.getStatus());
		
		return janela;
	}
	
	private Porta solicitarPortas(int i) {
		
		//Cria o objeto porta apontando para a instancia da classe Porta
		Porta porta = new Porta();
		
		//Incrementa a variavel i de 1
		i=i+1;
		
		//Entrada de dados
		String identificacao=JOptionPane.showInputDialog(null, "Digite a descricao da porta" + (i) + ": \n\n", "Porta", JOptionPane.QUESTION_MESSAGE);
		int status=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o status da porta " + identificacao + "\n 1 Para aberta: \n 2 Para fechada: \n\n", "Porta", JOptionPane.QUESTION_MESSAGE));
		
		/*
		 * Chama o metodo setIdentificacao() passando como parametro a identificacao da janela
		 * processada no momento para que esta seja armazenada no atributo identificacao da classe Janela
		 */
		porta.setIdentificacao(identificacao);
		
		/*
		 * Chama o metodo setStatus() e de acordo com o status informado pelo usuario
		 * repassa o valor para ser armazenado no atributo status da classe Janela
		 */
		if(status==1) {
			
			porta.setStatus(1);
		} else {
			
			porta.setStatus(2);
		}
		
		//System.out.println(porta.getIdentificacao());
		//System.out.println(porta.getStatus());
		
		return porta;
	}
	
	/*
	 * O metodo pintarCasa() produz uma entrada de dados para receber a cor que o usuario
	 * deseja para a casa. Na sequencia, repassa essa cor para o metodo pintarCasa()
	 * localizado na classe Casa, por meio do objeto casa
	 */
	private void pintarCasa(Casa casa) {
		
		String cor=JOptionPane.showInputDialog(null, "Cor atual: " + casa.getCor() + "\nDigite a nova cor da casa: "
				, "Casa", JOptionPane.QUESTION_MESSAGE);
		casa.pintarCasa(cor);
		
		//System.out.println(casa.getCor());
	}
	
	private void moverPorta(Casa casa) {
		
		//Porta porta = new Porta();
		
		if(casa.getListaDePortas()==null) {//Se a lista de portas do objeto casa for null, ou seja, nao existir (for vazio)
			
			JOptionPane.showMessageDialog(null, "A casa nao tem Porta(s)", "Erro", JOptionPane.OK_CANCEL_OPTION);
		} else {//Senao...
			
			JOptionPane.showMessageDialog(null, "A casa tem Porta(s)", "OK", JOptionPane.OK_CANCEL_OPTION);
			
			List list = new ArrayList();//Declaracao do objeto list do tipo List instanciando para uma arrayList()
			
			for(Porta porta : casa.getListaDePortas()) {//FOREACH > para cada objeto porta da classe Porta recebe a lista de portas do objeto casa da classe Casa
				
				list.add(porta.getIdentificacao());//Adiciona no objeto list tipo arrayList() cada objeto da instancia porta recebendo o metodo encapsulado getIdentificacao()
			}
			
			JComboBox field1 = new JComboBox(list.toArray());//Declaracao da variavel field1 tipo JComboBox instanciando no JComboBox (que é um arrayList()) o objeto list
			String[] listStatus = {"Selecione", "Aberta", "Fechada"};//Declaracao do array listStatus tipo String armazenando as opcoes de status... indice0, indice1, indice2
			
			JComboBox field2 = new JComboBox(listStatus);//Declaracao da variavel field2 tipo JComboBox instanciando para o JComboBox (que é um arrayList) a array acima listStatus
			Object[] message = {"Porta:", field1, "Status:", field2};//Declaracao do array message tipo object armazenando as informacoes de cada porta: texto porta/status e identificacao/status 
			
			//Mostra o array message tipo objeto as informacoes de cada porta em forma de JComboBox
			int option = JOptionPane.showConfirmDialog(null, message, "Porta", JOptionPane.OK_CANCEL_OPTION);//Recebe na variavel option tipo int a acao que o usuario executou na caixa de showConfirmDialo
			
			int status=0;//Inicializacao da variavel status
			
			if(option==JOptionPane.OK_OPTION) {//Se o usuario clicou no botao OK
				
				switch(field2.getSelectedIndex()) {//Verificando na extrutura condicional atraves do metodo getSelectedIndex() o que foi guardado na variavel field2
					
					case 1:
						status=1;//Se for 1 armazenar 1 na variavel status
					break;
					
					case 2:
						status=2;//Se for 2 armazenar 2 na variavel status
					break;
					
					default:
						moverPorta(casa);//Se for diferente de 1 e 2 executar o metodo moverPorta() passando como parametro o objeto casa
					break;
				}
				
				casa.movimentarPorta(field1.getSelectedIndex(), status);//Acessa o metodo movimentarPorta() pelo objeto casa passando como parametro as informacoes da porta
			} else {
				moverPorta(casa);//Se o usuario nao clicar em OK executar o metodo moverPorta() passando como parametro o objeto casa
			}
		}
	}
	
	private void moverJanela(Casa casa) {
		
		if(casa.getListaDeJanelas()==null) {//Se a lista de janelas do objeto casa for null, ou seja, nao existir (for vazio)
			
			JOptionPane.showMessageDialog(null, "A casa nao tem Janela(s)", "Erro", JOptionPane.OK_CANCEL_OPTION);
		} else {
			
			JOptionPane.showMessageDialog(null, "A casa tem Janela(s)", "OK", JOptionPane.OK_CANCEL_OPTION);
			
			List list = new ArrayList();//Declaracao do objeto list do tipo List instanciando para uma arrayList()
			
			for(Janela janela : casa.getListaDeJanelas()) {//FOREACH > para cada objeto janela da classe Janela recebe a lista de janelas do objeto casa da classe Casa
				
				list.add(janela.getIdentificacao());//Adiciona no objeto list tipo arrayList() cada objeto da instancia janela recebendo o metodo encapsulado getIdentificacao()
			}
			
			JComboBox field1 = new JComboBox(list.toArray());//Declaracao da variavel field1 tipo JComboBox instanciando no JComboBox (que é um arrayList()) o objeto list
			String[] listStatus = {"Selecione", "Aberta", "Fechada"};//Declaracao do array listStatus tipo String armazenando as opcoes de status... indice0, indice1, indice2
			
			JComboBox field2 = new JComboBox(listStatus);//Declaracao da variavel field2 tipo JComboBox instanciando para o JComboBox (que é um arrayList) a array acima listStatus
			Object[] message = {"Janela:", field1, "Status:", field2};//Declaracao do array message tipo object armazenando as informacoes de cada janela: texto porta/status e identificacao/status
			
			//Mostra o array message tipo objeto as informacoes de cada janela em forma de JComboBox
			int option = JOptionPane.showConfirmDialog(null, message, "Janela", JOptionPane.OK_CANCEL_OPTION);//Recebe na variavel option tipo int a acao que o usuario executou na caixa de showConfirmDialog
			
			int status=0;//Inicializacao da variavel status
			
			if(option==JOptionPane.OK_OPTION) {//Se o usuario clicou no botao OK
				
				switch(field2.getSelectedIndex()) {//Verificando na extrutura condicional atraves do metodo getSelectedIndex() o que foi guardado na variavel field2
					
					case 1:
						status=1;//Se for 1 armazenar 1 na variavel status
					break;
					
					case 2:
						status=2;//Se for 2 armazenar 2 na variavel status
					break;
					
					default:
						moverJanela(casa);//Se for diferente de 1 e 2 executar o metodo moverJanela() passando como parametro o objeto casa
					break;
				}
				
				casa.movimentarPorta(field1.getSelectedIndex(), status);//Acessa o metodo movimentarJanela() pelo objeto casa passando como parametro as informacoes da janela
			} else {
				moverJanela(casa);//Se o usuario nao clicar em OK executar o metodo moverJanela() passando como parametro o objeto casa
			}
		}
	}
        
        private void exibirInformacoes(Casa casa) {
        	
        	//Inicializacao das variaveis
        	String msgPortas="";
        	String msgJanelas="";
        	
        	int qtPortas=0;
        	int qtJanelas=0;
        	
        	String situacaoPorta="";
        	String situacaoJanela="";
        	
        	for(Porta porta : casa.getListaDePortas()) {//FOREACH > para cada objeto porta da classe Porta recebe a lista de portas do objeto casa da classe Casa
        		
        		qtPortas=qtPortas+1;//Incremento da variavel qtPortas + 1 para cada passagem do foreach
        		
        		if(porta.getStatus()==1) {//Se o status da porta é 1...
        			
        			situacaoPorta="Äberta";
        		} else if(porta.getStatus()==2) {//Se o status da porta é 2...
        			
        			situacaoPorta="Fechada";
        		}
        		msgPortas=msgPortas + "\nDescricao: " + porta.getIdentificacao() + "\nSituacao: " + situacaoPorta + "\n";//Concatenando as informacoes (dentro do for)
        	}
        	msgPortas="Quantidade de porta(s): " + qtPortas + "\n" + msgPortas;//Concatenando as informacoes
        	
        	for(Janela janela : casa.getListaDeJanelas()) {//FOREACH > para cada objeto janela da classe Janela recebe a lista de janelas do objeto casa da classe Casa
        		
        		qtJanelas=qtJanelas+1;//Incremento da variavel qtPortas + 1 para cada passagem do foreach
        		
        		if(janela.getStatus()==1) {//Se o status da janela é 1...
        			
        			situacaoJanela="Äberta";
        		} else if(janela.getStatus()==2) {//Se o status da janela é 2...
        			
        			situacaoJanela="Fechada";
        		}
        		
        		msgJanelas=msgJanelas + "\nDescricao: " + janela.getIdentificacao() + "\nSituacao: " + situacaoJanela + "\n";//Concatenando as informacoes (dentro do for)
        	}
        	msgJanelas="Quantidade de janela(s): " + qtJanelas + "\n" + msgJanelas;//Concatenando as informacoes
    		
        	/*
        	 * Mostrando as informacoes da casa, janelas e portas
        	 */
        	JOptionPane.showMessageDialog(null, "INFORMACOES DA CASA\nTipo: " 
        			+ casa.getDescricao()
        			+ "\nCor: " + casa.getCor()

        			+ "\n\nINFORMACOES DA(S) PORTA(S)\n" + msgPortas
        			+ "\nINFORMACOES DA(S) JANELA(S)\n" + msgJanelas

        			, "Casa", JOptionPane.INFORMATION_MESSAGE);
        }
}