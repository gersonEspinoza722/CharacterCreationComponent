package BoardElement.Character.Concrete;

import BoardElement.Character.AbstractCharacter;
import BoardElement.Character.ICharacter;
import BoardElement.Tools.IToolListing;

public class Character extends AbstractCharacter implements ICharacter {
    public Character(float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq) {
        super(defaultLife,decrementableLife,tools,level,minPlayerLevelReq);
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
}
