package mypractice.lld2.creational.factorypattern.factorymethodandabstractfactory;

import mypractice.lld2.creational.factorypattern.factorymethodandabstractfactory.components.button.AndroidButton;
import mypractice.lld2.creational.factorypattern.factorymethodandabstractfactory.components.dropdown.AndroidDropDown;
import mypractice.lld2.creational.factorypattern.factorymethodandabstractfactory.components.menu.AndroidMenu;

public class AndroidFactory implements UiFactory {
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropDown createDropdown() {
        return new AndroidDropDown();
    }
}