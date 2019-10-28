package BoardElement.Tools.Concrete;

import BoardElement.IBoardElement;
import BoardElement.Tools.Tool;
import BoardElement.Tools.ITool;
import Media.IMediaElement;
import Media.IMediaListing;
import Media.MediaListingFactory;
import Patterns.IBuilder;
import Patterns.IPrototype;

public class Skill extends Tool {

    private boolean regenerative; //true if its use increments life

    public Skill(float simpleUseDecrement, String name, int defaultLife, int decrementableLife, int reach, float level,float minCharacterLevelReq, float minPlayerLevelReq,IMediaListing media,int type) {
        super(simpleUseDecrement,name, defaultLife, decrementableLife, reach, level, minCharacterLevelReq, minPlayerLevelReq,media,type);
    }

    public boolean isRegenerative() {
        return regenerative;
    }

    public void setRegenerative(boolean regenerative) {
        this.regenerative = regenerative;
    }

    public IMediaListing getMedia() {
        return this.media;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setMedia(IMediaListing media) {
        this.media = media;
    }

    @Override
    public void setDefaultLife(int amount) {
        defaultLife = amount;
    }

    @Override
    public void decLife(int amount) {
        if (decrementableLife - amount <= 0) {
            decrementableLife = 0;
        } else {
            decrementableLife -= amount;
        }
    }

    @Override
    public void incLife(int amount) {
        if (decrementableLife + amount >= defaultLife) {
            decrementableLife = defaultLife;
        } else {
            decrementableLife += amount;
        }
    }

    @Override
    public void func(IBoardElement object) {//input can be character or tool to be affected by the tool

    }

    @Override
    public void incLevel() {
        this.level++;
    }

    @Override
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {

        Skill clonedSkill = new Skill(this.simpleUseDecrement, this.name, this.defaultLife, this.decrementableLife, this.reach, this.level, this.minCharacterLevelReq, this.minPlayerLevelReq, this.media,type);
        return clonedSkill;
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
        String toString = "";
        toString = "Name" + this.name + "\n"
                + "Type " + this.type + "\n" 
                + "SimpleUseDecrement" + this.simpleUseDecrement + "\n"
                + "DefaultLife" + this.defaultLife + "\n"
                + "DecrementableLife" + this.decrementableLife + "\n"
                + "Reach" + this.reach + "\n"
                + "Level" + this.level + "\n"
                + "MinCharacterLevelReq" + this.minCharacterLevelReq + "\n"
                + "MinPlayerLevelReq" + this.minPlayerLevelReq;
        return toString;
    }

    @Override
    public void decLevel() {
        this.level--;
    }

    @Override
    public IBuilder<ITool> getBuilder() {
        return new SkillBuilder();
    }

    public static class SkillBuilder implements IBuilder<ITool> {

        private int type, defaultLife, decrementableLife, reach;
        private float simpleUseDecrement, level, minPlayerLevelReq, minCharacterLevelReq;
        private String name;
        private IMediaListing media;

        public SkillBuilder() {
            MediaListingFactory mediaListingFactory = new MediaListingFactory();
            media = mediaListingFactory.getMediaListing(MediaListingFactory.IMAGE_ARRAY);
        }

        @Override
        public ITool build() {
            ITool newTool = new Skill(simpleUseDecrement, name, defaultLife, decrementableLife,reach, level, 
        		minCharacterLevelReq, minPlayerLevelReq,media,type);
            return newTool;
        }

        public SkillBuilder setType(int type) {
            this.type = type;
            return this;
        }

        public SkillBuilder setDefaultLife(int defaultLife) {
            this.defaultLife = defaultLife;
            return this;
        }

        public SkillBuilder setDecrementableLife(int decrementableLife) {
            this.decrementableLife = decrementableLife;
            return this;
        }

        public SkillBuilder setReach(int reach) {
            this.reach = reach;
            return this;
        }

        public SkillBuilder setSimpleUseDecrement(float simpleUseDecrement) {
            this.simpleUseDecrement = simpleUseDecrement;
            return this;
        }

        public SkillBuilder setLevel(float level) {
            this.level = level;
            return this;
        }

        public SkillBuilder setMinPlayerLevelReq(float minPlayerLevelReq) {
            this.minPlayerLevelReq = minPlayerLevelReq;
            return this;
        }

        public SkillBuilder setMinCharacterLevelReq(float minCharacterLevelReq) {
            this.minCharacterLevelReq = minCharacterLevelReq;
            return this;
        }

        public SkillBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public SkillBuilder addMedia(IMediaElement media) {
            this.media.loadMedia(media);
            return this;
        }
    }
}
