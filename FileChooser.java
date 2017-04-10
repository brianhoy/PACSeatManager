import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.io.*; 
public class FileChooser
{
    public JFileChooser saveFile,openFile; 
    public SeatPanel p ; 
    public String fileName; 
    public ArrayList<String> fileSeats; 
    public JFrame frame; 
    public FileChooser(SeatPanel p)
    {
        this.p = p;
    }

    public void openFile(JFrame frame )
    {
        this.frame = frame; 

        fileSeats = new ArrayList<String>(); 
        String openFileName = " "; 
        openFile = new JFileChooser(); 
        openFile.setSelectedFile(new File(openFileName));

        int of = openFile.showOpenDialog(openFile);
        BufferedReader reader = null;
        if(of == JFileChooser.APPROVE_OPTION){
            try 
            {
                reader = new BufferedReader(new FileReader(openFile.getSelectedFile()));
                String text = null;

                while ((text = reader.readLine()) != null) {
                    fileSeats.add(text);

                }

            } 
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            } 
            catch (IOException e)
            {
                e.printStackTrace();
            } finally 
            {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {

                }
            }
           
            OpenFile file = new OpenFile();
            file.stringToSeats(fileSeats); 
            frame.setVisible(false); 

        }
        else if(of == JFileChooser.CANCEL_OPTION)
        {
            JOptionPane.showMessageDialog(null, "File cannot be Opened");
        }
    }

    public void saveFile()
    {
        String savedFileName = "";
        String data = p.saveData();
        saveFile = new JFileChooser();
        saveFile.setSelectedFile(new File(savedFileName));

        int sf = saveFile.showSaveDialog(saveFile);
        savedFileName = savedFileName + ".txt";

        if(sf == JFileChooser.APPROVE_OPTION){
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(saveFile.getSelectedFile()));
                writer.write(data);
                writer.close();
                //JOptionPane.showMessageDialog(null, "File has been saved","File Saved",JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException me) {
                me.printStackTrace();
            }
        }else if(sf == JFileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null, "File save has been canceled");
        }
    }
}
