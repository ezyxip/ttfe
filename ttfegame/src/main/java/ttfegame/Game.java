
package ttfegame;

import javax.swing.JFrame;

/*Предназначение этого класса - собрать в кучку множество информации, которая
вводится на начало игры из main.
Среди этой информации:
- Как смотреть, загружать, удалять и создавать новые сохранения
- Каким образом организовывать переходы между экранами программы
- Каким образом будет выглядеть каждый экран 
*/
public class Game {
    private String gameTitle;
    private SaveManager saves;
    private ScreenMap screenMap;
    
    public Game(){
    }
    
    public void setGameTitle(String gameTitle){
        this.gameTitle = gameTitle;
    }
    public void setSaveManager(SaveManager saves){
        this.saves = saves;
    }
    public void setScreenMap(ScreenMap screenMap){
        this.screenMap = screenMap;
    }
    public String getGameTitle(){
        return gameTitle;
    }
    public SaveManager getSaveManager(){
        return saves;
    }
    public ScreenMap getScreenMap(){
        return screenMap;
    }
    
    public void configurate(GameConfiguration gc){
        setGameTitle(gc.getTitle());
        setSaveManager(gc.getSaveManager());
        setScreenMap(gc.getScreenMap());
    }
    
    public void start(){
        JFrame mainWindow = GameWindow.getMainWindow();
        mainWindow.setVisible(true);
        ScreenMap.getScreen(ScreenList.WELCOME).setActive();
    }
}
