import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    private MyLine[] lines; // array of lines

    public DrawPanel() {
        setBackground(Color.WHITE);

        Random random = new Random();
        lines = new MyLine[5 + random.nextInt(5)]; // 5-9 রেখা

        for (int i = 0; i < lines.length; i++) {
            int x1 = random.nextInt(300);
            int y1 = random.nextInt(300);
            int x2 = random.nextInt(300);
            int y2 = random.nextInt(300);
            Color color = new Color(random.nextInt(256),
                                    random.nextInt(256),
                                    random.nextInt(256));

            lines[i] = new MyLine(x1, y1, x2, y2, color);
        }
    }

    // draw all the lines
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (MyLine line : lines) {
            line.draw(g);
        }
    }
}
