package classesobjetoconta;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Conta {

	private String titular;
	private int tipo;
	private double saldo;
	private List<Movimentacao> listaDeMovimentacao;
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public List<Movimentacao> getListaDeMovimentacao() {
		return listaDeMovimentacao;
	}
	
	public void setListaDeMovimentacao(List<Movimentacao> listaDeMovimentacao) {
		this.listaDeMovimentacao = listaDeMovimentacao;
	}
	
	public void depositar (double vlSaldo) {
		
		vlSaldo = getSaldo() + vlSaldo;
		setSaldo(vlSaldo);
	}
	
	public double sacar(double vlSaldo) {
		
		double vlSaldoAtual = getSaldo() - vlSaldo;
		
		if(-1000>vlSaldoAtual) {
				
				JOptionPane.showMessageDialog(null, "Nao é possivel sacar RS " + vlSaldo, "Saldo insuficiente", JOptionPane.INFORMATION_MESSAGE);
		} else {
			
		setSaldo(vlSaldoAtual);
		}
		
		return vlSaldoAtual;
	}
	
	public void addMovimentacao(List<Movimentacao> listaDeMovimentacao) {
		
		setListaDeMovimentacao(listaDeMovimentacao);
	}
	
	public String consultarSaldo() {
		
		String msgTipoConta="";
		
		if(getTipo()==1) {
			
			msgTipoConta="Conta Poupança";
			
		} else if(getTipo()==2) {
			
			msgTipoConta="Conta Corrente";
		}
		String msgDadosConta="Nome: " + getTitular() + "\nTipo: " + msgTipoConta + "\nSaldo: R$ " + getSaldo();
	
		return msgDadosConta;
	}
	
	public String gerarExtrato() {
		
		String msgExtratoCompleto="";
		String msgTipo="";
		
		for(Movimentacao movimentacao : getListaDeMovimentacao()) {
			
			if(movimentacao.getTipo()==1) {
				
				msgTipo="Saque";
			} else if(movimentacao.getTipo()==2) {
				
				msgTipo="Deposito";
			}
			
			msgExtratoCompleto=msgExtratoCompleto + "Tipo: " + msgTipo + "\nData: " + movimentacao.getData() + "\nValor: " + movimentacao.getValor() + "\n\n"; 
		}
		return msgExtratoCompleto;
	}
	
	public Object gerarExtratoDepositos() {
			
		List<String> list = new ArrayList<String>();
		String msgTipo="";
		int contadora=0;
			
		for(Movimentacao movimentacao : getListaDeMovimentacao()) {
			
			if(movimentacao.getTipo()==2) {
				
				contadora=contadora+1;
				msgTipo="Deposito";
				list.add(msgTipo + " efetuado no dia " + movimentacao.getData() + " foi de R$ " + movimentacao.getValor());
			}
		}
		
		if(contadora==0) {
			
			Object[] msgExtratoDeposito = {"Nao houve Depositos"};
			
			return msgExtratoDeposito;
		} else {
			
			Object[] msgExtratoDep = list.toArray();	
			Object[] msgExtratoDeposito = {"Extrato de Deposito(s):", msgExtratoDep};
			
			return msgExtratoDeposito;
		}
	}
	
public Object gerarExtratoSaques() {
			
		List<String> list = new ArrayList<String>();
		String msgTipo="";
		int contadora=0;
			
		for(Movimentacao movimentacao : getListaDeMovimentacao()) {
			
			if(movimentacao.getTipo()==1) {
				
				contadora=contadora+1;
				msgTipo="Saque";
				list.add(msgTipo + " efetuado no dia " + movimentacao.getData() + " foi de R$ " + movimentacao.getValor());
			} 
		}
		
		if(contadora==0) {
			
			Object[] msgExtratoSaque = {"Nao houve Saques"};
			
			return msgExtratoSaque;
		} else {
			
			Object[] msgExtratoSaq = list.toArray();	
			Object[] msgExtratoSaque = {"Extrato de Saque(s):", msgExtratoSaq};
		
			return msgExtratoSaque;
		}
	}
}