package BoardElement.Tools;

import java.util.ArrayList;

public class ToolArray implements IToolListing {
    private ArrayList<ITool> list;
    private String name;
    private int maxAmount;

    public ArrayList<ITool> getList() {
        return list;
    }

    @Override
    public void deleteTool(int index) {

    }

    @Override
    public void addTool(ITool object) {

    }

    @Override
    public ITool getTool(int index) {
        return null;
    }
}
