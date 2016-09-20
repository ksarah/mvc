import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

public class TestDessin extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestDessin() {
        super();
 
        setTitle("JTable basique dans un JPanel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
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
 
        JTable tableau = new JTable(donnees, entetes);

        getContentPane().add(tableau.getTableHeader(), BorderLayout.NORTH);
        getContentPane().add(tableau, BorderLayout.CENTER);
 
        pack();
    }
 
    public static void main(String[] args) {
        new TestDessin().setVisible(true);
    }
}
