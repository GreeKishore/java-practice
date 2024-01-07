package mypractice.lld2.creational.factorypattern.practicalfactory.components.button;

public class AndroidButton implements Button {

    @Override
    public void changeSize() {
        System.out.println("Changing button size in android");
    }
}