package view;

import javax.swing.JOptionPane;

import Controller.ControllerFatorial;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variável que receberá o número que irá calcular o fatorial
		int num;
		
		//dialog para inserir o número
		num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro até 12 para calcular o fatorial"));
		
		//método construtor
		ControllerFatorial cf = new  ControllerFatorial();
		
		//variável que irá calcular o fatorial
		int calcFatorial = cf.calcFatorial(num);
		
		//resultado no console
		System.out.println("Fatorial do número "+num+" é "+calcFatorial+".");
		

	}

}
