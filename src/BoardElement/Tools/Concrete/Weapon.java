package BoardElement.Tools.Concrete;

import BoardElement.IBoardElement;
import BoardElement.Tools.AbstractTool;
import BoardElement.Tools.ITool;
import Media.Concrete.ImageArray;
import Media.IMediaListing;
import Patterns.IBuilder;
import Patterns.IPrototype;

public class Weapon extends AbstractTool implements ITool, IBoardElement, IPrototype<Weapon> {

    private int type; //Example. 0: affects character, 1: affects weapon,...
    private IMediaListing media;
    
    public Weapon() {
    }

    public Weapon(float simpleUseDecrement, String name, int defaultLife, int decrementableLife, int reach, float level, float minCharacterLevelReq, float minPlayerLevelReq, int type) {
        super(simpleUseDecrement,name, defaultLife, decrementableLife, reach, level, minCharacterLevelReq, minPlayerLevelReq);
        this.type = type;
        media = new ImageArray();
    }
    
    public void setMedia(IMediaListing media) {
        this.media = media;
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
        Weapon clonedWeapon = new Weapon(this.simpleUseDecrement, this.name, this.defaultLife, this.decrementableLife, this.reach, this.level, this.minCharacterLevelReq, this.minPlayerLevelReq, this.type);
        return clonedWeapon;
    }

    @Override
    public IMediaListing getMediaListing() {
        return this.media;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getToString() {
        String toString="";
        toString = "Name" + this.name + "\n" +
                "SimpleUseDecrement" + this.simpleUseDecrement + "\n"+
                "DefaultLife" + this.defaultLife + "\n" +
                "DecrementableLife" + this.decrementableLife + "\n" +
                "Reach" + this.reach + "\n" + 
                "Level" + this.level + "\n" +
                "MinCharacterLevelReq" + this.minCharacterLevelReq + "\n" +
                "MinPlayerLevelReq" + this.minPlayerLevelReq;
        return toString;
    }

}
