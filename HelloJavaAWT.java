import java.awt.*;

public class HelloJavaAWT {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("Hello Java Example");

        // Create a label with text
        Label label = new Label("Hello Java", Label.CENTER);

        // Set font to Georgia, size 24, bold
        Font font = new Font("Georgia", Font.BOLD, 24);
        label.setFont(font);

        // Set foreground (text) color to Red
        label.setForeground(Color.RED);

        // Set background color to Blue
        label.setBackground(Color.BLUE);

        // Add label to frame
        frame.add(label);

        // Set frame size
        frame.setSize(400, 200);

        // Make frame visible
        frame.setVisible(true);

        // Add window listener to close the frame properly
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                frame.dispose();
            }
        });
    }
}

