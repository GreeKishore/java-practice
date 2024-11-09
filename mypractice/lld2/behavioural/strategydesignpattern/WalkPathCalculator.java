package mypractice.lld2.behavioural.strategydesignpattern;

public class WalkPathCalculator implements PathCalculator{
    @Override
    public void pathCalculator(String source, String destination) {
        System.out.println("Path calculated by foot");
    }
}