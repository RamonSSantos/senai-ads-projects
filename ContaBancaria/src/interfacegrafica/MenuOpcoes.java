package interfacegrafica;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import classesobjetoconta.Conta;
import classesobjetoconta.Movimentacao;

public class MenuOpcoes {

	public void exibirMenu() throws ParseException{
		
		Conta conta = new Conta();
		
		criarConta(conta);
		
		while(true) {
			
			int opcao=Integer.parseInt(JOptionPane.showInputDialog(null, conta.getTitular() + ", o que voce deseja fazer?\n\n"
					+ "1- Solicitar Informacoes de Deposito\n"
					+ "2- Solicitar Informacoes de Saque\n\n"
					+ "3- Exibir Dados da Conta\n"
					+ "4- Exibir Extrato Completo\n\n"
					+ "5- Exibir Extrato de Depositos\n"
					+ "6- Exibir Extrato de Saques\n\n"
					+ "7- Sair do Programa\n\n",
					"Menu Principal", JOptionPane.QUESTION_MESSAGE));
			
			switch(opcao) {
			
				case 1:
					solicitarInfDeposito(conta);
				break;
				
				case 2:
					solicitarInfSaque(conta);
				break;
				
				case 3:
					exibirDadosConta(conta);
				break;
				
				case 4:
					exibirExtratoCompleto(conta);
				break;
				
				case 5:
					exibirExtratoDepositos(conta);
				break;
				
				case 6:
					exibirExtratoSaques(conta);
				break;
				
				case 7:
					System.exit(0);
				break;
				
				default:
					JOptionPane.showMessageDialog(null, "Öpçao Incorreta", "Erro", JOptionPane.OK_CANCEL_OPTION);
				break;
			}
		}
	}
	
	private void criarConta(Conta conta) {
		
		String nomeUsuario=JOptionPane.showInputDialog(null, "Digite o seu nome:\n\n", "Informacoes de Deposito", JOptionPane.QUESTION_MESSAGE);
		
		String[] tiposConta = {"Selecione", "Conta Poupança", "Conta Corrente"};
		JComboBox<Object> tiposDeConta = new JComboBox<Object>(tiposConta);
		Object[] messagetipoConta = {"Tipo de Conta:", tiposDeConta};
		
		int tipoConta=JOptionPane.showConfirmDialog(null, messagetipoConta, "Informacoes de Deposito", JOptionPane.OK_CANCEL_OPTION);
		
		int tipoContaSelecionada=0;
		
		if(tipoConta==JOptionPane.OK_OPTION) {
			
			switch(tiposDeConta.getSelectedIndex()) {
			
				case 1:
					tipoContaSelecionada=1;
				break;
				
				case 2:
					tipoContaSelecionada=2;
				break;
				
				default:
					JOptionPane.showMessageDialog(null, "Opçao Incorreta", "Erro", JOptionPane.INFORMATION_MESSAGE);
					criarConta(conta);
			}
		} else {
			
			criarConta(conta);
		}
		
		conta.setTitular(nomeUsuario);
		conta.setTipo(tipoContaSelecionada);
		
		//System.out.println(conta.getTitular());
		//System.out.println(conta.getTipo());
	}
	
	private void solicitarInfDeposito(Conta conta) throws ParseException {
		
		if(conta.getListaDeMovimentacao()==null) {
			
			List<Movimentacao> listaDeMovimentacao = new ArrayList<Movimentacao>();
			
			listaDeMovimentacao.add(solicInfoDeposito(conta));
			
			conta.addMovimentacao(listaDeMovimentacao);
			
		} else {
			
			List<Movimentacao> listaDeMovimentacao = conta.getListaDeMovimentacao();
			
			listaDeMovimentacao.add(solicInfoDeposito(conta));
			
			conta.addMovimentacao(listaDeMovimentacao);
		}
	}
	
