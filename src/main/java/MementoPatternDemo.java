/**
 * @author Nicholas Kissoon - 100742790, Alexander Tran - 100788359
 */

public class MementoPatternDemo {
    public static void main(String[] args) {
        //PC Components
        String[] cpuList = {"Intel", "AMD"};
        String[] gpuList = {"Nvidia", "AMD"};
        String[] psuList = {"EVGA", "Corsair"};
        String[] ramList = {"Corsair", "G.SKILL"};

        //Instantiate Originator and CareTaker objects
        Originator PCBuilderOriginator = new Originator();
        CareTaker PCBuilderCareTaker = new CareTaker();

        //State 1 - [Intel, Nvidia, EVGA, Corsair]
        PCBuilderOriginator.setState(cpuList[0], gpuList[0], psuList[0], ramList[0]);

        //State 2 - [Intel, Nvidia, EVGA, G.SKILL]
        PCBuilderOriginator.setState(cpuList[0], gpuList[0], psuList[0], ramList[1]);
        //Save State 2 in Memento object
        PCBuilderCareTaker.add(PCBuilderOriginator.saveStateToMemento());

        //State 3 - [Intel, Nvidia, Corsair, Corsair]
        PCBuilderOriginator.setState(cpuList[0], gpuList[0], psuList[1], ramList[0]);
        //Save State 3 in Memento object
        PCBuilderCareTaker.add(PCBuilderOriginator.saveStateToMemento());

        //State 4 - [Intel, Nvidia, Corsair, G.SKILL]
        PCBuilderOriginator.setState(cpuList[0], gpuList[0], psuList[1], ramList[1]);
        //Should output State 4
        System.out.println("Current State: " + PCBuilderOriginator.getState());

        //Revert to saved State 2
        PCBuilderOriginator.getStateFromMemento(PCBuilderCareTaker.get(0));
        //Should output State 2
        System.out.println("Current State: " + PCBuilderOriginator.getState());

        //Revert to saved State 3
        PCBuilderOriginator.getStateFromMemento(PCBuilderCareTaker.get(1));
        //Should output State 3 - [Intel, Nvidia, Corsair, Corsair]
        System.out.println("Current State: " + PCBuilderOriginator.getState());
    }
}