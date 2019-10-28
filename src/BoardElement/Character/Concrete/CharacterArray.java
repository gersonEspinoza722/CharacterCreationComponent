/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoardElement.Character.Concrete;

import BoardElement.Character.ICharacter;
import BoardElement.Character.ICharacterListing;
import Patterns.IPrototype;
import java.util.ArrayList;

/**
 *
 * @author Marvin Armando
 */
public class CharacterArray implements ICharacterListing{
    private ArrayList<ICharacter> list;

    public CharacterArray() {
        this.list = new ArrayList<>();
    }
    
    public CharacterArray(ArrayList<ICharacter> list) {
        this.list = new ArrayList<>();
    }
    
    @Override
    public void deleteCharacter(int index) {
        this.list.remove(index);
    }

    @Override
    public void addCharacter(ICharacter object) {
        this.list.add(object);
    }

    @Override
    public ICharacter getCharacter(int index) {
        return list.get(index);
    }

    @Override
    public ArrayList<ICharacter> getCharacterList() {
       return this.list;
    }

    @Override
    public int getSize() {
       return this.list.size();
    }

    @Override
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {
        ArrayList<ICharacter> clonedCharacters = new ArrayList<>();
        for (int i = 0; i<list.size(); i++){
            clonedCharacters.add(list.get(i));
        }
        CharacterArray clonedToolArray = new CharacterArray(clonedCharacters);
        return clonedToolArray;
    }
}
