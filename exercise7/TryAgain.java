import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TryAgain extends JFrame{
    TryAgain(){


        JLabel imageLabel = new JLabel();
        ImageIcon dinosaurImage = new ImageIcon( "dancing-dinosaur.gif");
        imageLabel.setIcon(dinosaurImage);

        JButton start = new JButton();
        start.setText("Start Game");

        this.add(imageLabel);
        this.add(start);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake GAME");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(200,500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.GREEN);
    }

    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            new GameFrame();
            dispose();
        }
    }
    private class ExitHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            dispose();

     
     }
  }
}