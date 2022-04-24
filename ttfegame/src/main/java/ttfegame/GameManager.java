
package ttfegame;

import java.util.ArrayList;
import java.util.Arrays;
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
        return currentField;
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
        return null;
    }
    
    public void loadSave(SaveSlot slot){
        
    }
    
    public Statistic getStatistic(){
        return new PlugStatistic();
    }
    
    public void newRound(){
        ArrayList<Integer> freeCellsList = new ArrayList<>();
        for(int i = 0; i < currentField.length; i++){
            for(int j = 0; j < currentField.length; j++){
                if(currentField[i][j] == 0)
                    freeCellsList.add(i*10+j);
            }
        }
        Arrays.deepToString();
        int value = (int) Math.random() * 100;
        value = value >= 90 ? 4 : 2;
        int coor = freeCellsList.get((int) Math.random() * (freeCellsList.size()-1));
        currentField[(coor - (coor % 10))/10][coor%10] = value;
    }
}
