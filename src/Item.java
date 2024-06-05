
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Item {
    int cost;
    String name;
    BufferedImage image;
    String description;

    public Item(String name, int cost, String description) {
        this.name = name;
        this.cost = cost;
        this.description = description;
        try {
           image = ImageIO.read(new File("images/smalls/Coin.png")); // PLACEHOLDER FOR NOW
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public BufferedImage getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }


}
