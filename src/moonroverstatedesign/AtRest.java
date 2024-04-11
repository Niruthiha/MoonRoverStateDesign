/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonroverstatedesign;

/**
 *
 * @author nirut
 */
// AtRest.java
public class AtRest extends State {

    AtRest() {
        this.name = "At Rest";
        this.subState = "None";
    }

    @Override
    public boolean pressRightPedal(int numOfTimesPressed) {
        if (numOfTimesPressed != 1) {
            System.out.println("Error: Can only press Right Pedal once when in At Rest State.\nUnable to move.");
            return false;
        } else {
            System.out.println("Transitioning from At Rest State to Move Forward State...");
            return true;
        }
    }

    @Override
    protected boolean pressLeftPedal(int numOfTimesPressed) {
        if (numOfTimesPressed != 5) {
            System.out.println("Error: Must press Left Pedal for 5 seconds when in At Rest State.\nUnable to move.");
            return false;
        } else {
            System.out.println("Transitioning from At Rest State to Move Backward State...");
            return true;
        }
    }

    @Override
    protected void pressRightPedalForTime(int numOfSecondsPressed) {
        System.out.println("Error: Cannot press Right Pedal for Time in At Rest State.\nUnable to move.");
    }

    @Override
    protected void pressLeftPedalForTime(int numOfSecondsPressed) {
        System.out.println("Error: Cannot press Left Pedal for Time in At Rest State.\nUnable to move.");
    }
}
