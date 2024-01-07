package mypractice.lld2.creational.factorypattern.factorymethodandabstractfactory;

import mypractice.lld2.creational.factorypattern.factorymethodandabstractfactory.components.dropdown.IosDropDown;
import mypractice.lld2.creational.factorypattern.factorymethodandabstractfactory.components.menu.IosMenu;
import mypractice.lld2.creational.factorypattern.factorymethodandabstractfactory.components.button.IosButton;

public class IosFactory implements UiFactory {
    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }

    @Override
    public IosDropDown createDropdown() {
        return new IosDropDown();
    }
}