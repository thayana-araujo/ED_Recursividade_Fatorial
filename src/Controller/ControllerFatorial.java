package Controller;

public class ControllerFatorial {
	
	public ControllerFatorial () {
		super();
	}
	
	
	public int calcFatorial(int num){
		
		
		//condição de parada
		//Se o número de entrada for igual ou menor que 1, então o retorno será 1
		if(num <= 1) {
		return 1;
		}
		/*Se o número informado pelo usuário for maior que 1, então será calculado o fatorial deste número. 
		Ou seja, o numero informado será multiplicado por ele mesmo -1.*/
		return num * calcFatorial(num - 1);
	}
}
