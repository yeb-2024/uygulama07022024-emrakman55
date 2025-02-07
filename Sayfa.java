import javax.swing.*;
import java.awt.*;

public class Sayfa {
    JFrame frame = new JFrame("Profil Sayfası");
    JLabel label = new JLabel();
    JLabel label2 = new JLabel();

    public Sayfa()
    {
        label.setText("Emir Akman");
        label.setFont(new Font(null,Font.PLAIN,30));
        label2.setText("yas: 15,meslek: vasıfsız");
        label2.setFont(new Font(null,Font.PLAIN,15));


        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));
        frame.add(label);
        frame.add(label2);
        frame.setVisible(true);


    }
}
