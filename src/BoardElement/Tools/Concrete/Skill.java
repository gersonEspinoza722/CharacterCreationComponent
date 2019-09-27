package BoardElement.Tools.Concrete;

import BoardElement.IBoardElement;
import BoardElement.Tools.AbstractTool;
import BoardElement.Tools.ITool;
import Media.Concrete.ImageArray;
import Media.IMediaListing;
import Patterns.IPrototype;

public class Skill extends AbstractTool implements ITool, IBoardElement, IPrototype<Skill> {

    private boolean regenerative; //true if its use increments life
    private float effectAmount;
    private int type; //Example. 0: affects character, 1: affects weapon,...
    private IMediaListing media;


    public Skill() {
    }

    public Skill(float simpleUseDecrement, String name, int defaultLife, int decrementableLife, int reach, float level, 
    		float minCharacterLevelReq, float minPlayerLevelReq, int type,boolean regenerative,float effectAmount,IMediaListing media) {
        super(simpleUseDecrement, name, defaultLife, decrementableLife, reach, level, minCharacterLevelReq, minPlayerLevelReq);
        this.type = type;
        this.media = media;
        this.regenerative = regenerative;
        this.effectAmount = effectAmount;
    }



    public boolean isRegenerative() {
		return regenerative;
	}

	public void setRegenerative(boolean regenerative) {
		this.regenerative = regenerative;
	}

	public float getEffectAmount() {
		return effectAmount;
	}

	public void setEffectAmount(float effectAmount) {
		this.effectAmount = effectAmount;
	}

	public IMediaListing getMedia() {
		return media;
	}

	public void setType(int type) {
		this.type = type;
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
    public void func(IBoardElement object) {//input can be character or tool to be affected by the tool

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
        Skill clonedSkill = new Skill(this.simpleUseDecrement, this.name, this.defaultLife, this.decrementableLife, this.reach, 
        		this.level, this.minCharacterLevelReq, this.minPlayerLevelReq, this.type,this.regenerative,this.effectAmount,this.media);
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
}
