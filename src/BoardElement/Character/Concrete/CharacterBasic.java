package BoardElement.Character.Concrete;

import BoardElement.Character.AbstractCharacter;
import BoardElement.Character.CharacterFactory;
import BoardElement.Character.ICharacter;
import BoardElement.IBoardElement;
import BoardElement.Tools.ITool;
import BoardElement.Tools.IToolListing;
import BoardElement.Tools.ToolListingFactory;
import Media.IMediaListing;
import Media.MediaListingFactory;
import Patterns.IBuilder;
import Patterns.IPrototype;

import java.io.File;

public class CharacterBasic extends AbstractCharacter implements ICharacter, IPrototype<CharacterBasic>, IBoardElement{

    public CharacterBasic() {
        ToolListingFactory toolListingFactory = ToolListingFactory.getInstance();
        this.tools = toolListingFactory.getToolListing(ToolListingFactory.TOOL_ARRAY);

        MediaListingFactory mediaListingFactory = new MediaListingFactory();
        super.media = mediaListingFactory.getMediaListing(MediaListingFactory.IMAGE_ARRAY);

    }

    public CharacterBasic(String name, float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq, float hitsPerUnit, int fields) {
        super(name, defaultLife, decrementableLife, tools, level, minPlayerLevelReq, hitsPerUnit, fields);

        MediaListingFactory mediaListingFactory = new MediaListingFactory();
        super.media = mediaListingFactory.getMediaListing(MediaListingFactory.IMAGE_ARRAY);
    }

    public CharacterBasic(String name, float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq, float hitsPerUnit, int fields, IMediaListing media) {
        super(name, defaultLife, decrementableLife, tools, level, minPlayerLevelReq, hitsPerUnit, fields, media);

        MediaListingFactory mediaListingFactory = new MediaListingFactory();
        super.media = mediaListingFactory.getMediaListing(MediaListingFactory.IMAGE_ARRAY);
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
        CharacterBasic clone = new CharacterBasic(this.name, this.defaultLife, this.decrementableLife, this.tools, this.level, this.minPlayerLevelReq, this.hitsPerUnit, this.fields);
        return clone;
    }

    @Override
    public IPrototype deepClone() {
        IToolListing clonedTools = (IToolListing) this.tools.deepClone();
        CharacterBasic clone = new CharacterBasic(this.name, this.defaultLife, this.decrementableLife, clonedTools, this.level, this.minPlayerLevelReq, this.hitsPerUnit, this.fields, this.media);
        return clone;
    }

    @Override
    public IBuilder<ICharacter> getBuilder() {
        return new CharacterBasicBuilder();
    }

    @Override
    public IPrototype deepCloneAux() {
        return deepClone();
    }

    public static class CharacterBasicBuilder implements IBuilder<ICharacter>{

        private String name;
        private int fields;
        private float defaultLife, decrementableLife, hitsPerUnit, level, minPlayerLevelReq;
        IToolListing tools = ToolListingFactory.getInstance().getToolListing(ToolListingFactory.TOOL_ARRAY); //esta bien?

        MediaListingFactory mediaListingFactory = new MediaListingFactory();
        IMediaListing media = mediaListingFactory.getMediaListing(MediaListingFactory.IMAGE_ARRAY); //esta bien?

        @Override
        public ICharacter build() {
            ICharacter newCharacter = new CharacterBasic(name, defaultLife, decrementableLife, tools, level, minPlayerLevelReq, hitsPerUnit, fields, media);
            return newCharacter;
        }

        public CharacterBasicBuilder addTool(ITool tool) {
            this.tools.addTool(tool);
            return this;
        }

        public CharacterBasicBuilder addImage(String name, File file) {
            this.media.loadMedia(name, file);
            return this;
        }

        public CharacterBasicBuilder setName(String name){
            this.name = name;
            return this;
        }

        public CharacterBasicBuilder setFields(int fields){
            this.fields = fields;
            return this;
        }

        public CharacterBasicBuilder setDefaultLife(float defaultLife){
            this.defaultLife = defaultLife;
            return this;
        }

        public CharacterBasicBuilder setHitsPerUnit(float hitsPerUnit){
            this.hitsPerUnit = hitsPerUnit;
            return this;
        }

        public CharacterBasicBuilder setDecrementableLife(float decrementableLife){
            this.decrementableLife = decrementableLife;
            return this;
        }

        public CharacterBasicBuilder setLevel(float level){
            this.level = level;
            return this;
        }

        public CharacterBasicBuilder setMinPlayerLevelReq(float minPlayerLevelReq){
            this.minPlayerLevelReq = minPlayerLevelReq;
            return this;
        }


    }
}
