package view;

import javax.swing.JOptionPane;

import Controller.ControllerFatorial;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//vari�vel que receber� o n�mero que ir� calcular o fatorial
		int num;
		
		//dialog para inserir o n�mero
		num = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero inteiro at� 12 para calcular o fatorial"));
		
		//m�todo construtor
		ControllerFatorial cf = new  ControllerFatorial();
		
		//vari�vel que ir� calcular o fatorial
		int calcFatorial = cf.calcFatorial(num);
		
		//resultado no console
		System.out.println("Fatorial do n�mero "+num+" � "+calcFatorial+".");
		

	}

}
