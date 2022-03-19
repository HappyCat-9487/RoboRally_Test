package RoboRally;

public class Forward extends ProgrammingCard{
	
	public Forward(Robot robot) {
		super(robot);
	}

	private int[] position;
	
	@Override
	public void move() {
		position = super.robot.getPosition();
	}
	
	@Override
	protected void faceWest() {
		position[0] -= 1;
		super.robot.setPosition(position[0], position[1]);
	}
	
	@Override
	protected void faceSouth() {
		position[1] -= 1;
		super.robot.setPosition(position[0], position[1]);
	}
	
	@Override
	protected void faceEast() {
		position[0] += 1;
		super.robot.setPosition(position[0], position[1]);
	}

	@Override
	protected void faceNorth() {
		position[1] += 1;
		super.robot.setPosition(position[0], position[1]);
	}
	
}
