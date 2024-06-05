
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Game extends JPanel {

    public ArrayList<Item> inventory = new ArrayList<Item>();
    public int money;
    public int fees;
    public int day;
    public final Biscuit basic = new Biscuit("Basic", "The cheap reliable food of most Biscuitown residents.", 5, 8, 1);

    public Game() {
        inventory.add(basic);
        inventory.add(basic);
    }

    public int getDay() {
        return day;
    }
}
