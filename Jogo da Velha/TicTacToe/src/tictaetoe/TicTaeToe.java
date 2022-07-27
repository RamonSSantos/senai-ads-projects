package tictaetoe; //Pacote principal

import javax.swing.JFrame; //Importando biblioteca

public class TicTaeToe {

	//M�todo MAIN
    public static void main(String[] args) {
        
    	//Criando JFrame e definindo t�tulo da janela
        JFrame janela = new JFrame("JOGO DA VELHA");
        
        //Definindo as propriedades a janela JFrame
        janela.setSize(610,635); //Tamanho
        janela.setLocationRelativeTo(null); //Centralizar na tela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Encerrar programa ao fechar a janela
        janela.setVisible(true); //Definir sempre vis�vel
        janela.setResizable(false); //Nao permitir redimensionamento da janela
        
        // Chamando o m�todo JogoDaVelha
        JogoDaVelha jogo = new JogoDaVelha();
            
        jogo.setBounds(0,0,610,635); //Tamanho do jogo
        janela.add(jogo); //Adicionando o jogo dentro da janela
        
        janela.addMouseListener(jogo); //Adicionando o m�todo MouseListener dentro do jogo
    }
}