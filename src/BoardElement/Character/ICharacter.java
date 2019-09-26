package BoardElement.Character;

import Patterns.IBuilder;

import BoardElement.Tools.IToolListing;
import Media.IMediaListing;

public interface ICharacter {
    void decLife(int amount);
    void incLife(int amount);
    void setDefaultLife(int amount);//sets the life range, not decrementable
    IBuilder<ICharacter> getBuilder();
    void incLvl(int amount);
    void decLvl(int amount);
    IMediaListing getMedia();
    IToolListing getTools();
    String getToString();
}
