

import controller.camembert.CamembertController;
import model.camembert.Items;

public class CamembertMain {
	
	 public static void main(String[] a) {
		 CamembertController c = new CamembertController();
		 		 
			 Items item1 = new Items("aa","bb",10);
			 Items item2= new Items("ses","ss",100);
			 Items item3 = new Items("eeee","rrrrr",10);
			 
			 c.addIt(item1);
			 c.addIt(item2);
			 c.addIt(item3);
			  
		 c.paint();
//		 try {
//			Thread.sleep(1000);
//
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		 Items item4 = new Items("eeee","rrrrr",105);
		 c.addIt(item4); 
		 
		 Items item5 = new Items("eeee","rrrrr",105);
		 c.addIt(item5); 
		 
		 System.out.println("Done !!");
	 }

}
