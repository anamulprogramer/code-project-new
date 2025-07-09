// Fig. 7.26: DrawRainbowTest.java
// Creating a JFrame to display a DrawRainbow.

import javax.swing.JFrame;

public class DrawRainbowTest {
    public static void main(String[] args) {
        DrawRainbow panel = new DrawRainbow();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 250); // width=400, height=250
        application.setVisible(true);
    }
}
