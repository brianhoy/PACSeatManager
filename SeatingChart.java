import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class SeatingChart 
{
    public static  ArrayList<Seat>sList; 
    public SeatPanel p = new SeatPanel();

    public SeatingChart(ArrayList<Seat> savedList) 
    {
        sList = savedList;
      
        Components();  
    }

    public  SeatingChart() 
    {
        sList = new ArrayList<Seat>();
        Components();  
    }

    public void Components() {
        JFrame mainMap =new JFrame();
        mainMap.setLayout(new BorderLayout()); 

        JScrollPane scroll = new JScrollPane(p,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        MenuBar mBar  = new MenuBar(); 
        mBar.setUpMenuBar(mainMap,p);
      

        ToolBar tBar = new ToolBar();
        tBar.setUpToolBar(p); 

        SeatList list = new SeatList(p); 
        list.inputSeats(sList);

        p.setPreferredSize(new Dimension(1400,1000));

        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        mainMap.add(mBar.menuBar,BorderLayout.NORTH); 
        mainMap.add(scroll,BorderLayout.CENTER);
        mBar.menuBar.add(tBar.tb); 

        mainMap.pack();
        mainMap.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new SeatingChart();

                }
            });
    }
}

