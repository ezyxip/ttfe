
package ttfegame;

import ttfegame.logical.SaveManager;

public interface GameConfiguration {
    public String getTitle();
    public SaveManager getSaveManager();
    public ScreenMap getScreenMap();
}
