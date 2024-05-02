import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
public class hoc_java_swing {
    public static void main(String[] args){
        // Frame
        /*
        // JFrame = a GUI window to add component to
        JFrame frame = new JFrame(); // create a frame
        frame.setTitle("Hello Word"); // set title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of frame
        // DO_NOTHING_ON_CLOSE: khong the tat chuong trinh
        frame.setResizable(false); // prevent frame from being resized
        frame.setSize(420,420); // set the x - dimesion and y - dimension of frame
        frame.setVisible(true); // make frame visiable

        //change logo for Frame
        //remember to create javax.swing.ImageIcon;
        ImageIcon image = new ImageIcon("_MG_8398.JPG"); 
        frame.setIconImage(image.getImage());

        //change background color
        frame.getContentPane().setBackground(new Color(250,220,59)); // change color of background
        // frame.getContentPane().setBackground(Color.green); some basic color available;
        */
        //new MyFrame();


        //LABEL - nhan
        /*
        //JLabel = a GUI display area for a string of text, an image, or both
        ImageIcon image = new ImageIcon("computer.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3, false);

        JLabel label = new JLabel();
        label.setText("Duma chat qua o oi"); // set text of label
        label.setIcon(image); // set picture background;
        label.setHorizontalTextPosition(JLabel.CENTER); // SET TEXT LEFT, RIGHTM CENTER of imageicon;
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of imageicon
        label.setForeground(new Color(50, 250, 50)); // set font color of text
        label.setFont(new Font("Hihi", Font.PLAIN, 20)); // set font of text
        label.setIconTextGap(-25); // set gap(khoang cách) of text to image
        label.setBackground(Color.black);
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of text + icon to background
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of text + icon to background
        //label.setBounds(0,  0, 700, 700); // set x, y, position within frame as well as dimemsions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(800,800);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    */

    /* 
        //PANELS - bang
        // JPanel = a GUI component that fuctions as a container to hold other components
        ImageIcon icon = new ImageIcon("Hoc.png");


        JLabel label = new JLabel();
        label.setText("Heluuuu");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250); 

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(new BorderLayout());
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    */

    // JButton = a button that performs an action a click button
    //new MyFrame();



    // Layout Manager = Defines the natural layout for components within a container
    // 3 common managers
    // BorderLayout = A borderlayout places components in five areas: North, South, West, East, Center
    //                All extra space is placed in the center area
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        
        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.BLUE);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.pink);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        // u also add panel in another panel
        // panel5.setLayout(new BorderLayout());
        // panel5.add(panel6, BorderLayout.East);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.setLayout(new BorderLayout(10,10)); // ot(new BorderLayout()) -> k co gap
        frame.setVisible(true);
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.WEST);
        frame.add(panel4,BorderLayout.EAST);
        frame.add(panel5, BorderLayout.CENTER);
        


    }
}
