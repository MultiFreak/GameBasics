package games.basic.gameObjects.interfaces;

import games.basic.position.interfaces.Positionable;

public interface SimpleGameObject {

	public Positionable getPos();
	public int getWidth();
	public int getHeight();
	public void setPosition(Positionable pos);
}