	private Movimentacao solicInfoDeposito(Conta conta) throws ParseException {
		
		Movimentacao movimentacao = new Movimentacao();
		
		String dataDeposito=JOptionPane.showInputDialog(null, "Informe a data em MM/dd/yy:\n\n", "Informacoes de Deposito", JOptionPane.QUESTION_MESSAGE);
		
		DateFormat inputFormat  = new SimpleDateFormat("MM/dd/yy");
		DateFormat outputFormat = new SimpleDateFormat("dd.MM.yy");
		
		Date date = inputFormat.parse(dataDeposito);
		String formattedDate = outputFormat.format(date);
		
		double valorDeposito=Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor:", "Informacoes de Deposito", JOptionPane.QUESTION_MESSAGE));
		
		movimentacao.setTipo(2);
		movimentacao.setValor(valorDeposito);
		movimentacao.setData(formattedDate);
		
		String msgTipo="";
		if(movimentacao.getTipo()==1) {
			
			msgTipo="Saque";
		} else {
			
			msgTipo="Deposito";
		}
		
		String msgInfDeposito=msgTipo + " efetuado no dia " + movimentacao.getData() + " foi de R$ " + valorDeposito;
		
		JOptionPane.showMessageDialog(null, msgInfDeposito, "Informacoes de Deposito", JOptionPane.INFORMATION_MESSAGE);
		
		conta.depositar(valorDeposito);
		
		//System.out.println(conta.getSaldo());
		//System.out.println(movimentacao.getTipo());
		//System.out.println(movimentacao.getValor());
		//System.out.println(movimentacao.getData());
		
		return movimentacao;
	}
	
private void solicitarInfSaque(Conta conta) throws ParseException {
		
		if(conta.getListaDeMovimentacao()==null) {
			
			List<Movimentacao> listaDeMovimentacao = new ArrayList<Movimentacao>();
			
			listaDeMovimentacao.add(solicInfoSaque(conta));
			
			conta.addMovimentacao(listaDeMovimentacao);
			
		} else {
			
			List<Movimentacao> listaDeMovimentacao = conta.getListaDeMovimentacao();
			
			listaDeMovimentacao.add(solicInfoSaque(conta));
			
			conta.addMovimentacao(listaDeMovimentacao);
		}
	}
	
	private Movimentacao solicInfoSaque(Conta conta) throws ParseException {
		
		Movimentacao movimentacao = new Movimentacao();
		
		String dataSaque=JOptionPane.showInputDialog(null, "Informe a data em MM/dd/yy:\n\n", "Informacoes de Saque", JOptionPane.QUESTION_MESSAGE);
		
		DateFormat inputFormat  = new SimpleDateFormat("MM/dd/yy");
		DateFormat outputFormat = new SimpleDateFormat("dd.MM.yy");
		
		Date date = inputFormat.parse(dataSaque);
		String formattedDate = outputFormat.format(date);
		
		double valorSaque=Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor:", "Informacoes de Saque", JOptionPane.QUESTION_MESSAGE));
		
		double valorSaqueOk=conta.sacar(valorSaque);
		
		movimentacao.setTipo(1);
		movimentacao.setValor(valorSaqueOk);
		movimentacao.setData(formattedDate);
		
		String msgTipo="";
		if(movimentacao.getTipo()==1) {
			
			msgTipo="Saque";
		} else {
			
			msgTipo="Deposito";
		}
		
		String msgInfSaque=msgTipo + " efetuado no dia " + movimentacao.getData() + " foi de R$ " + valorSaqueOk;
		
		JOptionPane.showMessageDialog(null, msgInfSaque, "Informacoes de Deposito", JOptionPane.INFORMATION_MESSAGE);
		
		//System.out.println(conta.getSaldo());
		//System.out.println(movimentacao.getTipo());
		//System.out.println(movimentacao.getValor());
		//System.out.println(movimentacao.getData());
		
		return movimentacao;
	}
	
	private void exibirDadosConta(Conta conta) {
		
		String msgDadosConta=conta.consultarSaldo();
		JOptionPane.showMessageDialog(null, msgDadosConta, "Informaçoes da Conta", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void exibirExtratoCompleto(Conta conta) {
		
		if(conta.getListaDeMovimentacao()==null) {
			
			JOptionPane.showMessageDialog(null, "A conta nao possui nenhum extrato!", "Erro", JOptionPane.INFORMATION_MESSAGE);;
		} else {
			
			String msgExtratoCompleto=conta.gerarExtrato();
			
			JOptionPane.showMessageDialog(null, "Lista de Movimentaçoes:\n\n" + msgExtratoCompleto, "Extrato Completo da Conta", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	private void exibirExtratoDepositos(Conta conta) {
		
		if(conta.getListaDeMovimentacao()==null) {
			
			JOptionPane.showMessageDialog(null, "A conta nao possui nenhuma movimentacao!", "Erro", JOptionPane.INFORMATION_MESSAGE);;
		} else {
			
			Object msgExtratoDeposito=conta.gerarExtratoDepositos();
		
			JOptionPane.showMessageDialog(null, msgExtratoDeposito, "Informacoes de Extrato de Depositos", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	private void exibirExtratoSaques(Conta conta) {
		
		if(conta.getListaDeMovimentacao()==null) {
			
			JOptionPane.showMessageDialog(null, "A conta nao possui nenhuma movimentacao!", "Erro", JOptionPane.INFORMATION_MESSAGE);;
		} else {
			
			Object msgExtratoSaque=conta.gerarExtratoSaques();
		
			JOptionPane.showMessageDialog(null, msgExtratoSaque, "Informacoes de Extrato de Saques", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}