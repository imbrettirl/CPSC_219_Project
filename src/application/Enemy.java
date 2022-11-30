package application;

public class Enemy {
	private String name;
	private int hp;
	private int ep;
	
	Enemy(String name, int health, int energy) {
		this.setName(name);
		setHp(health);
		setEp(energy);
	}

	int getHp() {
		return hp;
	}

	void setHp(int hp) {
		this.hp = hp;
	}

	int getEp() {
		return ep;
	}

	void setEp(int ep) {
		this.ep = ep;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
}
