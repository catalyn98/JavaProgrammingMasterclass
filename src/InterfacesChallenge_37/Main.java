package InterfacesChallenge_37;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Mappable> mappableBuilding = new ArrayList<>();
        mappableBuilding.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappableBuilding.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        mappableBuilding.add(new Building("Stadium Australia", UsageType.SPORTS));

        for(Mappable m : mappableBuilding) {
            Mappable.mapIt(m);
        }
        System.out.println("_".repeat(105));

        List<Mappable> mappableUtilityLine = new ArrayList<>();
        mappableUtilityLine.add(new UtilityLine("College St", UtilityType.FIBER_OPTIC));
        mappableUtilityLine.add(new UtilityLine("Olympic Blvd", UtilityType.WATER));
        mappableUtilityLine.add(new UtilityLine("High School HS", UtilityType.GAS));

        for(Mappable m : mappableUtilityLine) {
            Mappable.mapIt(m);
        }
    }
}