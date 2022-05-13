
package old;

import javax.swing.JFrame;


public class SaveMenu extends GraphicOperator {

    public SaveMenu(JFrame jf) {
        super(jf);
    }

    @Override
    public void setActive() {
        jf.removeAll();
        jf.repaint();
        jf.revalidate();
    }
    
}
