import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class App2 extends JFrame implements ActionListener{

    public static void main(String[] args) throws Exception {
        App2 app2 = new App2();
    }
    public App2() {
        setTitle("Button test");
        JButton myButton = new JButton("click me");
        myButton.addActionListener(this);
        getContentPane().add(myButton);
        JTextField myTextField = new JTextField("這裡會顯示文字");
        getContentPane().add(myTextField);
        setLayout(new FlowLayout());
        setBounds(500, 250, 400, 400);
        setVisible(true);
    }
    
    public void actionPerformed(ActionListener e) {
        System.out.println()        
    }
}

