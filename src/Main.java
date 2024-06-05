import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        MainFrame frame = new MainFrame("Biscuit Farm 2");
        ImageIcon img = new ImageIcon("images/NO WAY.png");
        frame.setIconImage(img.getImage());
    }
}

/*
MAIN SCREENS ---------------------------------------------------
1200x800
INCLUDES :
    OVERWORLD
    TITLE SCREEN
    CREDITS
SHOP -----------------------------------------------------------
SCREEN IS 1200x800 TOTAL
BACKGROUNDS ARE 800x500 , FROM THE TOP (CREATE AT 0,0)
SIDEBAR THING IS 400x800 , FROM THE RIGHT SIDE (CREATE AT 800,0)
DIALOGUE BOX IS 800x300 , FROM THE BOTTOM (CREATE AT 0,500)
INCLUDES:
    BISCUIT BOY SHOP
    PAWN SHOP
    ITEMS SHOP
    SECRET SHOP
PLOTS -----------------------------------------------------------
6 X 5 GRID
*/