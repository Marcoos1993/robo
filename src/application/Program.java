package application;

import entities.Comportamento;
import entities.ComportamentoLento;
import entities.ComportamentoNormal;
import entities.ComportamentoRapido;
import entities.Robo;

public class Program {

	public static void main(String[] args) {
		
		Comportamento lento = new ComportamentoLento();
		Comportamento normal = new ComportamentoNormal();
		Comportamento rapido = new ComportamentoRapido();
	
		Robo robo = new Robo();
		
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(lento);
		robo.mover();
		
		robo.setComportamento(rapido);
		robo.mover();
		robo.mover();
		robo.mover();

		
	}

}
