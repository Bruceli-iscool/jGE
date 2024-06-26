import javax.swing.*;

public class Text {
    private final JLabel t;
    public Text(String text) {
        t = new JLabel(text);
    }
    public Text(String text, int xLocation, int yLocation) {
        t = new JLabel(text);
        t.setHorizontalAlignment(xLocation);
        t.setVerticalAlignment(yLocation);
    }
    public void setLocation(int xLocation, int yLocation) {
        t.setHorizontalAlignment(xLocation);
        t.setVerticalAlignment(yLocation);
    }
    public JLabel get() {
        return t;
    }
}
