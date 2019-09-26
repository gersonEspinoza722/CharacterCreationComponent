package BoardElement.Character.Concrete;

import BoardElement.Character.AbstractCharacter;
import BoardElement.Character.ICharacter;
import BoardElement.IBoardElement;
import BoardElement.Tools.ITool;
import BoardElement.Tools.IToolListing;
import BoardElement.Tools.ToolListingFactory;
import Media.Concrete.ImageArray;
import Media.IMediaListing;
import Media.MediaListingFactory;
import Patterns.IBuilder;
import Patterns.IPrototype;

import java.io.File;

public class CharacterMain extends AbstractCharacter implements ICharacter, IPrototype<CharacterMain>, IBoardElement {

    private static CharacterMainBuilder builder = new CharacterMainBuilder();

    public CharacterMain() {
        ToolListingFactory toolListingFactory = ToolListingFactory.getInstance();
        this.tools = toolListingFactory.getToolListing(ToolListingFactory.TOOL_ARRAY, "Character Main List");

        MediaListingFactory mediaListingFactory = new MediaListingFactory();
        super.media = mediaListingFactory.getMediaListing(MediaListingFactory.IMAGE_ARRAY);

    }

    public CharacterMain(String name, float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq, float hitsPerUnit, int fields) {
        super(name, defaultLife, decrementableLife, tools, level, minPlayerLevelReq, hitsPerUnit, fields);
    }

    public CharacterMain(String name, float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq, float hitsPerUnit, int fields, IMediaListing media) {
        super(name, defaultLife, decrementableLife, tools, level, minPlayerLevelReq, hitsPerUnit, fields, media);
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

    @Override
    public IBuilder<ICharacter> getBuilder() {
        return builder;
    }

    @Override
    public IPrototype clone() {
        CharacterMain clone = new CharacterMain(this.name, this.defaultLife, this.decrementableLife, this.tools, this.level, this.minPlayerLevelReq, this.hitsPerUnit, this.fields);
        return clone;
    }

    @Override
    public IPrototype deepClone() {
        IToolListing clonedTools = (IToolListing) this.tools.deepClone();
        CharacterMain clone = new CharacterMain(this.name, this.defaultLife, this.decrementableLife, clonedTools, this.level, this.minPlayerLevelReq, this.hitsPerUnit, this.fields, this.media);
        return clone;
    }



    public static class CharacterMainBuilder implements IBuilder<ICharacter>{
        private String name;
        private int fields;
        private float defaultLife, decrementableLife, hitsPerUnit, level, minPlayerLevelReq;
        IToolListing tools = ToolListingFactory.getInstance().getToolListing(0, "Character Main List");
        IMediaListing media;

        @Override
        public ICharacter build() {
            ICharacter newCharacter = new CharacterMain(name, defaultLife, decrementableLife, tools, level, minPlayerLevelReq, hitsPerUnit, fields, media);
            return newCharacter;
        }

        public CharacterMainBuilder addTool(ITool tool) {
            this.tools.addTool(tool);
            return this;
        }

        public CharacterMainBuilder addImage(String name, File file) {
            this.media.loadMedia(name, file);
            return this;
        }
    }
}
