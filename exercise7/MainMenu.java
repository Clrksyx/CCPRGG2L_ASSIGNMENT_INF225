import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MainMenu extends JFrame{
    MainMenu(){


        JLabel imageLabel = new JLabel();
        ImageIcon dinosaurImage = new ImageIcon( "dancing-dinosaur.gif");
        imageLabel.setIcon(dinosaurImage);

        JButton start = new JButton();
        start.setText("Start Game");

        EventHandler handler = new EventHandler();
        start.addActionListener(handler);

        this.add(imageLabel);
        this.add(start);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake GAME");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,2500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.GREEN);
    }

    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            new ColorMenu();
            dispose();
        }
    }
}
