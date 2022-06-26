package memento;

import java.util.ArrayList;

public class SaveSystem {
	
	private ArrayList<Memento> mementos = new ArrayList();
	private Player myPlayer;
	
	public SaveSystem(Player thePlayer) {
		this.myPlayer = thePlayer;
	}
	
	public void backup() {
		this.mementos.add(myPlayer.save());
	}
	
	public void undo() {
		Memento theMemento = mementos.remove(mementos.size() - 1);
		
		myPlayer.restore(theMemento);
	}

}
