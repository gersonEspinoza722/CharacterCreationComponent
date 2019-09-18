package BoardElement.Tools;

public interface IToolListing {
    void deleteTool(int index);
    void addTool(ITool object);
    ITool getTool(int index);
}
