import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class ShowDate extends JFrame implements ActionListener {
    JLabel dataLabel;

    public ShowDate() {

        setSize(300, 300);
        setTitle("Show Date");
        JButton button = new JButton("Show");
        setLayout(null);
        button.setBounds(20, 20, 80, 30);
        add(button);
        button.addActionListener(this);
        dataLabel = new JLabel("Date: ");
        dataLabel.setBounds(50, 50, 200, 40);
        add(dataLabel);
    }

    public static void main(String[] args) {
        ShowDate oki = new ShowDate();
        oki.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        oki.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(new Date());
        dataLabel.setText(new Date().toString());

    }
}
