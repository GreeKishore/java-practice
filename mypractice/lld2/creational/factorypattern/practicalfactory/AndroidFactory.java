package mypractice.lld2.creational.factorypattern.practicalfactory;

import mypractice.lld2.creational.factorypattern.practicalfactory.components.button.AndroidButton;
import mypractice.lld2.creational.factorypattern.practicalfactory.components.dropdown.AndroidDropDown;
import mypractice.lld2.creational.factorypattern.practicalfactory.components.menu.AndroidMenu;

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