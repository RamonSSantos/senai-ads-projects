//Bibliotecas
import javax.swing.*;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Classe JogoDaVelha extendida do  JFrame implementando ActionListener
public class JogoDaVelha extends JFrame implements ActionListener {
	//Variaveis
	private JLabel numRodada, nmJogador01, nmJogador02;
	//private JButton btnGrav;
	
	//Iniciando JogoDaVelha
	public JogoDaVelha() {
		setLayout(null);
		
		//Label Numero da Rodada
		numRodada = new JLabel("Rodada ");
		numRodada.setForeground(Color.BLUE);
		numRodada.setBounds(10,5,390,20);
		add(numRodada);
		
		//Texto Nome Jogador 01
		nmJogador01 = new JLabel("Jogador 01");
		nmJogador01.setBounds(10,50,390,20);
		add(nmJogador01);
		
		//Texto Nome Jogador 01
		nmJogador02 = new JLabel("Jogador 02");
		nmJogador02.setBounds(10,70,390,20);
		add(nmJogador02);
		
	}
	//Funcao responsaveis pelos cliques
	public void ActionPerformed(ActionEvent acesso) {
		
	}
	//Funcao principal que ira criar a janela
	public static void main(String[] args) {
		JogoDaVelha game = new JogoDaVelha();
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.getContentPane().setBackground(Color.WHITE);
		
		//Tira o maximizar e alteracao do tamanho
		game.setResizable(false);
		game.setSize(400,400);
		game.setVisible(true);
		game.setLocationRelativeTo(null);
	}
	//Funcao que limpa o programa e deixa ele como executado pela primeira vez
	private void limpaDados() {
		nmJogador01.setText("");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
