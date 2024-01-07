package mypractice.lld2.creational.factorypattern.practicalfactory;

import mypractice.lld2.creational.factorypattern.practicalfactory.components.button.Button;
import mypractice.lld2.creational.factorypattern.practicalfactory.components.dropdown.DropDown;
import mypractice.lld2.creational.factorypattern.practicalfactory.components.menu.Menu;

public interface UiFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropdown();
}