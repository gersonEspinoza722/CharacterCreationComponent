package BoardElement.Tools;

import BoardElement.IBoardElement;
import Media.IMediaListing;
import Patterns.IBuilder;
import Patterns.IPrototype;

public interface ITool extends IPrototype<ITool>{
    void setDefaultLife(int amount);
    void decLife(int amount);
    void incLife(int amount);
    void func(IBoardElement object);
    void incLevel();
    void decLevel();
    IMediaListing getMediaListing();
    int getType();
    String getToString();
    IBuilder <ITool> getBuilder();
}
