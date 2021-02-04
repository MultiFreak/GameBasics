package games.basic.gameObjects;

import games.basic.position.interfaces.Positionable;

public class CircularGameObject extends AbstractGameObject{

	private int radius = 0;
	private Positionable pos;
	
	CircularGameObject(Positionable position, int radius){
		pos = position;
		this.radius = radius;
		
	}
	
	@Override
	public Positionable getPos() {
		return pos;
	}

	@Override
	public int getWidth() {
		return radius*2;
	}

	@Override
	public int getHeight() {
		return radius*2;
	}

	@Override
	public void setPosition(Positionable pos) {
		this.pos = pos;
	}
	

}
