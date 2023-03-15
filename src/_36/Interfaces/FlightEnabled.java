package _36.Interfaces;

public interface FlightEnabled {

        double MILES_TO_KM = 1.60934;
        double KM_TO_MILES = 0.621371;

        public abstract void takeOff();

        abstract void land();

        void fly();

        // we define a new abstract method in the interface
        // now we have an error, because this method should be implemented in the other classes
        // FlightStages transition(FlightStages stage);

        // to solve this
        // error we will use extension method
        // this method is a concrete method
        default FlightStages transition (FlightStages stage) {
/*                System.out.println("Transition method is not implemented on " + getClass().getSimpleName());
                return  null;*/
                FlightStages nextStage = stage.getNextStage();
                System.out.println("Transition from " + stage + " to " + nextStage);
                return nextStage;
        }
}
