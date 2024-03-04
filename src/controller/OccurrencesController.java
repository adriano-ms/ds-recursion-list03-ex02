package controller;

public class OccurrencesController {

	public int occurrences(int n, int x) {
		//Quando 'n' alcancar a 0, retornara 0, assim nao interferindo na contagem
		if(n == 0) {
			return 0; 
		} else {
			//Existem dois comportamente diferentes: 
			//um para quando o numero que se deseja contar e igual a 0 e quando nao e igual
			//Isso se da para englobar os valores multiplos de 10 (100, 1000, etc)
			//A chamada se da dividindo o valor por 10, para que resulte em um numero com 1 digito a menos
			//A contagem e feita atraves do resto da divisao por 10, caso o valor seja igual ao numero procurado,
			//devera somar 1 a chamada do metodo
			if(x != 0)
				return (n % 10 == x ? 1 : 0) + occurrences(n/10,x);
			else
				return (n % 10 == x && n > 0 ? 1 : 0) + occurrences(n/10,x);
		}
	}
	
}
