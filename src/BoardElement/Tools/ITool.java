package BoardElement.Tools;

import BoardElement.IBoardElement;
import Media.IMediaListing;

public interface ITool {
    void setDefaultLife(int amount);
    void decLife(int amount);
    void incLife(int amount);
    void func(IBoardElement object);
    void incLevel();
    void decLevel();
    IMediaListing getMediaListing();
    int getType();
    String getToString();
}
