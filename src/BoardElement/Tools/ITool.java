package BoardElement.Tools;

import BoardElement.IBoardElement;

public interface ITool {
    void setDefaultLife(int amount);
    void decLife(int amount);
    void incLife(int amount);
    void func(IBoardElement object);
    void incLevel();
}
