package games.basic.position.interfaces;

public interface Positionable {
	
	public void setX(int x);
	public void setY(int y);
	public int getX();
	public int getY();
	public void move (Positionable shift);
	public void moveTo(Positionable pos);
	public void scale(int factor);
	public void scale(int factorX, int factorY);
	
}
