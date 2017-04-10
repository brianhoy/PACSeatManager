import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SeatPanel extends JPanel  
{
    public ArrayList<Seat> seats;

    public ArrayList<String> saveList; 
    public void loadSeats(ArrayList<Seat> seatList )
    {
        seats = seatList;

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        for (Seat s: seats)
        {

            if(s.getColor()== Color.RED)
            {

                g.drawPolygon(s.getPolygon());
                g.setColor(s.getColor());
                g.fillPolygon(s.getPolygon());
                g.setColor(Color.BLACK);    
                g.drawPolygon(s.getPolygon());
                if(s.getSeatName().equals("1"))
                {
                    g.drawString(s.getRowName(), s.getTopLeftX()-15,s.getTopLeftY()+17);
                }
                if(s.getAngle() == 30)
                {
                    g.drawString(s.getSeatName(), s.getTopLeftX()+7,s.getTopLeftY()+10);

                }
                else if(s.getAngle() == 120)
                {
                    g.drawString(s.getSeatName(), s.getTopLeftX()-4,s.getTopLeftY()+19);
                }
                else 
                {
                    g.drawString(s.getSeatName(), s.getTopLeftX()+2,s.getTopLeftY()+15);
                }
            }
            else if (s.getColor()==Color.YELLOW)
            {
                g.drawPolygon(s.getPolygon());
                g.setColor(s.getColor());
                g.fillPolygon(s.getPolygon());
                g.setColor(Color.BLACK);
                g.drawPolygon(s.getPolygon());
                if(s.getSeatName().equals("1"))
                {
                    g.drawString(s.getRowName(), s.getTopLeftX()-15,s.getTopLeftY()+17);
                }
                if(s.getAngle() == 30)
                {
                    g.drawString(s.getSeatName(), s.getTopLeftX()+7,s.getTopLeftY()+10);

                }
                else if(s.getAngle() == 120)
                {
                    g.drawString(s.getSeatName(), s.getTopLeftX()-4,s.getTopLeftY()+19);
                }
                else 
                {
                    g.drawString(s.getSeatName(), s.getTopLeftX()+2,s.getTopLeftY()+15);
                }
            }
            else
            {

                g.drawPolygon(s.getPolygon());
                if(s.getSeatName().equals("1"))
                {
                    g.drawString(s.getRowName(), s.getTopLeftX()-15,s.getTopLeftY()+17);
                }
                if(s.getAngle() == 30)
                {
                    g.drawString(s.getSeatName(), s.getTopLeftX()+7,s.getTopLeftY()+10);

                }
                else if(s.getAngle() == 120)
                {
                    g.drawString(s.getSeatName(), s.getTopLeftX()-4,s.getTopLeftY()+19);
                }
                else 
                {
                    g.drawString(s.getSeatName(), s.getTopLeftX()+2,s.getTopLeftY()+15);
                }
            }

            repaint();

        }

    }

    public String saveData() 
    {
        saveList= new ArrayList<String>(); 
        String color; 

        for(Seat s : seats)
        {
            saveList.add(s.getRowName()+"/"+s.getSeatName()+"*"+s.getTopLeftX()+"&"+s.getTopLeftY()+"^"+s.getAngle()+"%"+s.getColor()+" ");
        }  

        StringBuffer sb = new StringBuffer(); 
        for(String item : saveList)
        { 
            sb.append(item).append("\n");
        }

        String saveSeatsStr = sb.toString(); 

        return saveSeatsStr; 
    }

}

