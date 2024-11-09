package mypractice.lld2.structural.decoratorAndFlyweightPattern;

//The Component interface defines Operations that can be altered by decorators
public interface DataSource {
    String WriteData();
    String ReadData();
}