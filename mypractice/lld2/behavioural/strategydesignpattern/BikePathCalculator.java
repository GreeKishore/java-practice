package mypractice.lld2.behavioural.strategydesignpattern;

public class BikePathCalculator implements PathCalculator{
    @Override
    public void pathCalculator(String source, String destination) {
        System.out.println("path is calculated for Bike");
    }
}