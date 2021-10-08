package videojuego;

public abstract class Attribute {

	private int stats;
	private String name;
	
	public Attribute(String name, int stats) {
		this.name = name;
		this.stats = stats;
	}

	public int getStats() {
		return stats;
	}

	public void setStats(int stats) {
		this.stats = stats;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
