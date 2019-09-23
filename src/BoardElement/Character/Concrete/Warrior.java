package BoardElement.Character.Concrete;

import BoardElement.Character.AbstractCharacter;
import BoardElement.Character.ICharacter;
import BoardElement.Tools.ITool;
import BoardElement.Tools.IToolListing;
import Patterns.IPrototype;
import Media.Concrete.ImageArray;
import Media.IMediaListing;

public class Warrior extends AbstractCharacter implements ICharacter, IPrototype<Warrior>{
    private int stamina;
    private int speed;
    private IMediaListing images;

    public Warrior(int stamina, int speed, float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq, float hitsPerUnit, int fields) {
        super(defaultLife, decrementableLife, tools, level, minPlayerLevelReq, hitsPerUnit, fields);
        this.speed=speed;
        this.stamina=stamina;
        images = new ImageArray();
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public IMediaListing getImages() {
        return images;
    }

    public void setImages(ImageArray images) {
        this.images = images;
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
