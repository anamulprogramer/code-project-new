// Fig 9.13: LabelDemo.java
// Demonstrates the use of labels with text and images.

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo {
    public static void main(String[] args) {
        // Create a label with plain text
        JLabel northLabel = new JLabel("North");

        // Create an icon from an image file (image must be in the project folder)
        ImageIcon labelIcon = new ImageIcon("GUItip.gif");

        // Create a label with an Icon (center image only)
        JLabel centerLabel = new JLabel(labelIcon);

        // Create another label with an icon and also set text (south image + text)
        JLabel southLabel = new JLabel(labelIcon);
        southLabel.setText("South");

        // Create a frame to hold the labels
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the labels to the frame in BorderLayout positions
        application.add(northLabel, BorderLayout.NORTH);
        application.add(centerLabel, BorderLayout.CENTER);
        application.add(southLabel, BorderLayout.SOUTH);

        // Set size and display the frame
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
