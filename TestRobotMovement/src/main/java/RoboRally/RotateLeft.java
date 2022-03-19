package RoboRally;

public class RotateLeft extends ProgrammingCard{

	public RotateLeft(Robot robot) {
		super(robot);
	}
	
	@Override
	protected void faceWest() {
		super.robot.setFace("South");
	}
	
	@Override
	protected void faceSouth() {
		super.robot.setFace("East");
	}

	@Override
	protected void faceEast() {
		super.robot.setFace("North");
	}
	
	@Override
	protected void faceNorth() {
		super.robot.setFace("West");
	}
	
}
