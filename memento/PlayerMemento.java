package memento;

import java.time.LocalDateTime;

public class PlayerMemento implements Memento{
	
	private String name;
	private LocalDateTime date;
	private int health;
	private int gold;
	
	public PlayerMemento(String name, LocalDateTime date, int health, int gold) {
		this.name = name;
		this.date = date;
		this.health = health;
		this.gold = gold;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public LocalDateTime getDate() {
		return this.date;
	}

	public int getHealth() {
		return health;
	}

	public int getGold() {
		return gold;
	}
	
	

}
