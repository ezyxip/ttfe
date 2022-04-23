
package ttfegame;

import ttfegame.logical.SaveManager;
import ttfegame.logical.SaveSlot;
import ttfegame.logical.Statistic;

public class GameManager {
    
    SaveManager sm;
    int[][] currentField;
    
    public GameManager(SaveManager sm, int size){
        this.sm = sm;
        currentField = new int[size][size];
    }
    
    public int[][] getField(){
    }
    
    public void rightShift(){
    }
    
    public void leftShift(){
    }
    
    public void topShift(){
    }
    
    public void bottomShift(){
    }
    
    public SaveSlot[] getSaveList(){    
    }
    
    public void loadSave(SaveSlot slot){
        
    }
    
    public Statistic getStatistic(){
        
    }
    
    public void newRound(){
        
    }
}
