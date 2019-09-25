package BoardElement.Character;

import BoardElement.Tools.IToolListing;
import Media.IMediaListing;

public interface ICharacter {
    void decLife(int amount);
    void incLife(int amount);
    void setDefaultLife(int amount);//sets the life range, not decrementable
    String toString();
    IMediaListing getMedia();
    IToolListing getTools();
    String getToString();
}
