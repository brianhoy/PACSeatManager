import java.util.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
import javax.swing.*;

public class GraphicalSeat extends MouseAdapter 
{
    private static int WIDTH = 17;
    private static int LENGTH = 22;
    private int[] xs, ys; 
    private Polygon poly;
    private String rowName;
    private String seatName;
    public boolean clicked;
    public Color color;
    public int angle;
    private String savedName;
    private Color savedColor;

    public Seat(String row, int seat, int topLeftX, int topLeftY,int a,Color c)
    {
        xs = new int[4];
        ys = new int[4]; 
        int xShift = 0;
        int yShift = 0; 
        double scaleFactor = 1.0; 
        angle = a; 
        color = c; 
        if ( angle == 30 )
        {

            xs[0] = topLeftX; 
            xs[1] = topLeftX+WIDTH-2; 
            xs[2]=  topLeftX+WIDTH+9; 
            xs[3] = topLeftX+11;
            ys[0] = topLeftY; 
            ys[1] = (topLeftY-9); 
            ys[2] = topLeftY+LENGTH-12;
            ys[3] = topLeftY+LENGTH-3;

        }
        else if (angle == 120)
        {
            xs[0] = topLeftX; 
            xs[1] = topLeftX+WIDTH-2; 
            xs[2] =  topLeftX+WIDTH-13;
            xs[3] = topLeftX-11;
            ys[0] = topLeftY; 
            ys[1] = topLeftY+9; 
            ys[2] = topLeftY+LENGTH+6;
            ys[3] = topLeftY+LENGTH-3;

        }
        else 
        {
            xs[0] = topLeftX; 
            xs[1] = topLeftX+WIDTH; 
            xs[2] =  topLeftX+WIDTH;
            xs[3] = topLeftX;
            ys[0] = topLeftY; 
            ys[1] = topLeftY; 
            ys[2] = topLeftY+LENGTH;
            ys[3] = topLeftY+LENGTH;

        }

        rowName = row;
        seatName = ""+seat; 
        updatePolygon(xShift,yShift,scaleFactor);
    }

    public void updatePolygon(int xShift, int yShift,double scaleFactor)
    {

        xs[0]  = (int)((xs[0]+  xShift)*scaleFactor);  
        xs[1]  = (int)((xs[1]+  xShift)*scaleFactor);
        xs[2]  = (int)((xs[2]+  xShift)*scaleFactor);
        xs[3]  = (int)((xs[3]+  xShift)*scaleFactor); 
        ys[0]  = (int)((ys[0]+  yShift)*scaleFactor);    
        ys[1]  = (int)((ys[1]+  yShift)*scaleFactor);
        ys[2]  = (int)((ys[2]+  yShift)*scaleFactor); 
        ys[3]  = (int)((ys[3]+  yShift)*scaleFactor); 

        poly = new Polygon(xs,ys,4);

    }

    public Polygon getPolygon()
    {  
        return poly;
    }

    public String getRowName()
    {
        return rowName; 
    }

    public String getSeatName()
    {
        return seatName ; 
    }

    public Color getColor()
    {
        return color; 
    }

    public int getTopLeftX()
    {
        return xs[0]; 
    }

    public int getTopLeftY()
    {
        return ys[0]; 
    }

    public int[] getX()
    {
        return xs;
    }

    public int[] getY()
    {
        return ys;
    }

    public int getAngle()
    {
        return angle; 
    }

    @Override
    public void mouseClicked(MouseEvent me) 
    {
        if(poly.contains(me.getPoint())&&clicked) 
        {
            color = null;
            clicked = false;
            if( me.getClickCount() == 2)
            {
                color = color.YELLOW;
            }
        }
        else if (poly.contains(me.getPoint()))
        {
            color = Color.RED;
            clicked = true;
            if( me.getClickCount() == 2)
            {
                color = color.YELLOW;
            }
        }

    }        
}

