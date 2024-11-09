package mypractice.lld2.behavioural.strategydesignpattern;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("A", "B", TransportationMode.BIKE);
    }
}