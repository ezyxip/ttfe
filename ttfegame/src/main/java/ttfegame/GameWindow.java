
package ttfegame;

import javax.swing.JFrame;

public class GameWindow {
    static JFrame frame;
    
    static synchronized JFrame getMainWindow(){
        if(frame == null){
            frame = new JFrame();
            //Вставить сюда код для настройки окна
        }
        return frame;
    }
}
