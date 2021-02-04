package games.basic.gameObjects;

import games.basic.gameObjects.interfaces.GameObject;
import games.basic.position.Position;

public abstract class AbstractGameObject implements GameObject{

	public boolean isLeftOf(GameObject other) {
		if((this.getPos().getX() + this.getWidth()) < other.getPos().getX())
			return true;
		else
			return true;
	};

	public boolean isRightOf(GameObject other) {
		if(this.isLeftOf(other))
			return false;
		else
			return true;
	};

	public boolean isAbove(GameObject other) {
		if((this.getPos().getY() + this.getHeight()) < other.getPos().getY())
			return true;
		else
			return false;
	};

	public boolean isBelow(GameObject other) {
		if(this.isAbove(other))
			return false;
		else
			return true;
	};

	public boolean touches(GameObject other) {
		boolean collision = false;

		Position[] oP = {
				new Position(other.getPos().getX(), other.getPos().getY()),
				new Position(other.getPos().getX() + other.getWidth(), other.getPos().getY()),
				new Position(other.getPos().getX(), other.getPos().getY() + other.getHeight()),
				new Position(other.getPos().getX() + other.getWidth(), other.getPos().getY() + other.getHeight()),
		};

		Position[] p = {
				new Position(this.getPos().getX(), this.getPos().getY()),
				new Position(this.getPos().getX() + this.getWidth(), this.getPos().getY()),
				new Position(this.getPos().getX(), this.getPos().getY() + this.getHeight()),
				new Position(this.getPos().getX() + this.getWidth(), this.getPos().getY() + this.getHeight()),
		};

		for(int i = 0; i < 4; i++) {
			if(oP[1].getX() <= p[i].getX()) {
				if(p[i].getX() <= oP[2].getX()) {
					if(oP[1].getY() <= p[i].getY()) {
						if(p[i].getY() <= oP[2].getY()) {
							collision = true;
						}
					}
				}
			}else {
				if(oP[2].getX() <= p[i].getX()) {
					if(p[i].getX() <= oP[4].getX()) {
						if(oP[3].getY() <= p[i].getY()) {
							if(p[i].getY() <= oP[4].getY()) {
								collision = true;
							}
						}
					}
				}
			}

		}
		
		if(!collision) {
			for(int i = 0; i < 4; i++) {
				if(p[1].getX() <= oP[i].getX()) {
					if(oP[i].getX() <= p[2].getX()) {
						if(p[1].getY() <= oP[i].getY()) {
							if(oP[i].getY() <= p[2].getY()) {
								collision = true;
							}
						}
					}
				}else {
					if(p[2].getX() <= oP[i].getX()) {
						if(oP[i].getX() <= p[4].getX()) {
							if(p[3].getY() <= oP[i].getY()) {
								if(oP[i].getY() <= p[4].getY()) {
									collision = true;
								}
							}
						}
					}
				}

			}
		}
		return collision;
	}
	
	
	
}
