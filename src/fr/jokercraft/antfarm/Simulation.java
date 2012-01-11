/**
 * 
 */
package fr.jokercraft.antfarm;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * @author Nicolas Broquet
 * @author Romain Clarivet
 *
 */
public class Simulation extends JFrame implements Runnable
 {
  private final JPanel simulationPane;
  
  private final Thread simulationThread;
  
  public Simulation(String windowTitle, Dimension dimensions, JPanel panel) {
	  
	  super.setTitle(windowTitle);
	  super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  super.setSize(dimensions);
	  
	  this.simulationPane = panel;
	  this.simulationThread = new Thread(this);
	  
	  super.add(this.simulationPane);
	  
	  super.pack();
  }
   
  
  public void start() {
	  
	  super.pack();
	  super.setVisible(true);
	  
	  this.simulationThread.start();
	  
  }
  
  /**
   * @param args
   */
  public static void main(String[] args)
   {
	AntFarm simulation = new AntFarm();
	  
	Simulation antFarm = new Simulation("AntFarm", new Dimension(320, 240), simulation);
	
	antFarm.start();
   }
  
  public void run() {
   
	  boolean isRunning = true;
	  
	  while(isRunning) {
		  
		  try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
			isRunning = false;
		}
		  
	  }
	  
  }

 }
