package controller;

public class NumeroController {
	
	public NumeroController() {
		super();
	}
	
	public int quantasVezesNum(int a, int b, int vezes) {
		// se b for igual ao resto da divisão de a por 10, então o número aparece uma vez a mais
		if (b == a % 10) {
			vezes++;
		}
		
		// se a for menor que 10, chegamos ao final e retornamos quantas vezes encontramos o número
		if (a < 10) {
			return vezes;
		} else {
			// se não, retornamos a função, mas passando como parâmento a com um dígito a menos
			return quantasVezesNum(a / 10, b, vezes);
		}
	}
}
