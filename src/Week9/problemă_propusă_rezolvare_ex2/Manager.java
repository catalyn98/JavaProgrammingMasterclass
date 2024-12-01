package Week9.problemă_propusă_rezolvare_ex2;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public void manageTeam() {
        System.out.println("Manager is managing a team of " + teamSize + " members.");
    }
}
