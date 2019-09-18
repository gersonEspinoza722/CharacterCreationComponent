package BoardElement.Character;

public interface ICharacter {
    void decLife(int amount);
    void incLife(int amount);
    void setDefaultLife(int amount);//sets the life range, not decrementable

}
