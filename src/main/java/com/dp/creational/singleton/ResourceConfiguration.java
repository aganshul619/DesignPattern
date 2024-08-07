package com.dp.creational.singleton;

public class ResourceConfiguration {

    public static void main(String[] args) {
        System.out.println("Calling Config ");
        Object resource = Config.getConfig();
        System.out.println("Resource instance " + resource);
        Config.performOperation();
    }
}

class Config {
    //consider this objet is resource
    private static Object resource;

    private Config() {
    }
    /*
        creating synchronized resource instance
     */
    public static synchronized Object getConfig() {
        System.out.println("Config instance ");
        if (null == resource)
            resource = new Object();
        return resource;
    }

    public static void performOperation() {
        var name = resource.getClass().getName();
        System.out.println("Accessing resource : " + name);
    }
}