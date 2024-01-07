package mypractice.lld2.creational.factorypattern.practicalfactory;

import mypractice.lld2.creational.factorypattern.practicalfactory.components.SupportedPlatforms;
import mypractice.lld2.creational.factorypattern.practicalfactory.components.button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UiFactory uiFactory = flutter.createFactory(SupportedPlatforms.ANDROID);
        Button button = uiFactory.createButton();
        button.changeSize();
    }
}