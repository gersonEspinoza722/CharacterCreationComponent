package BoardElement.Character.Concrete;

import BoardElement.Character.AbstractCharacter;
import BoardElement.Character.ICharacter;
import BoardElement.Tools.IToolListing;

public class Warrior extends AbstractCharacter implements ICharacter {
    private int stamina;
    private int speed;

    public Warrior(int stamina, int speed, float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq) {
        super(defaultLife,decrementableLife,tools,level,minPlayerLevelReq);
        this.speed=speed;
        this.stamina=stamina;
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
