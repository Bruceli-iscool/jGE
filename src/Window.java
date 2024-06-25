import javax.swing.*;
import java.awt.event.*;


public class Window {
    protected JFrame f;
    public Window(String windowTitle, int xSize, int ySize) {
        f = new JFrame(windowTitle);
        f.setVisible(true);
        f.setSize(xSize, ySize);
    }
}