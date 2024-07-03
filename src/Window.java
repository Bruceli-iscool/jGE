import javax.swing.*;

public class Window {
    private final JFrame f;

    public Window() {
        f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public Window(String windowTitle) {
        f = new JFrame(windowTitle);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
    public Window(String windowTitle, int xSize, int ySize) {
        f = new JFrame(windowTitle);
        f.setVisible(true);
        f.setSize(xSize, ySize);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
    public void setSize(int xSize, int ySize) {
        f.setSize(xSize, ySize);
    } 
    public void name(String name) {
        f.setTitle(name);
    } 
    public void addText(Text value) {
        f.add(value.get());
    }
    // getter
    public JFrame getWindow() {
        return f;
    }
}
