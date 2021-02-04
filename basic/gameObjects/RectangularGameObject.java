package games.basic.gameObjects;

import games.basic.position.interfaces.Positionable;

public class RectangularGameObject extends AbstractGameObject{

	private int witdth = 0;
	private int height = 0;
	private Positionable pos;
	
	RectangularGameObject(Positionable position, int witdth, int height){
		pos = position;
		this.witdth = witdth;
		this.height = height;
		
	}
	
	@Override
	public Positionable getPos() {
		return pos;
	}

	@Override
	public int getWidth() {
		return witdth;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public void setPosition(Positionable pos) {
		this.pos = pos;		
	}
	
}
