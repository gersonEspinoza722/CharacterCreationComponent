package BoardElement.Character.Concrete;

import BoardElement.Character.AbstractCharacter;
import BoardElement.Character.ICharacter;
import BoardElement.IBoardElement;
import BoardElement.Tools.ITool;
import BoardElement.Tools.IToolListing;
import Media.Concrete.Image;
import Patterns.IBuilder;
import Patterns.IPrototype;
import Media.Concrete.ImageArray;
import Media.IMediaListing;

import java.io.File;
import java.util.ArrayList;

public class Warrior extends AbstractCharacter implements ICharacter, IPrototype<Warrior>, IBoardElement {

    private int stamina;
    private int speed;
    private String name;

    public Warrior(String name, float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq, float hitsPerUnit, int fields, int stamina, int speed) {
        super(defaultLife, decrementableLife, tools, level, minPlayerLevelReq, hitsPerUnit, fields);
        this.speed=speed;
        this.stamina=stamina;
        this.name = name;
        super.media = new ImageArray();
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

    public IMediaListing getMedia() {
        return super.media;
    }

    public void setMedia(ImageArray images) {
        super.media = images;
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
    public IPrototype clone() {
        Warrior clone = new Warrior(this.name, this.defaultLife, this.decrementableLife, this.tools, this.level, this.minPlayerLevelReq, this.hitsPerUnit, this.fields, this.stamina, this.speed);
        return clone;
    }

    @Override
    public IPrototype deepClone() {
        IToolListing clonedTools = (IToolListing) this.tools.deepClone();
        Warrior clone = new Warrior(this.name, this.defaultLife, this.decrementableLife, clonedTools, this.level, this.minPlayerLevelReq, this.hitsPerUnit, this.fields, this.stamina, this.speed);
        return clone;
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
                "Stamina" + this.stamina + "\n" +
                "Speed" + this.speed + "\n" +
                "DecrementableLife" + this.decrementableLife + "\n" + 
                "Level" + this.level + "\n" +
                "MinPlayerLevelReq" + this.minPlayerLevelReq;
        return toString;
    }
    

    public static class WarriorBuilder implements IBuilder<AbstractCharacter> {
        private int stamina, speed, fields;
        private String name;
        private float defaultLife, decrementableLife, hitsPerUnit, level, minPlayerLevelReq;
        IToolListing tools;
        IMediaListing media;

        @Override
        public AbstractCharacter build() {
            AbstractCharacter newWarrior = new Warrior(this.name, this.defaultLife, this.decrementableLife, this.tools, this.level, this.minPlayerLevelReq, this.hitsPerUnit, this.fields, this.stamina, this.speed);
            return newWarrior;
        }

        public WarriorBuilder addTool(ITool tool){
            this.tools.addTool(tool);
            return this;
        }

        public WarriorBuilder addImage(String name, File file){
            this.media.loadMedia(name, file);
            return this;
        }
    }
}
