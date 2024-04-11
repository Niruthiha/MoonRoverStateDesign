/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonroverstatedesign;

/**
 *
 * @author nirut
 */
// State.java
public abstract class State {
    protected String name;
    protected String subState;

    public State() {
        this.name = "NULL";
        this.subState = "NULL";
    }

    public abstract boolean pressRightPedal(int numOfTimesPressed);

    protected abstract boolean pressLeftPedal(int numOfTimesPressed);

    protected abstract void pressRightPedalForTime(int numOfSecondsPressed);

    protected abstract void pressLeftPedalForTime(int numOfSecondsPressed);
}
