package mypractice.lld2.creational.factorypattern.factorymethodandabstractfactory.components.button;

public class IosButton implements Button{
    @Override
    public void changeSize() {
        System.out.println("Changing button size in ios");
    }
}