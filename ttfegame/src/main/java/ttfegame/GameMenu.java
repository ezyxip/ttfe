
package ttfegame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GameMenu extends GraphicOperator {
    Color color0 = new Color(250, 246, 135);
    Color color1 = new Color(237, 107, 52);
    Color color2 = new Color(247, 241, 54);
    Color color3 = new Color(61, 224, 181);
    Color color4 = new Color(109, 54, 247);

    public GameMenu(JFrame jf) {
        super(jf);
    }

    @Override
    public void setActive() {
//        jf.removeAll();
        //передача опреатору экрана сохранений указателя на оператор меню
        ops[0].setTransition(this);
        //передача опреатору экрана игры указателя на оператор меню
        ops[1].setTransition(this);
        //Импровизированная очистка окна
        jf.setContentPane(new JPanel());
        jf.setLayout(new BorderLayout());
        JPanel jpTop = new JPanel();
        jpTop.setPreferredSize(new Dimension(100,100));
        jf.add(jpTop, BorderLayout.NORTH);
        //Центральная паенелька с кнопками сохранения и игры
        JPanel jp1 = new JPanel(new GridLayout(3, 0, 50, 50));
        JButton startButton = new JButton("Начать игру");
        startButton.addActionListener(getOps()[1]);
        startButton.setBackground(color1);
        startButton.setPreferredSize(new Dimension(300,150));
        JButton saveButton = new JButton("Сохранения");
        saveButton.addActionListener(getOps()[0]);
        saveButton.setBackground(color2);
        saveButton.setPreferredSize(new Dimension(300,150));
        jp1.add(startButton);
        jp1.add(saveButton);
        jf.add(jp1);
        //Нижняя панелька
        JPanel jpBottom = new JPanel(new GridLayout(0,2));
        jpBottom.setPreferredSize(new Dimension(100,100));
        JButton exitButton = new JButton("Выход");
        exitButton.addActionListener(getOps()[2]);
        exitButton.setBackground(color3);
        exitButton.setPreferredSize(new Dimension(160, 80));
        JButton infoButton = new JButton("Статистика");
        infoButton.setBackground(color4);
        infoButton.setPreferredSize(new Dimension(160, 80));
        JPanel exitPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        exitPanel.add(exitButton);
        JPanel infoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        infoPanel.add(infoButton);
        jpBottom.add(infoPanel);
        jpBottom.add(exitPanel);
        jf.add(jpBottom, BorderLayout.SOUTH);
//        JLabel text = new JLabel("Начальное меню");
        jf.revalidate();
        jf.repaint();
    }
    
}
