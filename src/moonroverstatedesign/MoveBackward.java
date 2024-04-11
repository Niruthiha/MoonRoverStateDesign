/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonroverstatedesign;

/**
 *
 * @author nirut
 */
// MoveBackward.java
public class MoveBackward extends State {

    MoveBackward() {
        this.name = "Move Backward";
        this.subState = "Accelerate";
    }

    @Override
    public boolean pressRightPedal(int numOfTimesPressed) {
        System.out.println("Error: Cannot press Right Pedal in Move Backward State.\nUnable to move.");
        return false;
    }

    @Override
    protected boolean pressLeftPedal(int numOfTimesPressed) {
        if (numOfTimesPressed == 1) {
            System.out.println("Transitioning from Move Backward State to At Rest State...");
            return true;
        } else {
            System.out.println("Error: Can only press Left Pedal once when in Move Backward State.\nUnable to move.");
            return false;
        }
    }

    @Override
    protected void pressRightPedalForTime(int numOfSecondsPressed) {
        System.out.println("Error: Cannot press Right Pedal for Time in Move Backward State.\nUnable to move.");
    }

    @Override
    protected void pressLeftPedalForTime(int numOfSecondsPressed) {
        System.out.println("Error: Cannot press Left Pedal for Time in Move Backward State.\nUnable to move.");
    }
}
