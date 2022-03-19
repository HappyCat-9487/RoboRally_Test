package RoboRally;

public class RotateRight extends ProgrammingCard {

	public RotateRight(Robot robot) {
		super(robot);
	}

	@Override
	protected void faceWest() {
		super.robot.setFace("North");
	}

	@Override
	protected void faceSouth() {
		super.robot.setFace("West");
	}

	@Override
	protected void faceEast() {
		super.robot.setFace("South");
	}

	@Override
	protected void faceNorth() {
		super.robot.setFace("East");
	}

}
