package videojuego;

public class Spell extends Arma {

	public Spell(int damage) {
		super(damage);
	}
	
	public int getWeaponDamage() {
		return this.getClase() instanceof Mage ? 
				this.getDamage() + this.getClase().getAttribute().getStats() : this.getDamage();
	}

}
