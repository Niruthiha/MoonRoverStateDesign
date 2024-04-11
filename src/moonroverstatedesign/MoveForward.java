/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonroverstatedesign;

/**
 *
 * @author nirut
 */
// MoveForward.java
public class MoveForward extends State {

    MoveForward() {
        this.name = "Move Forward";
        this.subState = "Accelerate";
    }

    @Override
    public boolean pressRightPedal(int numOfTimesPressed) {
        if (numOfTimesPressed == 2) {
            System.out.println("Transitioning from Move Forward State to At Rest State...");
            return true;
        } else {
            System.out.println("Error: Can only press Right Pedal twice when in Move Forward State.\nUnable to move.");
            return false;
        }
    }

    @Override
    protected boolean pressLeftPedal(int numOfTimesPressed) {
        System.out.println("Error: Cannot press Left Pedal in Move Forward State.\nUnable to move.");
        return false;
    }

    @Override
    protected void pressRightPedalForTime(int numOfSecondsPressed) {
        System.out.println("Error: Cannot press Right Pedal for Time in Move Forward State.\nUnable to move.");
    }

    @Override
    protected void pressLeftPedalForTime(int numOfSecondsPressed) {
        System.out.println("Error: Cannot press Left Pedal for Time in Move Forward State.\nUnable to move.");
    }
}

