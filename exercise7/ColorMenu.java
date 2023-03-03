import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

import java.awt.*;
import java.awt.event.ListSelectionEvent;
import java.awt.event.ListSelectionListener;

public class ColorMenu extends JFrame{

    private String[] colorNameArray = {"GREY","LIGHT GREY","WHITE, BLACK"};
    private Color[] colorListArray = {Color.GRAY, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK};

    JList colorList;

    ColorMenu(){

        JLabel label  = new JLabel();
        label.setText("Choose your color");
        label.setFont(new Font("Arial", Font.BOLD, 25 ));
        this.add(label);

        colorlist = new JList(colorNameArray);
        colorList.setFont(new Font ("Arial", Font.BOLD, 25 ));
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        EventHandler handler = new EventHandler();
        colorList.addListSelectionListener(handler);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake GAME");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,2500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.GREEN);
    }

        private class EventHandler implements ListSelectionListener{
            public void valueChanged(ListSelectionEvent event){
            GamePanel gp = new GamePanel();
            gp.gameBGColor = colorListArray[colorList.getSelectedIndex()];
            new GameFrame();
            dispose();
            }
        }
 }
 

        
        


    

