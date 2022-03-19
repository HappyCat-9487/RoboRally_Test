package RoboRally;

public class Robot {
	
	private int x, y;
	private String face;
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setFace(String face) {
		this.face = face;
	}
	
	public int[] getPosition() {
		int[] s = {this.x, this.y};
		return s;
	}
	
	public String getFace() {
		return this.face;
	}
	
}
