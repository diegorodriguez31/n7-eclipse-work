package vue;

import java.util.Observable;
import java.util.Observer;

public class VueTexte implements Observer{

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("test");
	}

	
}
