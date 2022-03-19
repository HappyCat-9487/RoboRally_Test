package RoboRally;

public class Uturn extends ProgrammingCard {

	public Uturn(Robot robot) {
		super(robot);
	}

	@Override
	protected void faceWest() {
		super.robot.setFace("East");
	}

	@Override
	protected void faceSouth() {
		super.robot.setFace("North");
	}

	@Override
	protected void faceEast() {
		super.robot.setFace("West");
	}

	@Override
	protected void faceNorth() {
		super.robot.setFace("South");
	}

}
