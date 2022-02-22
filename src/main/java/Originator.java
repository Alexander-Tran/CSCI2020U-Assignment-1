import java.util.ArrayList;

public class Originator {
    private String cpu, gpu, ram, psu;
    private ArrayList<String> components = new ArrayList<String>();

    public void setState(String cpu, String gpu, String ram, String psu) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.psu = psu;
    }

    public ArrayList<String> getState() {
        components.add(cpu);
        components.add(gpu);
        components.add(ram);
        components.add(psu);
        return components;
    }

    public Memento saveStateToMemento() {
        return new Memento(cpu, gpu, ram, psu);
    }

    public void getStateFromMemento(Memento memento) {
        components = new ArrayList<>(memento.getState());
    }
}