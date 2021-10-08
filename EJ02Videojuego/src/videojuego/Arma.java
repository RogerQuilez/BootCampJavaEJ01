package videojuego;

public abstract class Arma {
	
	private static int countId;
	private Clase clase;
	private int id;
	private int damage;
	
	public Arma() {
		
	}
	
	public Arma(int damage) {
		this.id = ++Arma.countId;
		this.damage = damage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public Clase getClase() {
		return clase;
	}

	public void setClase(Clase clase) {
		this.clase = clase;
	}
	
	public abstract int getWeaponDamage();
	
	
	
}
