package videojuego;

public class Combat {

	public String startCombat(Personaje p1, Personaje p2) {
		
		while (p1.getClase().getLive() > 0 && p2.getClase().getLive() > 0) {
			p1.attack(p2);
			p2.attack(p1);
		}
		
		return p1.getClase().getLive() > 1 ? "El ganador de la batalla es: " + p1.getName() :
			"El ganador de la batalla es: " + p2.getName();
	}
}
