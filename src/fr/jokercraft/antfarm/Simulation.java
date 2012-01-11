/**
 * 
 */
package fr.jokercraft.antfarm;

import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * @author Nicolas Broquet
 * @author Romain Clarivet
 *
 */
public class Simulation
 {
  private JFrame window;
  
  public Simulation() {
   //Allocating a new JFrame to be the main window
   window = new JFrame("AntFarm");
   //Default configuration of the window
   window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   window.setMinimumSize(new Dimension(320,240));
   //Resizing the windows considering the new elements
   window.pack();
   //Showing the windows
   window.setVisible(true);
 
  }
  
  /**
   * @param args
   */
  public static void main(String[] args)
   {
	Simulation antFarm = new Simulation();

   }
  
  public void run() {
   
  }

 }
