
package ttfegame;

import javax.swing.JFrame;

abstract class GraphicOperator {
    JFrame jf;
    public GraphicOperator(JFrame jf){
        this.jf = jf;
    }
    
    public abstract void setActive();
}
