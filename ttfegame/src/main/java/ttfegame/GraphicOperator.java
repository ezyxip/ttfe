
package ttfegame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

abstract class GraphicOperator implements ActionListener{
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
    
     @Override
    public void actionPerformed(ActionEvent e) {
        setActive();
    }
    
    public GraphicOperator[] getOps(){
        return ops;
    }
    
    public JFrame getWindow(){
        return jf;
    }
    public abstract void setActive();
}
