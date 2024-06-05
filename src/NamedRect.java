
import java.awt.*;
public class NamedRect extends Rectangle{
    private String name;

    public boolean clickable;

    public NamedRect(String n, int x, int y, int width, int height) {
        super(x,y,width,height);
        name = n;
        clickable = true;
    }

    public String getName() {
        return name;
    }

    public boolean isClickable() { return clickable; }

    public void setClickable(boolean c) {
        clickable = c;
    }

}
