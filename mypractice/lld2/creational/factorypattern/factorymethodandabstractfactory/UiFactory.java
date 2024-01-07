package mypractice.lld2.creational.factorypattern.factorymethodandabstractfactory;

import mypractice.lld2.creational.factorypattern.factorymethodandabstractfactory.components.button.Button;
import mypractice.lld2.creational.factorypattern.factorymethodandabstractfactory.components.menu.Menu;
import mypractice.lld2.creational.factorypattern.factorymethodandabstractfactory.components.dropdown.DropDown;

public interface UiFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropdown();
}