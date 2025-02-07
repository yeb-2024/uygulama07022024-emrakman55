import javax.swing.*;
import java.awt.*;

public class Sayfa {
    JFrame frame = new JFrame("Profil Sayfası");
    JLabel label = new JLabel();

    public Sayfa()
    {
        label.setText("Emir Akman");
        label.setFont(new Font(null,Font.PLAIN,30));


        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));
        frame.add(label);
        frame.setVisible(true);


    }
}
