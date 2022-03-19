package RoboRally;

public abstract class ProgrammingCard {
	
	
	protected String face;
	protected Robot robot;
	
	public ProgrammingCard(Robot robot) {
		this.robot = robot;
	}
	
	public void move() {
		face = this.robot.getFace();
	}
	
	protected void determineFace() {
		switch(face) {
		case "North":
			faceNorth();
			break;
		case "East":
			faceEast();
			break;
		case "South":
			faceSouth();
			break;
		case "West":
			faceWest();
			break;
		default:
			System.out.println("Error");
		}
	}

	protected abstract void faceWest();

	protected abstract void faceSouth();

	protected abstract void faceEast();

	protected abstract void faceNorth();
	
}
