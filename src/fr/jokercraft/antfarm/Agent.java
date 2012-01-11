/**
 * 
 */
package fr.jokercraft.antfarm;

import java.awt.Graphics;
import java.awt.Point;

/**
 * @author Nicolas Broquet
 * @author Romain Clarivet
 *
 */
public interface Agent
 {
  public void doSomething(Environment environment);
  public void drawIt(Graphics g, int scale);
  public String getName();
  public Point getPosition();
  public boolean isLiftable();
  public boolean isLifted();
  public void setLifter(Agent lifter);
  public void dropped();
  public void setPosition(Point position);
 }
