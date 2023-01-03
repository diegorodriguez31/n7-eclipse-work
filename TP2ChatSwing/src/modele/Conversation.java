package modele;

import java.util.List;
import java.util.Observable;

public class Conversation extends Observable {

	public List<Message> messages;

	
	
	// On averti les observateurs qu'on a été modifié
		this.setChanged();
		this.notifyObservers();
	
	
}
