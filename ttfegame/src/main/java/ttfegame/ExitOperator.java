
package ttfegame;

import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class ExitOperator extends GraphicOperator {

    public ExitOperator(JFrame jf){
        super(jf);
    }
    
    @Override
    public void setActive() {
        getWindow().dispatchEvent(new WindowEvent(getWindow(), WindowEvent.WINDOW_CLOSING));
    }
    
}
