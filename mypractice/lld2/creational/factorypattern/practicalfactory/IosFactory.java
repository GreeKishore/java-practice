package mypractice.lld2.creational.factorypattern.practicalfactory;

import mypractice.lld2.creational.factorypattern.practicalfactory.components.button.IosButton;
import mypractice.lld2.creational.factorypattern.practicalfactory.components.dropdown.IosDropDown;
import mypractice.lld2.creational.factorypattern.practicalfactory.components.menu.IosMenu;

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