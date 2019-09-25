package Patterns;

import java.util.HashMap;

public class FactoryCharacterPrototype {

    private static HashMap<String,IPrototype> prototypes = new HashMap<>();

    public static IPrototype getPrototype(String type){
        return prototypes.get(type).deepClone();
    }

    public static void addPrototype(String prototypeType, IPrototype prototype){
        prototypes.put(prototypeType, prototype);
    }
}
