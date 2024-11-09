package mypractice.lld2.behavioural.strategydesignpattern;

public class GoogleMaps {
    public void findPath(String source, String destination, TransportationMode mode) {
        PathCalculator pcFromMode = PathcalculatorFactory.findPCFromMode(mode);
        pcFromMode.pathCalculator(source, destination);
    }
}