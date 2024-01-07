package mypractice.lld2.creational.factorypattern.practicalfactory;

import mypractice.lld2.creational.factorypattern.practicalfactory.components.SupportedPlatforms;

public class UiFactotyFactory {
    public static UiFactory createFactoryBasedOnPlatform(SupportedPlatforms supportedPlatforms){
        return switch (supportedPlatforms){
            case IOS -> new IosFactory();
            case ANDROID -> new AndroidFactory();
            default -> new AndroidFactory();
        };
//        if(SupportedPlatforms.ANDROID.equals(supportedPlatforms)){
//            return new AndroidFactory();
//        }
//        return new IosFactory();
    }
}