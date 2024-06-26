import javax.swing.*;


public class Window {
    private final JFrame f;

    public Window() {
        f = new JFrame();
        f.setVisible(true);
    }
    public Window(String windowTitle) {
        f = new JFrame(windowTitle);
        f.setVisible(true);
    } 
    public Window(String windowTitle, int xSize, int ySize) {
        f = new JFrame(windowTitle);
        f.setVisible(true);
        f.setSize(xSize, ySize);
    } 
    public void setSize(int xSize, int ySize) {
        f.setSize(xSize, ySize);
    } 
    public void name(String name) {
        f.setTitle(name);
    } 
    public void addText(String text, int xPosition, int yPosition) {
        JLabel n = new JLabel(text);
        n.setHorizontalAlignment(xPosition);
        n.setVerticalAlignment(yPosition);
        f.add(n);
        f.repaint();
    }
    public JFrame getWindow() {
        return f;
    }
}