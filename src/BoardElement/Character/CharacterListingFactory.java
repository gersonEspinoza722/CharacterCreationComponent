/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoardElement.Character;

import BoardElement.Character.Concrete.CharacterArray;

/**
 *
 * @author Marvin Armando
 */
public class CharacterListingFactory {
    private static CharacterListingFactory singleton = null;

    public static final int CHARACTER_ARRAY = 0;

    public CharacterListingFactory() {
    }
    
    public static CharacterListingFactory getInstance(){
        if(singleton == null){
            singleton = new CharacterListingFactory();
        }
        return singleton;
    }
    
    public ICharacterListing getCharacterListing(int type){
        switch (type){
            case CHARACTER_ARRAY:
                return new CharacterArray();
        }
        return null;
    }
}
