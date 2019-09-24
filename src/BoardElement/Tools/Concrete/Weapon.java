package BoardElement.Tools.Concrete;

import BoardElement.IBoardElement;
import BoardElement.Tools.AbstractTool;
import BoardElement.Tools.ITool;
import Patterns.IPrototype;

public class Weapon extends AbstractTool implements ITool, IBoardElement, IPrototype<Weapon> {

    public Weapon(float simpleUseDecrement, String name, int defaultLife, int decrementableLife, int reach, float level, float minCharacterLevelReq, float minPlayerLevelReq) {
        super(simpleUseDecrement,name, defaultLife, decrementableLife, reach, level, minCharacterLevelReq, minPlayerLevelReq);
    }

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
    public void func(IBoardElement object) {//input can be character or tool to be affected by the weapon

    }



    @Override
    public void incLevel() {

    }

    @Override
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {
        Weapon clonedWeapon = new Weapon(this.simpleUseDecrement, this.name, this.defaultLife, this.decrementableLife, this.reach, this.level, this.minCharacterLevelReq, this.minPlayerLevelReq);
        return clonedWeapon;
    }
}
