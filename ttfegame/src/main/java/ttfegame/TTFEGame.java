
package ttfegame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TTFEGame {
    JFrame jf;
    GraphicOperator menuOperator;
    GraphicOperator saveOperator;
    GraphicOperator gameFieldOperator;
    public TTFEGame(String name){
        jf = new JFrame(name);
        menuOperator = new GameMenu(jf);
        saveOperator = new SaveMenu(jf);
        gameFieldOperator = new GameField(jf);
        jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jp = new JPanel(new FlowLayout(FlowLayout.CENTER)); 
        JLabel welcomeText = new JLabel("Игра запускается...");
        jp.add(welcomeText);
        jf.add(jp, BorderLayout.CENTER);
        
        jf.setVisible(true);
        menuOperator.setActive();
    }
    
    
}
