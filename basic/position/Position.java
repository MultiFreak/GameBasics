package games.basic.position;

import games.basic.position.interfaces.Positionable;

public class Position implements Positionable{
	private int xCoord;
	private int yCoord;
	
	public Position(int x, int y) {
		xCoord = x;
		yCoord = y;
	}

	@Override
	public void setX(int x) {
		xCoord = x;
		
	}

	@Override
	public void setY(int y) {
		yCoord = y;
		
	}

	@Override
	public int getX() {
		return xCoord;
	}

	@Override
	public int getY() {
		return yCoord;
	}

	@Override
	public void move(Positionable shift) {
		xCoord += shift.getX();
		yCoord += shift.getY();
		
	}

	@Override
	public void moveTo(Positionable pos) {
		xCoord = pos.getX();
		yCoord = pos.getY();
		
	}

	@Override
	public void scale(int factor) {
		xCoord *= factor;
		yCoord *= factor;
		
	}

	@Override
	public void scale(int factorX, int factorY) {
		xCoord *= factorX;
		yCoord *= factorY;
		
	}

	
	
}
