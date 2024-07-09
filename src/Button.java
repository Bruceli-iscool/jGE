import javax.swing.*;

public class Button {
    private final JButton b;
    public Button(String text) {
        b = new JButton(text);
    }
    public Button(String text, int Xsize, int Ysize) {
        b = new JButton(text);
        b.setSize(Xsize, Ysize);
    }
    public void setSize(int Xsize, int Ysize) {
        b.setSize(Xsize, Ysize);
    }
    public boolean isPressed() {
        return false;
    }
}

 