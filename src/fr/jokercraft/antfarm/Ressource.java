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
public class Ressource implements Agent {
	
	private final RessourceType type;
	
	private Point position;
	private Agent lifter;
	
	public Ressource(Point position, RessourceType type) {
		this.position = position;
		this.type = type;
		
		this.lifter = null;
	}

	/* (non-Javadoc)
	 * @see fr.jokercraft.antfarm.Agent#doSomething(fr.jokercraft.antfarm.Environment)
	 */
	@Override
	public void doSomething(Environment environment) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see fr.jokercraft.antfarm.Agent#drawIt(java.awt.Graphics, int)
	 */
	@Override
	public void drawIt(Graphics g, int scale) {
		
		int circleDiameter = (scale-2)/2;
		
		g.setColor(this.type.getColor());
		g.fillOval(this.position.x, this.position.y, circleDiameter, circleDiameter);

	}

	/* (non-Javadoc)
	 * @see fr.jokercraft.antfarm.Agent#getName()
	 */
	@Override
	public String getName() {
		return this.type.getName();
	}

	/* (non-Javadoc)
	 * @see fr.jokercraft.antfarm.Agent#getPosition()
	 */
	@Override
	public Point getPosition() {
		return this.position;
	}

	/* (non-Javadoc)
	 * @see fr.jokercraft.antfarm.Agent#isLiftable()
	 */
	@Override
	public boolean isLiftable() {
		return false;
	}

	/* (non-Javadoc)
	 * @see fr.jokercraft.antfarm.Agent#isLifted()
	 */
	@Override
	public boolean isLifted() {
		return this.lifter != null;
	}

	/* (non-Javadoc)
	 * @see fr.jokercraft.antfarm.Agent#setLifter(fr.jokercraft.antfarm.Agent)
	 */
	@Override
	public void setLifter(Agent lifter) {
		this.lifter = lifter;
	}

	/* (non-Javadoc)
	 * @see fr.jokercraft.antfarm.Agent#dropped()
	 */
	@Override
	public void dropped() {
		this.lifter = null;
	}

	/* (non-Javadoc)
	 * @see fr.jokercraft.antfarm.Agent#setPosition(java.awt.Point)
	 */
	@Override
	public void setPosition(Point position) {
		this.position = position;
	}

}
