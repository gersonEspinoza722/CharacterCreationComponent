package BoardElement.Character.Concrete;

import BoardElement.Character.AbstractCharacter;
import BoardElement.Character.ICharacter;
import BoardElement.Tools.IToolListing;
import Media.Concrete.ImageArray;
import Media.IMediaListing;

public class Warrior extends AbstractCharacter implements ICharacter {
    private int stamina;
    private int speed;
    private IMediaListing images;

    public Warrior(int stamina, int speed, float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq) {
        super(defaultLife,decrementableLife,tools,level,minPlayerLevelReq);
        this.speed=speed;
        this.stamina=stamina;
        images = new ImageArray();
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

    public IMediaListing getImages() {
        return images;
    }

    public void setImages(ImageArray images) {
        this.images = images;
    }





    @Override
    public void decLife(int amount) {

    }

    @Override
    public void incLife(int amount) {

    }

    @Override
    public void setDefaultLife(int amount) {

    }
}
