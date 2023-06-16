import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

class SimpleShape extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        //g2.setPaint(Color.GREEN);
        g2.setPaint(new Color(203, 169, 214));
        g2.draw(new Line2D.Double(100, 100, 600, 400));

        g2.fill(new Rectangle(200, 200, 200, 200));
        g2.setPaint(Color.black);
        g2.draw(new Rectangle(200, 200, 200, 200));

        g2.setPaint(new GradientPaint(5, 5, Color.RED, 200, 200, Color.BLUE));
        g2.fill(new Ellipse2D.Float(5, 5, 200, 200));
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        JFrame myFrame = new JFrame("畫圖");
        myFrame.getContentPane().add(new SimpleShape());
        myFrame.setSize(640,480);
        myFrame.setVisible(true);
    }
}
