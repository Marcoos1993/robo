package entities;

public class ComportamentoLento implements Comportamento{

	@Override
	public void mover() {

		System.out.println("Robo movendo-se lentamente");
	}

}
