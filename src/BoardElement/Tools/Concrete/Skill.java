package BoardElement.Tools.Concrete;

import BoardElement.IBoardElement;
import BoardElement.Tools.AbstractTool;
import BoardElement.Tools.ITool;

public class Skill extends AbstractTool implements ITool, IBoardElement {
    public Skill(float simpleUseDecrement, String name, int defaultLife, int decrementableLife, int reach, float level, float minCharacterLevelReq, float minPlayerLevelReq) {
        super(simpleUseDecrement, name, defaultLife, decrementableLife, reach, level, minCharacterLevelReq, minPlayerLevelReq);
    }

    private boolean regenerative; //true if its use increments life
    private float effectAmount;
    private int type; //Example. 0: affects character, 1: affects weapon,...


    @Override
    public void setDefaultLife(int amount) {

    }

    @Override
    public void decLife(int amount) {

    }

    @Override
    public void incLife(int amount) {

    }

    @Override
    public void func(IBoardElement object) {//input can be character or tool to be affected by the tool

    }

    @Override
    public void incLevel() {

    }
}