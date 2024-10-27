package LearnJavaProgramming.exercise_12;

public class Computer {
    String name;
    String cpu;
    int ram;  // în GB
    int hdd;  // în GB

    public Computer(String name, String cpu, int ram, int hdd) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

//    @Override
//    public String toString() {
//        return "Nume: " + name + ", CPU: " + cpu + ", RAM: " + ram + "GB, HDD: " + hdd + "GB";
//    }
}
