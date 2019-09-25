package BoardElement.Character.Concrete;

import BoardElement.Character.AbstractCharacter;
import BoardElement.Character.ICharacter;
import BoardElement.Tools.ITool;
import BoardElement.Tools.IToolListing;
import Patterns.IPrototype;

public class Character extends AbstractCharacter implements ICharacter, IPrototype<Character>{

    public Character(float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq, float hitsPerUnit, int fields) {
        super(defaultLife, decrementableLife, tools, level, minPlayerLevelReq, hitsPerUnit, fields);
    }

    @Override
    public void decLife(int amount) {

    }

    @Override
    public void incLife(int amount) {

    }

    @Override
    public void setDefaultLife(int amount) {

    }

    @Override
    public IPrototype clone() {
        Character clone = new Character(this.defaultLife, this.decrementableLife, this.tools, this.level, this.minPlayerLevelReq, this.hitsPerUnit, this.fields);
        return clone;
    }

    @Override
    public IPrototype deepClone() {
        IToolListing clonedTools = (IToolListing) this.tools.deepClone();
        Character clone = new Character(this.defaultLife, this.decrementableLife, clonedTools, this.level, this.minPlayerLevelReq, this.hitsPerUnit, this.fields);
        return clone;
    }
}
