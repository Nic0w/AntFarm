/**
 * 
 */
package fr.jokercraft.antfarm;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

/**
 * @author Nicolas Broquet
 * @author Romain Clarivet
 *
 */
public class AntFarm extends JPanel implements Environment
 {
  private int scale = 16;
  
  private Dimension dimensions;
  private ArrayList<Agent> agentList;
  private Random generator;
  
  
  public AntFarm() {
   
   generator = new Random(System.currentTimeMillis());
   
   agentList = new ArrayList<Agent>();
   
   dimensions = new Dimension(32, 24);
   
   super.setPreferredSize(new Dimension(dimensions.width*scale, dimensions.height*scale));
   
   reset();
  }
 
  /* (non-Javadoc)
   * @see fr.jokercraft.antfarm.Environment#evolve()
   */
  @Override
  public void evolve()
   {
	for(Agent agent : this.agentList) 
	 agent.doSomething(this);
	
	super.updateUI();

   }

  /* (non-Javadoc)
   * @see fr.jokercraft.antfarm.Environment#getAgent(java.awt.Point)
   */
  @Override
  public Agent getAgent(Point position)
   {
	for(Agent agent : this.agentList)
	 if(!agent.isLifted() && agent.getPosition().equals(position))
	  return agent;
	
	return null;
   }

  /* (non-Javadoc)
   * @see fr.jokercraft.antfarm.Environment#getPointInFronOf(java.awt.Point, fr.jokercraft.antfarm.Heading)
   */
  @Override
  public Point getPointInFronOf(Point position, Heading heading)
   {
	int newX,newY;
	
	switch(heading) {
	 
	 case EAST  : newX = position.x+1 > this.dimensions.width ? position.x-this.dimensions.width : position.x+1;
	 			  newY = position.y; 
	 			  break;
	 			
	 case NORTH : newX = position.x;
				  newY = position.y+1 > this.dimensions.height ? position.y-this.dimensions.height : position.y+1;
				  break;
	  
	 case SOUTH : newX = position.x;
	  			  newY = position.y+1 < 0 ? position.y+this.dimensions.height : position.y-1;
	  			  break;
	 
	 case WEST  : newX = position.x-1 < 0 ? position.x+this.dimensions.width : position.x-1;
	  			  newY = position.y; 
	  			  break;
	  			  
	 	default : /*should never happen, but make the compiler happy*/
	 	 		  newX=0;
	 	 		  newY=0;
	
	}
	
	return new Point(newX, newY);
   }

  /* (non-Javadoc)
   * @see fr.jokercraft.antfarm.Environment#getRandomGenerator()
   */
  @Override
  public Random getRandomGenerator() {
	return this.generator;
   }

  /* (non-Javadoc)
   * @see fr.jokercraft.antfarm.Environment#getScale()
   */
  @Override
  public int getScale() {
	return this.scale;
   }

  /* (non-Javadoc)
   * @see fr.jokercraft.antfarm.Environment#reset()
   */
  @Override
  public void reset() {
	
   	this.agentList.clear();
    super.updateUI();
   }

 }
