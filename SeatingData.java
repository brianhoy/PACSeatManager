import java.io.*;
import java.util.Hashtable;

/**
 * Data structure for storing seats
 * Also comes with methods for reading and writing to files
 * @author Brian Hoy 
 * @version 3/1/17
 */
public class SeatingData
{
    private Hashtable<String, Seat> seatList;
    
    /**
     * Initializes seatList with empty chairs
     */
    public SeatingData()
    {


        

        /*for(int i = 1; i <= 44; i++)
        {
            sList.add(new Seat("M",i ,75+(i*25),20,0,color));
            sList.add(new Seat("J",i ,75+(i*25),110,0,color));
            sList.add(new Seat("F",i ,75+(i*25),200,0,color));
            sList.add(new Seat("C",i ,75+(i*25),290,0,color));
        }
        for(int i = 1 ; i <= 40; i++)
        {
            sList.add(new Seat("L",i ,125+(i*25),50,0,color));
            sList.add(new Seat("K",i ,125+(i*25),80,0,color));
            sList.add(new Seat("H",i ,125+(i*25),140,0,color));
            sList.add(new Seat("G",i ,125+(i*25),170,0,color));
            sList.add(new Seat("E",i ,125+(i*25),230,0,color));
            sList.add(new Seat("D",i ,125+(i*25),260,0,color));
            sList.add(new Seat("B",i ,125+(i*25),320,0,color));
            sList.add(new Seat("A",i ,125+(i*25),350,0,color));
        }
        //MM
        for(int i = 6; i >=1;i--)
        {
            sList.add(new Seat("MM",i ,(100+i*25)+2,519-(i*14) ,30,color));//(267,426)
        }
        for(int i = 7; i <=12; i++)
        {
            sList.add(new Seat("MM",i ,850+(i*25), 328+(i*14) ,120,color));
        }
        //LL
        for( int i =13; i>=1;i--)
        {
            sList.add(new Seat("LL",i ,(50+i*25)-1-5,572-(i*14)+12+5 ,30,color));
            // original  = 0 degrees seats 
            //x =  subtract one (-1) to the original
            //y = make it equal to orginal and add 12; For example 572-(13*14) = 390 +12 = 402 
        }
        for(int i = 14; i<=33; i++)
        {
            sList.add(new Seat("LL",i,(50+i*25),390,0,color));
        }
        for(int i = 34; i<=46; i++)
        {
            sList.add(new Seat("LL",i,(50+i*25)+3+5,(i*14)-86 + 3 +5,120,color));
            //x = add 3 to the original 
            //y = make it equal to original and add 3; For example (34*14) - 76 = 400 + 3 = 403
        }
        //KK     
        for(int i = 11; i>=1;i--)
        {
            sList.add(new Seat("KK",i,(125+i*25)-1-5, 586-(i*14),30,color));
        }
        for(int i = 12; i<=29; i++)
        {
            sList.add(new Seat("KK",i, (125+i*25),420,0,color));
        }
        for(int i = 30; i<=40; i++)
        {
            sList.add(new Seat("KK",i, (125+i*25)+3+5,(i*14)+3  ,120,color));
        }
        //JJ
        for(int i = 12; i>=1;i--)
        {
            sList.add(new Seat("JJ",i,(112+i*25)-1-5,630-(i*14),30,color));
        }
        for(int i = 13; i<=29; i++)
        {
            sList.add(new Seat("JJ",i, (112+i*25),450,0,color));
        }
        for(int i = 30; i<=41; i++)
        {
            sList.add(new Seat("JJ",i,(112+i*25)+3+5,(i*14)+33,120,color));
        }
        //HH
        for(int i = 15; i>=1;i--)
        {
            sList.add(new Seat("HH",i,(50+i*25)-1-5,702-(i*14),30,color));
        }
        for(int i = 16; i<=31; i++)
        {
            sList.add(new Seat("HH",i,(50+i*25),480,0,color));
        }
        for(int i = 32; i<=46; i++)
        {
            sList.add(new Seat("HH",i, (50+i*25)+3+5,(i*14)+35,120,color));
        }
        //GG
        for( int i =13; i>=1;i--)
        {
            sList.add(new Seat("GG",i ,(112+i*25)-1-5,704-(i*14),30,color));
        }
        for(int i = 14; i<=28; i++)
        {
            sList.add(new Seat("GG",i, (112+i*25),510,0,color));
        }
        for(int i = 29; i<=41; i++)
        {
            sList.add(new Seat("GG",i, (112+i*25)+3+5,(i*14)+107,120,color));
        }
        //FF
        for(int i = 14; i>=1;i--)
        {
            sList.add(new Seat("FF",i,(100+i*25)-1-5,748-(i*14),30,color));
        } 
        for(int i = 15; i<=28; i++)
        {
            sList.add(new Seat("FF",i, (100+i*25),540,0,color));
        }
        for(int i = 29; i<=42; i++)
        {
            sList.add(new Seat("FF",i,(100+i*25)+3+5 ,(i*14)+137,120,color));
        }
        //EE
        for(int i = 17; i>=1;i--)
        {
            sList.add(new Seat("EE",i,(38+i*25)-1-5,820-(i*14),30,color));
        }
        for(int i = 18; i<=30; i++)
        {
            sList.add(new Seat("EE",i, (38+i*25),570,0,color));
        }
        for(int i =31; i<=47;i++)
        {
            sList.add(new Seat("EE",i,(38+i*25)+3+5,(i*14)+139,120,color));
        }
        //DD
        for(int i = 15; i>=1;i--)
        {
            sList.add(new Seat("DD",i,(100+i*25)-1-5,822-(i*14),30,color));
        } 
        for(int i = 16; i<=27; i++)
        {
            sList.add(new Seat("DD",i, (100+i*25),600,0,color));
        }
        for(int i =28; i<=42;i++)
        {
            sList.add(new Seat("DD",i,(100+i*25)+3+5,(i*14)+211,120,color));
        }
        //CC
        for(int i = 16; i>=1;i--)
        {
            sList.add(new Seat("CC",i,(87+i*25)-1-5,866-(i*14),30,color));
        } 
        for(int i = 17; i<=27; i++)
        {
            sList.add(new Seat("CC",i, (87+i*25),630,0,color));
        }
        for(int i =28; i<=43;i++)
        {
            sList.add(new Seat("CC",i,(87+i*25)+3+5,(i*14)+241,120,color));
        }
        //BB
        for(int i = 15; i>=1;i--)
        {
            sList.add(new Seat("BB",i,(137+i*25)-1-5,882-(i*14),30,color));
        } 
        for(int i = 16; i<=24; i++)
        {
            sList.add(new Seat("BB",i, (137+i*25),660,0,color));
        }
        for(int i =25; i<=39;i++)
        {
            sList.add(new Seat("BB",i,(137+i*25)+3+5,(i*14)+313,120,color));
        }
        //AA
        for(int i = 14; i>=1;i--)
        {
            sList.add(new Seat("AA",i,(175+i*25)-1-5,898-(i*14),30,color));
        }
        for(int i = 15; i<=22; i++)
        {
            sList.add(new Seat("AA",i, (175+i*25),690,0,color));
        }
        for(int i =23; i<=36;i++)
        {
            sList.add(new Seat("AA",i,(175+i*25)+3+5,(i*14)+371,120,color));
        }        */
    }

