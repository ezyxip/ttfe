
package ttfegame;

import javax.swing.JFrame;
import javax.swing.JLabel;


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
        JLabel welcomeText = new JLabel("Игра запускается...");
        //Вот тут дописать
        jf.setVisible(true);
    }
    
    
}
