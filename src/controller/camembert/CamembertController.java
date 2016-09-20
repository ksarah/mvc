package controller.camembert;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import adapter.camembert.ModelAdapter;
import model.camembert.Items;
import view.camembert.CamembertView;

public class CamembertController implements MouseListener{
	
	
	CamembertView view = new CamembertView();
	ModelAdapter adapter = new ModelAdapter(view);
	
	public CamembertController(){
		view.addMouseListener(this);
		
	}
	
	public void paint (){
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setSize(1200, 600);
	    window.getContentPane().add(view.getTableau().getTableHeader(), BorderLayout.NORTH);
        window.getContentPane().add(view.getTableau(), BorderLayout.EAST);
	    window.getContentPane().add(new CamembertView(adapter.getM()));
	    

	    window.setVisible(true);
		
	}

	public void addIt(Items i){
		adapter.addIt(i);
		
	}
	public void removeIt(Items i){
		adapter.removeIt(i);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		 System.out.println(e.getX() +" "+e.getY());
		System.out.println("clic");
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

//		for (int i=0;i<view.getLa().size();i++){
//			if ( view.getLa().get(i).contains(e.getX(),e.getY())) {
//				System.out.println( view.getLa().get(i).getAngleStart());
//			}
//		}
      System.out.println(e.getX() +" "+e.getY());
      System.out.println("clic");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
