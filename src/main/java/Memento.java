import java.util.ArrayList;

/**
 * @author Nicholas Kissoon - 100742790, Alexander Tran - 100788359
 */

/**
 * Memento class stores the state of an object
 */
public class Memento {
    //PC Components
    private String cpu, gpu, ram, psu;
    //ArrayList to store PC components
    private ArrayList<String> components = new ArrayList<String>(4);

    /**
     * Memento object constructor
     * @param cpu Central processing unit
     * @param gpu Graphics processing units
     * @param ram Random-access memory
     * @param psu Power supply unit
     */
    public Memento(String cpu, String gpu, String ram, String psu) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.psu = psu;
    }

    /**
     * Accesses the current state of the memento
     * @return ArrayList of the PC components
     */
    public ArrayList<String> getState(){
        components.add(cpu);
        components.add(gpu);
        components.add(ram);
        components.add(psu);
        return components;
    }
}