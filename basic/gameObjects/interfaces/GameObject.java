package games.basic.gameObjects.interfaces;

public interface GameObject extends SimpleGameObject {

	public boolean isLeftOf(GameObject other);
	public boolean isRightOf(GameObject other);
	public boolean isAbove(GameObject other);
	public boolean isBelow(GameObject other);
	public boolean touches(GameObject other);
		
}
