
package ttfegame.logical;

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
        ArrayList<Integer>[] numbers = new ArrayList[currentField.length];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = new ArrayList<>();
        }
        for(int k = 0; k < currentField.length; k++){
            for(int i = currentField.length - 1; i >= 0; i--){
                if(currentField[k][i] != 0){
                    if(!numbers[k].isEmpty() && numbers[k].get(numbers[k].size() - 1).equals(currentField[k][i])) {
                        numbers[k].set(numbers[k].size() - 1, (int)numbers[k].get(numbers[k].size() - 1) * 2);
                    } else {
                        numbers[k].add(currentField[k][i]);
                    }
                }
            }
        }
        currentField = new int[currentField.length][currentField.length];
        for(int i = 0; i < currentField.length; i++)
        {
            int j = currentField.length - 1;
            for(Integer k : numbers[i]){
                currentField[i][j] = (int)k;
                j--;
            }
        }
    }
    
    public void leftShift(){
        ArrayList<Integer>[] numbers = new ArrayList[currentField.length];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = new ArrayList<>();
        }
        for(int k = 0; k < currentField.length; k++){
            for(int i = 0; i < currentField.length; i++){
                if(currentField[k][i] != 0){
                    if(!numbers[k].isEmpty() && numbers[k].get(numbers[k].size() - 1).equals(currentField[k][i])) {
                        numbers[k].set(numbers[k].size() - 1, (int)numbers[k].get(numbers[k].size() - 1) * 2);
                    } else {
                        numbers[k].add(currentField[k][i]);
                    }
                }
            }
        }
        currentField = new int[currentField.length][currentField.length];
        for(int i = 0; i < currentField.length; i++)
        {
            int j = 0;
            for(Integer k : numbers[i]){
                currentField[i][j] = (int)k;
                j++;
            }
        }
    }
    
    public void topShift(){
        ArrayList<Integer>[] numbers = new ArrayList[currentField.length];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = new ArrayList<>();
        }
        for(int k = 0; k < currentField.length; k++){
            for(int i = 0; i < currentField.length; i++){
                if(currentField[i][k] != 0){
                    if(!numbers[k].isEmpty() && numbers[k].get(numbers[k].size() - 1).equals(currentField[i][k])) {
                        numbers[k].set(numbers[k].size() - 1, (int)numbers[k].get(numbers[k].size() - 1) * 2);
                    } else {
                        numbers[k].add(currentField[i][k]);
                    }
                }
            }
        }
        currentField = new int[currentField.length][currentField.length];
        for(int i = 0; i < currentField.length; i++)
        {
            int j = 0;
            for(Integer k : numbers[i]){
                currentField[j][i] = (int)k;
                j++;
            }
        }
    }
    
    public void bottomShift(){
         ArrayList<Integer>[] numbers = new ArrayList[currentField.length];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = new ArrayList<>();
        }
        for(int k = 0; k < currentField.length; k++){
            for(int i = currentField.length - 1; i >= 0; i--){
                if(currentField[i][k] != 0){
                    if(!numbers[k].isEmpty() && numbers[k].get(numbers[k].size() - 1).equals(currentField[i][k])) {
                        numbers[k].set(numbers[k].size() - 1, (int)numbers[k].get(numbers[k].size() - 1) * 2);
                    } else {
                        numbers[k].add(currentField[i][k]);
                    }
                }
            }
        }
        currentField = new int[currentField.length][currentField.length];
        for(int i = 0; i < currentField.length; i++)
        {
            int j = currentField.length - 1;
            for(Integer k : numbers[i]){
                currentField[j][i] = (int)k;
                j--;
            }
        }
    }
    
    public SaveSlot[] getSaveList(){
        return null;
    }
    
    public void loadSave(SaveSlot slot){
        currentField = slot.getLoadSave().getSlots();
    }
    
    public Statistic getStatistic(){
        return new PlugStatistic();
    }
    
    public void newRound(){
        ArrayList<Integer> freeCellsList = new ArrayList<>();
        for(int i = 0; i < currentField.length; i++){
            for(int j = 0; j < currentField.length; j++){
                if(currentField[i][j] == 0){
                    freeCellsList.add(i*10+j);
                }
            }
        }
        
        int value = (int) (Math.random() * 100);
        value = value >= 90 ? 4 : 2;
        int coor = freeCellsList.get((int) (Math.random() * (freeCellsList.size()-1)));
        currentField[(coor - (coor % 10))/10][coor%10] = value;
    }
}
