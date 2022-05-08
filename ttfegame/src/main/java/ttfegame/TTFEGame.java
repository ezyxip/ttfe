
package ttfegame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TTFEGame {
    JFrame jf;
    GraphicOperator menuOperator;
    public TTFEGame(String name){
        jf = new JFrame(name);
        menuOperator = new GameMenu(jf);
        GraphicOperator saveOperator = new SaveMenu(jf);
        GraphicOperator gameFieldOperator = new GameField(jf);
        GraphicOperator exitOperator = new ExitOperator(jf);
        menuOperator.setTransition(saveOperator, gameFieldOperator, exitOperator);
        jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jf.setUndecorated(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jp = new JPanel(new FlowLayout(FlowLayout.CENTER)); 
        JLabel welcomeText = new JLabel("Игра запускается...");
        jp.add(welcomeText);
        jf.add(jp, BorderLayout.CENTER);
        
        jf.setVisible(true);
        menuOperator.setActive();
    }
    
    
}
