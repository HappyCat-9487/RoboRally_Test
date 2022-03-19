import RoboRally.Forward;
import RoboRally.ProgrammingCard;
import RoboRally.Robot;
import RoboRally.RotateLeft;
import RoboRally.RotateRight;
import RoboRally.Uturn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDefinition {
	
	Robot robot = new Robot();
	ProgrammingCard pcard;
	
	@Given("the Robot position [{int}, {int}]")
	public void the_robot_position(Integer int1, Integer int2) {
	    robot.setPosition(int1, int2);
	}
	
	@Given("face {string}")
	public void face(String face) {
	    robot.setFace(face);
	}
	
	@Given("have card {string}")
	public void have_card(String card) {
		
		switch(card) {
		case "forward":
			pcard = new Forward(robot);
			break;
		case "rotateLeft":
			pcard = new RotateLeft(robot);
			break;
		case "rotateRight":
			pcard = new RotateRight(robot);
			break;
		case "Uturn":
			pcard = new Uturn(robot);
			break;
		default:
			System.out.println("You didn't have receive any card !!");
		}
	}
	   
	@When("move")
	public void move() {
		pcard.move();
	}
	
	@Then("the result of position change returns")
	public void the_result_of_position_change_returns() {
		robot.getPosition();
	}
}
