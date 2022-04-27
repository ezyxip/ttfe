
package ttfegame.logical;

import ttfegame.logical.SaveSlot;
import ttfegame.logical.Statistic;
import ttfegame.logical.SaveManager;

public class SimpleSaveManager implements SaveManager {

    public SimpleSaveManager() {
    }
    @Override
    public SaveSlot[][] getSaveSlots(){
        return null;
    }
    @Override
    public Statistic getStatistic(){
        return new PlugStatistic();
    }
}
