import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.io.*; 
public class OpenFile
{

    public ArrayList<Seat> savedSeats;

    public void stringToSeats(ArrayList<String> fileList)
    {

        savedSeats = new ArrayList<Seat>();
        for(String line : fileList)
        {

            Color color;
            String row = line.substring(0,line.indexOf("/"));
            String seat = line.substring(line.indexOf("/")+1,line.indexOf("*"));
            String x = line.substring(line.indexOf("*")+1,line.indexOf("&"));
            String y = line.substring(line.indexOf("&")+1,line.indexOf("^"));
            String angle  = line.substring(line.indexOf("^")+1,line.indexOf("%"));
            String c = line.substring(line.indexOf("%")+1,line.indexOf(" "));

            int seatInt = Integer.parseInt(seat);
            int xInt =  Integer.parseInt(x);
            int yInt =  Integer.parseInt(y);
            int angInt =  Integer.parseInt(angle);

            if(c.equals("java.awt.Color[r=255,g=0,b=0]")) color = Color.RED;
            else if(c.equals("java.awt.Color[r=255,g=255,b=0]"))color = Color.YELLOW;
            else color = null; 

            savedSeats.add(new Seat(row, seatInt, xInt, yInt, angInt, color));

        }
    
        SeatingChart fresh = new SeatingChart(savedSeats); 
    
}
}

