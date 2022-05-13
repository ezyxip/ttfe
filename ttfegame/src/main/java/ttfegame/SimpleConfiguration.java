
package ttfegame;

public class SimpleConfiguration implements GameConfiguration{

    public SimpleConfiguration() {
    }

    @Override
    public String getTitle() {
        return "TTFE GAME!";
    }

    @Override
    public SaveManager getSaveManager() {
        return null;
    }

    @Override
    public ScreenMap getScreenMap() {
        ScreenMap sm = new ScreenMap();
        Screen welcomeScreen = new WelcomeScreen();
        Screen mainMenu = new MainMenuScreen();
        Screen saveMenu = new SaveMenuScreen();
        Screen gameField = new GameFieldScreen();
        sm.add(welcomeScreen, ScreenList.WELCOME);
        sm.add(mainMenu, ScreenList.MAINMENU);
        sm.add(saveMenu, ScreenList.SAVES);
        sm.add(gameField, ScreenList.GAMEFIELD);
        
        return sm;
    }
    
}
