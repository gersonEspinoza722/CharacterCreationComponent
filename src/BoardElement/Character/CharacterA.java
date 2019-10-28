
package BoardElement.Character;

import BoardElement.Character.Concrete.CharacterBasic;
import BoardElement.IBoardElement;
import BoardElement.Tools.ITool;
import BoardElement.Tools.IToolListing;
import BoardElement.Tools.ToolListingFactory;
import Media.IMediaElement;
import Media.IMediaListing;
import Media.MediaListingFactory;
import Patterns.IBuilder;
import Patterns.IPrototype;

import java.io.File;

public class CharacterA implements ICharacter { //IPrototype<AbstractCharacter>

    protected String name;
    protected float defaultLife;
    protected float decrementableLife;
    protected IToolListing tools;
    protected float level;
    protected float minPlayerLevelReq;
    protected float hitsPerUnit;
    protected int fields;
    protected IMediaListing media;

    protected static IBuilder<ICharacter> builder;

    public CharacterA() {
        this.builder = new CharacterBuilder();
    }

    public CharacterA(String name, float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq, float hitsPerUnit, int fields) {
        this.name = name;
        this.defaultLife = defaultLife;
        this.decrementableLife = decrementableLife;
        this.tools = tools;
        this.level = level;
        this.minPlayerLevelReq = minPlayerLevelReq;
        this.hitsPerUnit = hitsPerUnit;
        this.fields = fields;
        this.builder = new CharacterBuilder();
    }

    public CharacterA(String name, float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq, float hitsPerUnit, int fields, IMediaListing media) {
        this.name = name;
        this.defaultLife = defaultLife;
        this.decrementableLife = decrementableLife;
        this.tools = tools;
        this.level = level;
        this.minPlayerLevelReq = minPlayerLevelReq;
        this.hitsPerUnit = hitsPerUnit;
        this.fields = fields;
        this.media = media;
        this.builder = new CharacterBuilder();
    }

    /**
     * Decrements the current life points by the amount specified, if it reach 0 nothing happens
     * @param amount: Amount of life points to decrement
     */
    @Override
    public void decLife(int amount) {
        if(decrementableLife - amount <= 0){
            decrementableLife = 0;
        }
        else{
            decrementableLife -= amount;
        }
    }

    /**
     * Increments the current life points by the amount specified, if it reach the life cap nothing happens
     * @param amount: Amount of life points to increment
     */
    @Override
    public void incLife(int amount) {
        if(decrementableLife + amount >= defaultLife){
            decrementableLife = defaultLife;
        }
        else{
            decrementableLife += amount;
        }
    }

    /**
     * Sets the life cap points
     * @param amount: Amount of life points to set
     */
    @Override
    public void setDefaultLife(int amount) {
        defaultLife = amount;
    }

    /**
     *
     * @param amount
     */
    @Override
    public void incLvl(int amount) {
        this.level=this.level + amount;
    }

    /**
     *
     * @param amount
     */
    @Override
    public void decLvl(int amount) {
        this.level=this.level - amount;
    }

    @Override
    public IMediaListing getMedia() {
        return this.media;
    }

    @Override
    public IToolListing getTools() {
        return this.tools;
    }

    @Override
    public String getToString() {
        String toString= "";
        toString = "Name" + this.name + "\n" +
                "DefaultLife" + this.defaultLife + "\n" +
                "HitsPerUnit" + this.hitsPerUnit + "\n" +
                "Fields" + this.fields + "\n" +
                "DecrementableLife" + this.decrementableLife + "\n" +
                "Level" + this.level + "\n" +
                "MinPlayerLevelReq" + this.minPlayerLevelReq;
        return toString;
    }

    @Override
    public IPrototype clone() {
        CharacterA clone = new CharacterA(this.name, this.defaultLife, this.decrementableLife, this.tools, this.level, this.minPlayerLevelReq, this.hitsPerUnit, this.fields);
        return clone;
    }

    @Override
    public IPrototype deepClone() {
        IToolListing clonedTools = (IToolListing) this.tools.deepClone();
        CharacterA clone = new CharacterA(this.name, this.defaultLife, this.decrementableLife, clonedTools, this.level, this.minPlayerLevelReq, this.hitsPerUnit, this.fields, this.media);
        return clone;
    }
    @Override
    public IBuilder<ICharacter> getBuilder() {
        return new CharacterBasic.CharacterBasicBuilder();
    }

    public static class CharacterBuilder implements IBuilder<ICharacter>{

        private String name;
        private int fields;
        private float defaultLife, decrementableLife, hitsPerUnit, level, minPlayerLevelReq;
        private final IToolListing tools;
        private final IMediaListing media;

        public CharacterBuilder() {
            ToolListingFactory toolListingFactory = new ToolListingFactory();
            tools = toolListingFactory.getToolListing(ToolListingFactory.TOOL_ARRAY);
            MediaListingFactory mediaListingFactory = new MediaListingFactory();
            media = mediaListingFactory.getMediaListing(MediaListingFactory.IMAGE_ARRAY);
        }

        @Override
        public ICharacter build() {
            ICharacter newCharacter = new CharacterA(name, defaultLife, decrementableLife, tools, level, minPlayerLevelReq, hitsPerUnit, fields, media);
            return newCharacter;
        }

        public CharacterBuilder addTool(ITool tool) {
            this.tools.addTool(tool);
            return this;
        }

        public CharacterBuilder addImage(IMediaElement image) {
            //System.out.println("Meti una imagen");
            this.media.loadMedia(image);
            return this;
        }

        public CharacterBuilder setName(String name){
            this.name = name;
            return this;
        }

        public CharacterBuilder setFields(int fields){
            this.fields = fields;
            return this;
        }

        public CharacterBuilder setDefaultLife(float defaultLife){
            this.defaultLife = defaultLife;
            return this;
        }

        public CharacterBuilder setHitsPerUnit(float hitsPerUnit){
            this.hitsPerUnit = hitsPerUnit;
            return this;
        }

        public CharacterBuilder setDecrementableLife(float decrementableLife){
            this.decrementableLife = decrementableLife;
            return this;
        }

        public CharacterBuilder setLevel(float level){
            this.level = level;
            return this;
        }

        public CharacterBuilder setMinPlayerLevelReq(float minPlayerLevelReq){
            this.minPlayerLevelReq = minPlayerLevelReq;
            return this;
        }
    }

}
