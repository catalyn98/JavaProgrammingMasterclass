package CodingChallenge_18.CarpetCostCalculator_3;

import CodingChallenge_18.CarpetCostCalculator_3.Carpet;
import CodingChallenge_18.CarpetCostCalculator_3.Floor;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double  getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
