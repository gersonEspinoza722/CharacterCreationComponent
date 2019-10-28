package BoardElement.Tools;

import BoardElement.IBoardElement;
import BoardElement.Tools.Concrete.Weapon;
import Media.IMediaElement;
import Media.IMediaListing;
import Media.MediaListingFactory;
import Patterns.IBuilder;
import Patterns.IPrototype;

public class Tool implements ITool{
    protected String name;
    protected int defaultLife;
    protected int decrementableLife;
    protected int reach; //can be used as radial or linear effect
    protected float level;
    protected float minCharacterLevelReq;
    protected float minPlayerLevelReq;
    protected float simpleUseDecrement;
    protected IMediaListing media;
    protected int type;

    public Tool() {
    }

    public Tool(float simpleUseDecrement, String name, int defaultLife, int decrementableLife, int reach, float level, float minCharacterLevelReq, float minPlayerLevelReq, IMediaListing media, int type) {
        this.name = name;
        this.defaultLife = defaultLife;
        this.decrementableLife = decrementableLife;
        this.reach = reach;
        this.level = level;
        this.minCharacterLevelReq = minCharacterLevelReq;
        this.minPlayerLevelReq = minPlayerLevelReq;
        this.simpleUseDecrement = simpleUseDecrement;
        this.media = media;
        this.type = type;
        //IMAGE AND MEDIA STORAGE NEEDED
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
    public void incLevel() {
        this.level ++;
    }

    @Override
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {

        Weapon clonedWeapon = new Weapon(this.simpleUseDecrement, this.name, this.defaultLife, this.decrementableLife, this.reach, this.level, this.minCharacterLevelReq, this.minPlayerLevelReq, this.media,type);
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
                "Type" + this.type + "\n" +
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
        return new Weapon.WeaponBuilder();
    }

    @Override
    public void func(IBoardElement object) {//input can be character or tool to be affected by the weapon

    }

    //TOOL BUILDER
    public static class ToolBuilder implements IBuilder<ITool>{

        private int type, defaultLife, decrementableLife, reach;
        private float simpleUseDecrement, level, minPlayerLevelReq, minCharacterLevelReq;
        private String name;
        private IMediaListing media;

        public ToolBuilder() {
            MediaListingFactory mediaListingFactory = new MediaListingFactory();
            media = mediaListingFactory.getMediaListing(MediaListingFactory.IMAGE_ARRAY);
        }

        @Override
        public ITool build() {
            ITool newTool = new Weapon(simpleUseDecrement, name, defaultLife, decrementableLife,reach, level,
                    minCharacterLevelReq, minPlayerLevelReq,media,type);
            return newTool;
        }

        public ToolBuilder setType(int type){
            this.type = type;
            return this;
        }

        public ToolBuilder setDefaultLife(int defaultLife){
            this.defaultLife = defaultLife;
            return this;
        }

        public ToolBuilder setDecrementableLife(int decrementableLife){
            this.decrementableLife = decrementableLife;
            return this;
        }

        public ToolBuilder setReach(int reach){
            this.reach = reach;
            return this;
        }

        public ToolBuilder setSimpleUseDecrement(float simpleUseDecrement){
            this.simpleUseDecrement = simpleUseDecrement;
            return this;
        }

        public ToolBuilder setLevel(float level){
            this.level = level;
            return this;
        }

        public ToolBuilder setMinPlayerLevelReq(float minPlayerLevelReq){
            this.minPlayerLevelReq = minPlayerLevelReq;
            return this;
        }

        public ToolBuilder setMinCharacterLevelReq(float minCharacterLevelReq){
            this.minCharacterLevelReq = minCharacterLevelReq;
            return this;
        }

        public ToolBuilder setName(String name){
            this.name = name;
            return this;
        }

        public ToolBuilder addMedia(IMediaElement media) {
            this.media.loadMedia(media);
            return this;
        }
    }
}
