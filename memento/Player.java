package memento;

import java.time.LocalDateTime;
import java.util.Random;

public class Player {
	
	private int health;
	private int gold;
	
	public Player() {
		this.health = 10;
		this.gold = 0;
	}
	
	public void play() {
		Random rnd = new Random();
		if(rnd.nextInt(10) % 2 == 0) {
			this.health += rnd.nextInt(10);
			this.gold += rnd.nextInt(100);
		}
		else {
			this.health -= rnd.nextInt(10);
			this.gold += rnd.nextInt(100);
		}
		
		if(this.health < 0) {
			this.health = 0;
		}
		
		if(this.health > 10) {
			this.health = 10;
		}
	}
	
	public Memento save() {
		return new PlayerMemento(LocalDateTime.now().toString(), LocalDateTime.now(), health, gold);
	}
	
	public void restore(Memento memento) {
		PlayerMemento myMemento = (PlayerMemento) memento;
		
		this.health = myMemento.getHealth();
		this.gold = myMemento.getGold();
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	
	

}
