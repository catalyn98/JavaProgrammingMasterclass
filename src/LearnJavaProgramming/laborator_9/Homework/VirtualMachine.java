package LearnJavaProgramming.laborator_9.Homework;

public class VirtualMachine {
    // Atributele clasei
    private String vmName;
    private String ipAddress;
    private int allocatedMemory;

    // Constructor
    public VirtualMachine(String vmName, String ipAddress, int allocatedMemory) {
        this.vmName = vmName;
        this.ipAddress = ipAddress;
        this.allocatedMemory = allocatedMemory;
    }

    // Metodele get()
    public String getVmName() {
        return vmName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public int getAllocatedMemory() {
        return allocatedMemory;
    }

    // Metodele set()
    public void setVmName(String vmName) {
        this.vmName = vmName;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setAllocatedMemory(int allocatedMemory) {
        this.allocatedMemory = allocatedMemory;
    }

    // Suprascrierea metodei toString()
    @Override
    public String toString() {
        return "VirtualMachine [Name: " + vmName + ", IP Address: " + ipAddress + ", Allocated Memory: " + allocatedMemory + " GB]";
    }

    // Main pentru testare
    public static void main(String[] args) {
        // Creare obiect și afișare detalii
        VirtualMachine vm = new VirtualMachine("VM01", "192.168.10.100", 16);
        System.out.println(vm);

        // Modificarea unor atribute
        vm.setVmName("VM02");
        vm.setIpAddress("192.168.10.101");
        vm.setAllocatedMemory(32);

        // Afișarea detaliilor actualizate
        System.out.println(vm);
    }
}

