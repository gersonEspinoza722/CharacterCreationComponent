package BoardElement.Tools;

import Patterns.IPrototype;

import java.util.ArrayList;

public class ToolArray implements IToolListing, IPrototype<ToolArray> {
    private ArrayList<ITool> list;
    private String name;
    private int maxAmount;

    public ToolArray() {
    }

    public ToolArray(ArrayList<ITool> list, String name, int maxAmount) {
        this.list = list;
        this.name = name;
        this.maxAmount = maxAmount;
    }

    @Override
    public void deleteTool(int index) {
        list.remove(index);
    }

    @Override
    public void addTool(ITool object) {
        list.add(object);
    }

    @Override
    public ITool getTool(int index) {
        return list.get(index);
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {
        ArrayList<ITool> clonedTools = new ArrayList<>();
        for (int i = 0; i<list.size(); i++){
            clonedTools.add(list.get(i));
        }
        ToolArray clonedToolArray = new ToolArray(clonedTools, this.name, this.maxAmount);
        return clonedToolArray;
    }

    public ArrayList<ITool> getList() {
        return list;
    }

    public void setList(ArrayList<ITool> list) {
        this.list = list;
    }


}
