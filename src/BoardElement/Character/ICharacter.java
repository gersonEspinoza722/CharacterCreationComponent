package BoardElement.Character;

import Patterns.IBuilder;

import BoardElement.Tools.IToolListing;
import Media.IMediaListing;
import Patterns.IPrototype;

public interface ICharacter extends IPrototype<ICharacter> {
    void decLife(int amount);
    void incLife(int amount);
    void setDefaultLife(int amount);//sets the life range, not decrementable
    void incLvl(int amount);
    void decLvl(int amount);
    IMediaListing getMedia();
    IToolListing getTools();
    String getToString();
    IBuilder<ICharacter> getBuilder();
}