    private void initializeEmpty() {
        this.seatList = new Hashtable();
        
        // Add empty seats for upper deck
        char currentChar = 'A';
        for(int row = 1; row <= 'M' - 'A'; row++) {
            int numSeatsInRow = 40;
            if(row % 3 == 0) {
                numSeatsInRow += 4;
            }
            Seat newSeat = new Seat();
            SeatPosition seatPosition = new SeatPosition(new String(currentChar) + i);
            newSeat.setPosition(seatPosition);
            addSeat(newSeat);
            
            currentChar += 1;
        }
        
        // Add empty seats for lower deck left side
        
        // starts from AA. index of array always represents the row at 'AA' + index
        List<int> numSeatsFirstThird = new ArrayList<int>(Arrays.asList(
            14, 15, 16, 15, 17, 14, 13, 15, 12, 11, 13, 6));
        List<int> numSeatsSecondThird = new ArrayList<int>(Arrays.asList(
            ));
        
    }
    
    public void addSeat(Seat seat) {
        seatList.put(seat.getPosition(), seat);
    }
    
    /**
     * Loads seating data from a file into memory
     * 
     * @param  filePath   The path of the file to be loaded.
     */
    public void loadFromFile(String filePath)
    {
        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath));        
            savedSeats = new ArrayList<Seat>();
            while(line = in .readLine()) != null)
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
            in.close();
            seatList = savedSeats;
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Saves seating data to hard drive
     * 
     * @param  filePath   The path of the file to be loaded.
     */
    public void saveToFile(String filePath) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(data);
            writer.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        
    }
}
