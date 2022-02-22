import java.util.ArrayList;

/**
 * @author Nicholas Kissoon - 100742790, Alexander Tran - 100788359
 */

/**
 * Originator class creates and restores object states using mementos
 */
public class Originator {
    //PC Components - Object's state
    private String cpu, gpu, ram, psu;
    //ArrayList to store PC components
    private ArrayList<String> components = new ArrayList<String>(4);

    /**
     * Originator object onstructor
     * @param cpu Central processing unit
     * @param gpu Graphics processing units
     * @param ram Random-access memory
     * @param psu Power supply unit
     */
    public void setState(String cpu, String gpu, String ram, String psu) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.psu = psu;
    }

    /**
     * Accesses the object's current state
     * @return ArrayList of PC components - The object's current state
     */
    public ArrayList<String> getState() {
        if(components.isEmpty()) {
            components.add(cpu);
            components.add(gpu);
            components.add(ram);
            components.add(psu);
        }
        return components;
    }

    /**
     * Saves object's current state to memento object
     * @return Memento object containing current state
     */
    public Memento saveStateToMemento() {
        return new Memento(cpu, gpu, ram, psu);
    }

    /**
     * Restores object's prior state using memento object
     * @param memento Memento object to be restored
     */
    public void getStateFromMemento(Memento memento) {
        components = memento.getState();
    }
}