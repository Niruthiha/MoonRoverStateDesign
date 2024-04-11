/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moonroverstatedesign;

/**
 *
 * @author nirut
 */
public class MoonRoverStateDesign {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Rover rover = new Rover();

        // Example of rover movements
        rover.pressRightPedal(); // Moves forward
        rover.pressLeftPedal(); // Moves backward
        rover.pressRightPedalForTime(5); // Right pedal for time
        rover.pressLeftPedalForTime(3); // Left pedal for time
    }
}
