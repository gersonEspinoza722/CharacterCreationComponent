
package BoardElement.Character;

import BoardElement.Character.Concrete.CharacterBasic;
import BoardElement.IBoardElement;
import BoardElement.Tools.ITool;
import BoardElement.Tools.IToolListing;
import BoardElement.Tools.ToolListingFactory;
import Media.IMediaListing;
import Media.MediaListingFactory;
import Patterns.IBuilder;
import Patterns.IPrototype;

import java.io.File;

public abstract class AbstractCharacter{

    protected String name;
    protected float defaultLife;
    protected float decrementableLife;
    protected IToolListing tools;
    protected float level;
    protected float minPlayerLevelReq;
    protected float hitsPerUnit;
    protected int fields;
    protected IMediaListing media;

    public AbstractCharacter() {
    }

    public AbstractCharacter(String name, float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq, float hitsPerUnit, int fields) {
        this.name = name;
        this.defaultLife = defaultLife;
        this.decrementableLife = decrementableLife;
        this.tools = tools;
        this.level = level;
        this.minPlayerLevelReq = minPlayerLevelReq;
        this.hitsPerUnit = hitsPerUnit;
        this.fields = fields;
    }

    public AbstractCharacter(String name, float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq, float hitsPerUnit, int fields, IMediaListing media) {
        this.name = name;
        this.defaultLife = defaultLife;
        this.decrementableLife = decrementableLife;
        this.tools = tools;
        this.level = level;
        this.minPlayerLevelReq = minPlayerLevelReq;
        this.hitsPerUnit = hitsPerUnit;
        this.fields = fields;
        this.media = media;
    }

    /*
    public static class CharacterBuilder implements IBuilder<ICharacter> {

        private String name;
        private int fields;
        private float defaultLife, decrementableLife, hitsPerUnit, level, minPlayerLevelReq;
        IToolListing tools = ToolListingFactory.getInstance().getToolListing(ToolListingFactory.TOOL_ARRAY, "Character List"); //esta bien?

        MediaListingFactory mediaListingFactory = new MediaListingFactory();
        IMediaListing media = mediaListingFactory.getMediaListing(MediaListingFactory.IMAGE_ARRAY); //esta bien?

        @Override
        public ICharacter build() {
            ICharacter newCharacter = new CharacterBasic(name, defaultLife, decrementableLife, tools, level, minPlayerLevelReq, hitsPerUnit, fields, media);
            return newCharacter;
        }

        public CharacterBuilder addTool(ITool tool) {
            this.tools.addTool(tool);
            return this;
        }

        public CharacterBuilder addImage(String name, File file) {
            this.media.loadMedia(name, file);
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
    }*/
}