/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonroverstatedesign;

/**
 *
 * @author nirut
 */
// Rover.java
public class Rover {
    protected State currentState;

    public Rover() {
        this.currentState = new AtRest();
    }

    public void pressRightPedal() {
        currentState = new MoveForward();
        currentState.pressRightPedal(2);
    }

    public void pressLeftPedal() {
        currentState = new MoveBackward();
        currentState.pressLeftPedal(1);
    }

    public void pressRightPedalForTime(int numOfSecondsPressed) {
        currentState.pressRightPedalForTime(numOfSecondsPressed);
    }

    public void pressLeftPedalForTime(int numOfSecondsPressed) {
        currentState.pressLeftPedalForTime(numOfSecondsPressed);
    }
}
