
package ttfegame;

public class Main {
    public static void main (String[] args){
        //Менеджер игры. Компоновщик для многих элементов
        Game game = new Game();
        //Конфигурация игры - дело тяжёлое. Лучше всего оборачивать это в строитель
        game.configurate(new SimpleConfiguration());
        game.start();
    }
}
