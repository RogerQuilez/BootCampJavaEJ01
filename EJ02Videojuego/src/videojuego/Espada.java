package videojuego;

public class Espada extends Arma {
	
	public Espada() {
		
	}

	public Espada(int damage) {
		super(damage);
	}
	
	public int getWeaponDamage() {
		return this.getClase() instanceof Warrior ? 
				this.getDamage() + this.getClase().getAttribute().getStats() : this.getDamage();
	}

}
