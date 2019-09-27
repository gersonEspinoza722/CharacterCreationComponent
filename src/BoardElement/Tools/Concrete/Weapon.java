package BoardElement.Tools.Concrete;

import BoardElement.IBoardElement;
import BoardElement.Tools.AbstractTool;
import BoardElement.Tools.ITool;
import Media.Concrete.ImageArray;
import Media.IMediaElement;
import Media.IMediaListing;
import Media.MediaListingFactory;
import Patterns.IBuilder;
import Patterns.IPrototype;

import java.io.File;

public class Weapon extends AbstractTool implements ITool, IBoardElement, IPrototype<Weapon> {

    private int type; //Example. 0: affects character, 1: affects weapon,...
    
    public Weapon() {
    }

    
    public Weapon(float simpleUseDecrement, String name, int defaultLife, int decrementableLife, int reach, float level, 
    		float minCharacterLevelReq, float minPlayerLevelReq, int type,IMediaListing media) {
        super(simpleUseDecrement,name, defaultLife, decrementableLife, reach, level, minCharacterLevelReq, minPlayerLevelReq,media);


    public Weapon(float simpleUseDecrement, String name, int defaultLife, int decrementableLife, int reach, float level, float minCharacterLevelReq, float minPlayerLevelReq, int type) {
        super(simpleUseDecrement,name, defaultLife, decrementableLife, reach, level, minCharacterLevelReq, minPlayerLevelReq);
        this.type = type;
        media = new ImageArray();
    }

    public Weapon(float simpleUseDecrement, String name, int defaultLife, int decrementableLife, int reach, float level, float minCharacterLevelReq, float minPlayerLevelReq, int type, IMediaListing media) {
        super(simpleUseDecrement,name, defaultLife, decrementableLife, reach, level, minCharacterLevelReq, minPlayerLevelReq);
        this.type = type;
        super.media = media;
    }
    
    @Override
    public void setDefaultLife(int amount) {
        defaultLife = amount;
    }

    @Override
    public void decLife(int amount) {
        if(decrementableLife - amount <= 0){
            decrementableLife = 0;
        }
        else{
            decrementableLife -= amount;
        }
    }

    @Override
    public void incLife(int amount) {
        if(decrementableLife + amount >= defaultLife){
            decrementableLife = defaultLife;
        }
        else{
            decrementableLife += amount;
        }
    }

    @Override
    public void func(IBoardElement object) {//input can be character or tool to be affected by the weapon

    }

    @Override
    public void incLevel() {
        this.level ++;
    }

    @Override
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {

        Weapon clonedWeapon = new Weapon(this.simpleUseDecrement, this.name, this.defaultLife, this.decrementableLife, this.reach, this.level, this.minCharacterLevelReq, this.minPlayerLevelReq, this.type, this.media);
        return clonedWeapon;
    }

    @Override
    public IPrototype deepCloneAux() {
        return deepClone();
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

    @Override
    public void decLevel() {
        this.level --;
    }

    @Override
    public IBuilder<ITool> getBuilder() {
        return new WeaponBuilder();
    }

    public static class WeaponBuilder implements IBuilder<ITool>{

        private int type, defaultLife, decrementableLife, reach;
        private float simpleUseDecrement, level, minPlayerLevelReq, minCharacterLevelReq;
        private String name;
        private IMediaListing media;

        public WeaponBuilder() {
            MediaListingFactory mediaListingFactory = new MediaListingFactory();
            media = mediaListingFactory.getMediaListing(MediaListingFactory.IMAGE_ARRAY);
        }

        

        @Override
        public ITool build() {
            ITool newTool = new Weapon(simpleUseDecrement, name, defaultLife, decrementableLife,reach, level, 
        		minCharacterLevelReq, minPlayerLevelReq, type,media);
            return newTool;
        }

        public WeaponBuilder setType(int type){
            this.type = type;
            return this;
        }

        public WeaponBuilder setDefaultLife(int defaultLife){
            this.defaultLife = defaultLife;
            return this;
        }

        public WeaponBuilder setDecrementableLife(int decrementableLife){
            this.decrementableLife = decrementableLife;
            return this;
        }

        public WeaponBuilder setReach(int reach){
            this.reach = reach;
            return this;
        }

        public WeaponBuilder setSimpleUseDecrement(float simpleUseDecrement){
            this.simpleUseDecrement = simpleUseDecrement;
            return this;
        }

        public WeaponBuilder setLevel(float level){
            this.level = level;
            return this;
        }

        public WeaponBuilder setMinPlayerLevelReq(float minPlayerLevelReq){
            this.minPlayerLevelReq = minPlayerLevelReq;
            return this;
        }

        public WeaponBuilder setMinCharacterLevelReq(float minCharacterLevelReq){
            this.minCharacterLevelReq = minCharacterLevelReq;
            return this;
        }

        public WeaponBuilder setName(String name){
            this.name = name;
            return this;
        }

        public WeaponBuilder addMedia(IMediaElement media) {
            this.media.loadMedia(media);
            return this;
        }
    }
}
