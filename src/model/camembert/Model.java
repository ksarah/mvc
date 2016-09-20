package model.camembert;

import java.util.List;
import java.util.ArrayList;

public class Model implements IModel{
	
	private String titre;
	private List<Items> li= new ArrayList<Items>();
	
	public Model(){
		
	}
	
	public Model(String titre){
		this.titre=titre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public List<Items> getLi() {
		return li;
	}

	public void setLi(List<Items> li) {
		this.li = li;
	}
	

	@Override
	public void addItem(Items i) {
		// TODO Auto-generated method stub
		li.add(i);
	}

	@Override
	public void removeItem(Items i) {
		// TODO Auto-generated method stub
		li.remove(i);
	}
	
	public int calcTotal(){
		int cpt=0;
		for (int i =0 ; i<getLi().size();i++){
			cpt += getLi().get(i).getValeurnum();
			
		}
		
		return cpt;
	}
	
	
	

}
