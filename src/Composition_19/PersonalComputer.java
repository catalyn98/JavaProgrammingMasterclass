package Composition_19;

public class PersonalComputer extends Product {
    private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer, Monitor monitor, Motherboard motherboard, ComputerCase computerCase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }

/*    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }*/

    private void drawLogo() {
        monitor.drawPixelAt(20, 20, "blue");
    }

    private void loadingProgram() {
        motherboard.loadProgram("Windows 11");
    }
    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
        loadingProgram();
    }
}
