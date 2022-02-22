import java.util.ArrayList;

/**
 * @author Nicholas Kissoon - 100742790, Alexander Tran - 100788359
 */

/**
 * CareTaker class stores mementos containing object states
 */
public class CareTaker {
    //ArrayList to store memento objects
    private ArrayList<Memento> mementoList = new ArrayList<Memento>();

    /**
     * Stores memento objects
     * @param memento Memento to be stored
     */
    public void add(Memento memento) {
        mementoList.add(memento);
    }

    /**
     * Returns memento of previous object state
     * @param index Index of ArrayList
     * @return Memento object containing previous state
     */
    public Memento get(int index) {
        return mementoList.get(index);
    }
}