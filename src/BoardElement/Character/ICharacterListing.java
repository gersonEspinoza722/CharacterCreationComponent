/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoardElement.Character;



import Patterns.IPrototype;
import java.util.ArrayList;

/**
 *
 * @author Marvin Armando
 */
public interface ICharacterListing {
    void deleteCharacter(int index);
    void addCharacter(ICharacter object);
    ICharacter getCharacter(int index);
    ArrayList<ICharacter> getCharacterList();
    int getSize();
    IPrototype clone();
    IPrototype deepClone();
}
