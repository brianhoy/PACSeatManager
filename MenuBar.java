import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.io.*; 
public class MenuBar implements ActionListener
{
    public JMenuBar menuBar; 
    public JFrame frame; 
    public JMenuItem newAction, openAction,saveAction,exitAction;
    public  JMenu fileMenu; 
    public FileChooser fc; 

    public SeatPanel p ; 

    public void setUpMenuBar(JFrame frame,SeatPanel p )
    {

        this.p = p; 
        this.frame = frame; 
        fc = new FileChooser(p); 

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");

        menuBar.add(fileMenu);

        newAction = new JMenuItem("New");
        openAction = new JMenuItem("Open");
        saveAction = new JMenuItem("Save");  

        exitAction = new JMenuItem("Exit");

        fileMenu.add(newAction);
        fileMenu.add(openAction);

        fileMenu.add(saveAction);

        fileMenu.addSeparator();
        fileMenu.add(exitAction);

        newAction.addActionListener(this);
        openAction.addActionListener(this); 
        saveAction.addActionListener(this); 

        exitAction.addActionListener(this);
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                    int g =  JOptionPane.showConfirmDialog(null, "Would you like to save?", "SAVE FILE", JOptionPane.YES_NO_OPTION);
                    if (g == JOptionPane.NO_OPTION) {
                        System.exit(0);
                    } else if (g == JOptionPane.YES_OPTION) {

                        fc.saveFile(); 
                    }
                }
            });
    }

    @Override
    public void  actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(newAction))
        {
            frame.setVisible(false); 
            SeatingChart  s = new SeatingChart();

        }
        if(e.getSource().equals(openAction))
        {
            fc.openFile(frame); 

        }
        if(e.getSource().equals(saveAction))
        {
            fc.saveFile(); 
        }

        if(e.getSource().equals(exitAction))
        {
            int g =  JOptionPane.showConfirmDialog(null, "Would you like to save?", "SAVE FILE", JOptionPane.YES_NO_OPTION);
            if (g == JOptionPane.NO_OPTION) {
                System.exit(0);
            } else if (g == JOptionPane.YES_OPTION) {

                fc.saveFile(); 
            }

        }

    }
}