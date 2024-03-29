package Patterns;

public interface IPrototype <T extends IPrototype> extends Cloneable{
    IPrototype clone();
    IPrototype deepClone();
}
