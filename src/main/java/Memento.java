import java.util.ArrayList;

public class Memento {
    private String cpu, gpu, ram, psu;
    private ArrayList<String> components = new ArrayList<String>(4);

    public Memento(String cpu, String gpu, String ram, String psu) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.psu = psu;
    }

    public ArrayList<String> getState(){
        components.add(cpu);
        components.add(gpu);
        components.add(ram);
        components.add(psu);
        return components;
    }
}