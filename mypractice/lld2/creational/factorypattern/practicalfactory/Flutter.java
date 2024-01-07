package mypractice.lld2.creational.factorypattern.practicalfactory;

import mypractice.lld2.creational.factorypattern.practicalfactory.components.SupportedPlatforms;

public class Flutter {
    public void setTheme(){
        System.out.println("Setting theme..");
    }
    public void setRefreshRate(int hertz){
        System.out.println("Setting refresh rate..");
    }
    public UiFactory createFactory(SupportedPlatforms supportedPlatforms){
        return UiFactotyFactory.createFactoryBasedOnPlatform(supportedPlatforms);
    }
}