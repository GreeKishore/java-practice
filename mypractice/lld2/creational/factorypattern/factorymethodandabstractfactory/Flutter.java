package mypractice.lld2.creational.factorypattern.factorymethodandabstractfactory;

import mypractice.lld2.creational.factorypattern.factorymethodandabstractfactory.components.SupportedPlatforms;

public class Flutter {
    public void setTheme(){
        System.out.println("Setting theme..");
    }
    public void setRefreshRate(int hertz){
        System.out.println("Setting refresh rate..");
    }
    public UiFactory createFactory(SupportedPlatforms supportedPlatforms){
        if(SupportedPlatforms.ANDROID.equals(supportedPlatforms)){
            return new AndroidFactory();
        }
        return new IosFactory();
    }
}