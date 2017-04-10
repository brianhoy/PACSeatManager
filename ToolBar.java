import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
public class ToolBar  implements ActionListener 
{
    public JButton left,right,down,up;
    
    private SeatPanel p; 
    public JToolBar tb; 
    public int xShift = 0;
    public int yShift = 0;
    public double scaleFactor = 1.0; 


    public void setUpToolBar(SeatPanel sp)
    {
        this.p = sp;
        tb = new JToolBar(); 
        
        left = new JButton("Left");
        right = new JButton("Right");
        up = new JButton("Up");
        down  = new JButton("Down");
     
      
        tb.add(left); 
        tb.add(up);
        tb.add(down);
        tb.add(right); 
       
        left.addActionListener(this);
        up.addActionListener(this); 
        right.addActionListener(this); 
        down.addActionListener(this); 
       
    }

    @Override
    public void  actionPerformed(ActionEvent e)
    {
         
        
        if(e.getSource().equals(left))
        {
            xShift = -10;
            for(Seat s : p.seats)
                s.updatePolygon(xShift, yShift,scaleFactor);
        }
        if(e.getSource().equals(right))
        { 
            xShift = 10;
            for(Seat s : p.seats)
                s.updatePolygon(xShift, yShift,scaleFactor);
        }
        if(e.getSource().equals(up))
        { 
            yShift = -10;
            for(Seat s : p.seats)
                s.updatePolygon(xShift, yShift,scaleFactor);
        }
        if(e.getSource().equals(down))
        { 
            yShift = 10; 
            for(Seat s : p.seats)
                s.updatePolygon(xShift, yShift,scaleFactor);
        }

        xShift = 0;
        yShift = 0; 

    }

}
