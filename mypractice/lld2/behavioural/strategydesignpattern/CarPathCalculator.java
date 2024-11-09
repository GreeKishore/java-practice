package mypractice.lld2.behavioural.strategydesignpattern;

public class CarPathCalculator implements PathCalculator{
    @Override
    public void pathCalculator(String source, String destination) {
        System.out.println("Path calculated using car");
    }
}