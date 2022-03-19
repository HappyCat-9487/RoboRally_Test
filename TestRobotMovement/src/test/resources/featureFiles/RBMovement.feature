@tag
Feature: Robot movement

  @tag1
  Scenario: Robot forward 
    Given the Robot position [10, 2]
    And face "North"
    And have card "forward card" 
    When move 
    Then the result of position change returns
