import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnaSayfa implements ActionListener {
    JFrame frame = new JFrame("Ana Sayfa");
    JButton button = new JButton("Profili goster");

    public AnaSayfa()
    {
        button.addActionListener(this);
        button.setBounds(150,200,200,50);
        frame.add(button);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
            frame.dispose();
            Sayfa sayfa = new Sayfa();
        }
    }
}
