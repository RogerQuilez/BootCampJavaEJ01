package videojuego;

public abstract class Clase {

	private String name;
	private Arma arma;
	private int live;
	private Attribute attribute;

	public Clase(String name, Arma arma, int live, Attribute attribute) {
		this.name = name;
		this.arma = arma;
		this.live = live;
		this.attribute = attribute;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public int getLive() {
		return live;
	}

	public void setLive(int live) {
		this.live = live;
	}

	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}
	
}
