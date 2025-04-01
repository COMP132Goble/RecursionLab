package recursion;

import javax.swing.JFrame;

public class SierpinskiGUI extends JFrame {
    public SierpinskiGUI() {
        super("Sierpinski Triangle");

        SierpinskiPanel sp = new SierpinskiPanel(6);
        this.add(sp);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main(String[] args) {
        SierpinskiGUI sg = new SierpinskiGUI();
        sg.setVisible(true);
    }
}
