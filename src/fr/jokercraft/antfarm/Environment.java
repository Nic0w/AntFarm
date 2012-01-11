package fr.jokercraft.antfarm;

import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

/**
 * @author Nicolas Broquet
 * @author Romain Clarivet
 *
 */
public interface Environment
 {
  public void evolve();
  public Agent getAgent(Point position);
  public Point getPointInFronOf(Point position, Heading heading);
  public Random getRandomGenerator();
  public int getScale();
  public void paint(Graphics g);
  public void reset();
 }
