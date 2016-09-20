package model.camembert;

public class Items {

		private String intitule;
		private String descriptionTextuelle;
		private int valeurnum;
		
		public Items(){
			
		}
		
		public Items(String intitule,String descriptionTextuelle,int valeurnum){
			
			this.intitule=intitule;
			this.descriptionTextuelle=descriptionTextuelle;
			this.valeurnum=valeurnum;
			
		}

		public String getIntitule() {
			return intitule;
		}

		public void setIntitule(String intitule) {
			this.intitule = intitule;
		}

		public String getDescriptionTextuelle() {
			return descriptionTextuelle;
		}

		public void setDescriptionTextuelle(String descriptionTextuelle) {
			this.descriptionTextuelle = descriptionTextuelle;
		}

		public int getValeurnum() {
			return valeurnum;
		}

		public void setValeurnum(int valeurnum) {
			this.valeurnum = valeurnum;
		}
		
		
		
		
}
