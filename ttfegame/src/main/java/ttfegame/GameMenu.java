
package ttfegame;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GameMenu extends GraphicOperator {

    public GameMenu(JFrame jf) {
        super(jf);
    }

    @Override
    public void setActive() {
//        jf.removeAll();
        jf.setContentPane(new JPanel());
        jf.setLayout(new FlowLayout());
        JPanel jp1 = new JPanel(new FlowLayout());
        jp1.setPreferredSize(new Dimension(500, 250));
        JButton startButton = new JButton("Начать игру");
        JButton saveButton = new JButton("Сохранения");
        JButton exitButton = new JButton("Выйти");
        exitButton.addActionListener(l);
        jp1.add(startButton);
        jp1.add(saveButton);
        jp1.add(exitButton);
//        JLabel text = new JLabel("Начальное меню");
        jf.add(jp1);
        jf.revalidate();
        jf.repaint();
    }
    
}
