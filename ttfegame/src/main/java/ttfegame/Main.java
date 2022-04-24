
package ttfegame;


import java.util.Arrays;
import ttfegame.logical.SaveManager;
import javax.swing.JFrame;

public class Main {
    public static void main (String[] args){
        GameManager gm = new GameManager(null,5);
        Arrays.stream(gm.currentField).map(Arrays::toString).forEach(System.out::println);
        System.out.println();
        gm.newRound();
        Arrays.stream(gm.currentField).map(Arrays::toString).forEach(System.out::println);
        System.out.println();
        gm.newRound();
        Arrays.stream(gm.currentField).map(Arrays::toString).forEach(System.out::println);
        System.out.println();
        gm.newRound();
        Arrays.stream(gm.currentField).map(Arrays::toString).forEach(System.out::println);
        System.out.println();
        gm.newRound();
        Arrays.stream(gm.currentField).map(Arrays::toString).forEach(System.out::println);
    }
}
