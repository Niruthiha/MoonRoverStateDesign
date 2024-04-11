/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonroverstatedesign;

/**
 *
 * @author nirut
 */
// RoverTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RoverTest {

    @Test
    void testRover() {
        Rover rover = new Rover();
        assertEquals(rover.currentState.name, "At Rest");
        rover.pressRightPedal();
        assertEquals(rover.currentState.name, "Move Forward");
        rover.pressLeftPedal();
        assertEquals(rover.currentState.name, "Move Backward");
        rover.pressRightPedalForTime(5);
        assertEquals(rover.currentState.name, "Move Backward");
        rover.pressLeftPedalForTime(3);
        assertEquals(rover.currentState.name, "At Rest");
    }
}
