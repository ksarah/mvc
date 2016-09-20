package adapter.camembert;

import java.util.Observable;


import model.camembert.Items;
import model.camembert.Model;
import view.camembert.CamembertView;

public class ModelAdapter extends Observable{

	Model m = new Model();
	CamembertView cv ;
	public ModelAdapter(){this.addObserver(cv);}
	public ModelAdapter(CamembertView cv){ this.cv = cv;this.addObserver(cv); }
	
	public void addIt(Items i){
		m.addItem(i);
		this.setChanged();
		this.notifyObservers();
	}
	
	public void removeIt(Items i){
		m.removeItem(i);
		setChanged();
		notifyObservers();
	}
	
	public int calculateTotal(){
		return m.calcTotal();
	}

	public Model getM() {
		return m;
	}

	public void setM(Model m) {
		this.m = m;
	}
	
	
	

}
