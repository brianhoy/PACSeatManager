/**
 * Data structure to represent a seat
 * 
 * @author Brian Hoy
 * @version 3/14/17
 */
public class Seat
{
    private SeatState state;
    private SeatingPosition position;
    
    /**
     * Constructor for objects of class Seat
     */
    public Seat()
    {
        state = SeatStates.SEATSTATE_EMPTY; // seats start empty
    }

    /**
     * Gets the state of the seat
     * 
     * @return     the state of the seat using the SeatState enum
     */
    public SeatState getState()
    {
        return state;
    }
    
    /**
     * Sets the state of the seat
     * 
     * @param   newState   the new state of the seat
     */
    public void setState(SeatState newState)
    {
        seatState = newState;
    }
    
    public void setPosition(SeatingPosition newPosition) {
        position = newPosition;
    }
    
    public SeatingPosition getPosition() {
        return position;
    }
}
