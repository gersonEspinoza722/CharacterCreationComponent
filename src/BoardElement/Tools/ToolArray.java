package BoardElement.Tools;

import Patterns.IPrototype;

import java.util.ArrayList;

public class ToolArray implements IToolListing, IPrototype<ToolArray> {
    private ArrayList<ITool> list;
    private String name;
    private int maxAmount;

    public ToolArray() {
        this.list = new ArrayList<>();
    }

    public ToolArray(ArrayList<ITool> list, String name, int maxAmount) {
        this.list = list;
        this.name = name;
        this.maxAmount = maxAmount;
    }

    @Override
    public void deleteTool(int index) {
        this.list.remove(index);
    }

    @Override
    public void addTool(ITool object) {
        this.list.add(object);
    }

    @Override
    public ITool getTool(int index) {
        return list.get(index);
    }

    @Override
    public int getSize() {
        return this.list.size();
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



    public void setList(ArrayList<ITool> list) {
        this.list = list;
    }

    @Override
    public ArrayList<ITool> getToolList() {
        return this.list;
    }

}
