
package ttfegame;

import java.util.ArrayList;
import javax.swing.JFrame;

abstract class GraphicOperator {
    JFrame jf;
    ArrayList<GraphicOperator> ops;
    public GraphicOperator(JFrame jf, GraphicOperator... ops ){
        this.jf = jf;
        this.ops = new ArrayList<GraphicOperator>(ops);
    }
    
    public abstract void setActive();
}
