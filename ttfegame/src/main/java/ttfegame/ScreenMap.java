
package ttfegame;

import java.util.ArrayList;

/*
    Предназначен для представления карты всех экранов программы. Представляет собой
контейнер для объектов, реализующих Screen. В его обязанности входит:
- Выдача экранов по запросу
- Выдача информации по экранам
*/
public class ScreenMap {
    
    Screen getScreen(ScreenList screenList) {
        return new SaveMenuScreen();
    }
    public void add(Screen sc, Enum key){}
}
