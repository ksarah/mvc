package view.camembert;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JTable;

import model.camembert.Model;

public class CamembertView extends JComponent implements Observer, MouseListener{

	
	private Model model;
	List<Arc2D> la=new ArrayList<Arc2D>();
	private JTable tableau;
	
	public CamembertView(){
		Object[][] donnees = {
	             {"Johnathan", "Sykes"},
	             {"Nicolas", "Van de Kampf"},
	             {"Damien", "Cuthbert"},
	             {"Corinne", "Valance"},
	             {"Emilie", "Schrödinger"},
	             {"Delphine", "Duke"},
	             {"Eric", "Trump"},
	     };

	     String[] entetes = {"Prénom", "Nom"};

	      tableau = new JTable(donnees, entetes);
		
	}
	public CamembertView( Model model ){
		this.model=model;
		
		
		
	}
	
	public JTable getTableau() {
		return tableau;
	}
	public void setTableau(JTable tableau) {
		this.tableau = tableau;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	@Override
	public void update(Observable o, Object arg) {
        this.repaint();
        this.revalidate();
		
		
	}
	 
	public void paint(Graphics g) {
	    Graphics2D g2 = (Graphics2D)g;
	    
	    int sizeItems = model.getLi().size();
	    float cpt=0;
	    for(int i = 0; i<sizeItems;i++){
	    	Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE);
		    arc.setFrame(150, 150, 250, 250);
		    
	    	float angle = model.getLi().get(i).getValeurnum() * 360 / (float)model.calcTotal();
	    	 arc.setAngleStart(cpt);
	    	 cpt+=angle;
	    	 
	    	 Random rand = new Random();
	    	 
	    	 float r = rand.nextFloat();
	    	 float gg = rand.nextFloat();
	    	 float b = rand.nextFloat();
	    	 
	    	 Color randomColor = new Color(r, gg, b);
	    	 
	    	 arc.setAngleExtent(angle);
	 	     g2.setColor(Color.white);
	 	     g2.draw(arc);
	 	     g2.setColor(randomColor);
	 	     g2.fill(arc);
	 	     la.add(arc);
	 	     
	 	   
	 	     
	    }
	    
	    
//	    // 80 + 120 + 160 
//	    // 0 - 80 degrees
//	    arc.setAngleStart(0);
//	    arc.setAngleExtent(80);
//	    g2.setColor(Color.white);
//	    g2.draw(arc);
//	    g2.setColor(Color.red);
//	    g2.fill(arc);
//	 
//	    // 80 - 200 degrees
//	    arc.setAngleStart(80); //80
//	    arc.setAngleExtent(120); //120
//	    g2.setColor(Color.white);
//	    g2.draw(arc);
//	    g2.setColor(Color.pink);
//	    g2.fill(arc);
//	    
//	    // 200 - 360 degrees
//	    arc.setAngleStart(200); //200
//	    arc.setAngleExtent(160); //160
//	    g2.setColor(Color.white);
//	    g2.draw(arc);
//	    g2.setColor(Color.yellow);
//	    g2.fill(arc);
	    
	    
	    
	    g2.setColor(Color.blue); 
	    g2.fillOval(200, 200, 150, 150);
	    
	    g2.setColor(Color.white); 
	    g2.drawString("Budget =  "+model.calcTotal(), 255, 270);
	 
	   
	  }
	public List<Arc2D> getLa() {
		return la;
	}
	public void setLa(List<Arc2D> la) {
		this.la = la;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("cc");
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("cc");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
		
		

}
