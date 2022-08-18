package Controller;

public class ControllerFatorial {
	
	public ControllerFatorial () {
		super();
	}
	
	
	public int calcFatorial(int num){
		
		
		//condi��o de parada
		//Se o n�mero de entrada for igual ou menor que 1, ent�o o retorno ser� 1
		if(num <= 1) {
		return 1;
		}
		/*Se o n�mero informado pelo usu�rio for maior que 1, ent�o ser� calculado o fatorial deste n�mero. 
		Ou seja, o numero informado ser� multiplicado por ele mesmo -1.*/
		return num * calcFatorial(num - 1);
	}
}
