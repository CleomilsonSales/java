package oo.heranca;

public class Heroi extends Jogador {
	//herdando tudo do jogador
	
	//sobreescrenvendo metodo
	boolean atacar(Jogador oponente) {
		//Math.abs - pegando o valor absoluto, ignorando se � posito ou negativo
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		//verificando se os jogadores est�o um do lado do outro
		if (deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20;
			return true;
		}else if (deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20;
			return true;
		}else {
			return false;
		}
		
		/*
		 * pode tambem chamar o metodo da clase ao inves de altera-la
		 * para usar na situa��o de atacar mais fotes
		 
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		return ataque1 || ataque2;
		*/
	}
}
