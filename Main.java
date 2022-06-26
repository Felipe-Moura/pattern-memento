
import memento.Player;
import memento.SaveSystem;

public class Main {

	public static void main(String[] args) {
		
		Player carlos = new Player();
		SaveSystem save = new SaveSystem(carlos);
		
		System.out.println("Carlos health: " + carlos.getHealth());
		System.out.println("Carlos gold: " + carlos.getGold());
		
		carlos.play();
		
		System.out.println("---------------------------------------------------");
		System.out.println("Carlos health: " + carlos.getHealth());
		System.out.println("Carlos gold: " + carlos.getGold());
		
		save.backup();
		carlos.play();
		
		System.out.println("---------------------------------------------------");
		System.out.println("Carlos health: " + carlos.getHealth());
		System.out.println("Carlos gold: " + carlos.getGold());
		
		save.undo();
		
		System.out.println("---------------------------------------------------");
		System.out.println("Carlos health: " + carlos.getHealth());
		System.out.println("Carlos gold: " + carlos.getGold());
		

	}

}
