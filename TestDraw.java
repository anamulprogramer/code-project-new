import javax.swing.JFrame;

public class TestDraw {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Lines");
        DrawPanel panel = new DrawPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
