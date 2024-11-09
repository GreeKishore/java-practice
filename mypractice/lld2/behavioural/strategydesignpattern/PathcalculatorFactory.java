package mypractice.lld2.behavioural.strategydesignpattern;

public class PathcalculatorFactory {
    public static PathCalculator findPCFromMode(TransportationMode mode) {
        return switch (mode) {
            case CAR -> new CarPathCalculator();
            case BIKE -> new BikePathCalculator();
            case WALK -> new WalkPathCalculator();
        };
    }
}