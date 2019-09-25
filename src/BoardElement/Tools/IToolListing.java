package BoardElement.Tools;

import Patterns.IPrototype;

public interface IToolListing {
    void deleteTool(int index);
    void addTool(ITool object);
    ITool getTool(int index);
    int getSize();
    IPrototype clone();
    IPrototype deepClone();
}
