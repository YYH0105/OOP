import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class App extends JFrame {

        /* 
        //原本在main class
        JFrame myFrame = new JFrame("Hello Windows!");
        JButton myButton = new JButton("click me");
        JTextField myText = new JTextField("Input text");
        // JLabel myLabel1 = new JLabel("enter text");
        // JLabel myLabel2 = new JLabel("          ");

        myFrame.getContentPane().setLayout(new FlowLayout());
        //myFrame.getContentPane().setLayout(new GridLayout(3, 3, 20, 50));
        // myFrame.getContentPane().add(myLabel1);
        // myFrame.getContentPane().add(myLabel2);
        myFrame.getContentPane().add(myButton);
        myFrame.getContentPane().add(myText);
        //borderLayout.方位

        myFrame.setBounds(500, 250, 400, 400);
        //myFrame.setSize(400, 400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        */
    
    public static void main(String[] args) throws Exception {
        App app1 = new App2();
    }
    public App() {
        setTitle("Button test");
        JButton myButton = new JButton("click me");
        myButton.addActionListener(new SimpleActionListener());
        getContentPane().add(myButton);
        JTextField myTextField = new JTextField("這裡會顯示文字");
        myTextField.
        getContentPane().add(myTextField);
        setLayout(new FlowLayout());
        setBounds(500, 250, 400, 400);
        setVisible(true);
    }
    class SimpleListener implements ActionListener {
        public void actionPerformed(ActionListener e) {
            setTitle("按了");

        }
    }
}

