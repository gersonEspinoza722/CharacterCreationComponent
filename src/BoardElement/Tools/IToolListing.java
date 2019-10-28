package BoardElement.Tools;

import Patterns.IPrototype;
import java.util.ArrayList;

public interface IToolListing extends IPrototype<IToolListing>{
    void deleteTool(int index);
    void addTool(ITool object);
    ITool getTool(int index);
    ArrayList<ITool> getToolList();
    int getSize();
    IPrototype clone();
    IPrototype deepClone();
}
