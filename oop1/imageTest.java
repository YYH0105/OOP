import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Toolkit;

class ShowImage extends JPanel {
    
    Toolkit tk = Toolkit.getDefaultToolkit();
    Image img = tk.getImage("C:\\Users\\kevin\\OneDrive\\桌面\\java\\java上課\\week17\\src\\封面.jpg");

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.drawImage(img, 0, 0, null, null);
    }
}

public class imageTest {
    public static void main(String args[]) {

        JFrame myFrame = new JFrame();
        myFrame.getContentPane().add(new ShowImage());
        myFrame.setSize(640, 480);
        myFrame.setVisible(true);
    }
}
