import java.util.*;
import java.awt.*;
import javax.swing.*;
public class Image 
{
    public void displayImage()
    {
        
         JFrame frame = new JFrame(); 
        frame.setVisible(true); 
        frame.setSize(800,740); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ImageIcon pacSeatingChart = new ImageIcon("PacSeatingChart.jpg");
        JLabel icon = new JLabel(pacSeatingChart);
        icon.setVisible(true);
        frame.add(icon); 
    }
     public static void main(String[] args) 
     {
         Image a = new Image(); 
         a.displayImage();
     }
} 