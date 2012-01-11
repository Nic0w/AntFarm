/**
 * 
 */
package fr.jokercraft.antfarm;

import java.awt.Color;

/**
 * @author Nicolas Broquet
 * @author Romain Clarivet
 *
 */
public enum RessourceType {
	
	WHEAT(Color.YELLOW, "wheat"),
	MALT(Color.ORANGE , "malt"),
	BERRY(Color.RED   , "berry");
	
	private String name;
	private Color color;
	
	private RessourceType(Color color, String name) {
		this.color = color;
		this.name = name;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public String getName() {
		return this.name;
	}

}
