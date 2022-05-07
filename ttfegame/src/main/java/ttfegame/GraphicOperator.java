
package ttfegame;

import java.util.ArrayList;
import javax.swing.JFrame;

abstract class GraphicOperator {
    //Указатель на объект окна
    JFrame jf;
    //Список всех менеджеров экранов
    GraphicOperator[] ops;
    
    public GraphicOperator(JFrame jf){
        this.jf = jf;
    }
    
    public void setTransition(GraphicOperator... ops){
        this.ops = ops;
    }
    
    public abstract void setActive();
}
