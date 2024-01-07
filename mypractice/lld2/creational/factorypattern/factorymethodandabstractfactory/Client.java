package mypractice.lld2.creational.factorypattern.factorymethodandabstractfactory;

import mypractice.lld2.creational.factorypattern.factorymethodandabstractfactory.components.button.Button;
import mypractice.lld2.creational.factorypattern.factorymethodandabstractfactory.components.SupportedPlatforms;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UiFactory uiFactory = flutter.createFactory(SupportedPlatforms.ANDROID);
        Button button = uiFactory.createButton();
        button.changeSize();
    }
}