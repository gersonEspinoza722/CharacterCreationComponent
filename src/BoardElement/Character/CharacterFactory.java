package BoardElement.Character;

import BoardElement.Character.Concrete.CharacterBasic;
import Patterns.IBuilder;
import Patterns.IPrototype;

import java.util.ArrayList;
import java.util.HashMap;

public class CharacterFactory {

    CharacterFactory singleton = null;

    private HashMap<Integer, ICharacter> characters = new HashMap<>();

    public CharacterFactory() {
    }

    public CharacterFactory getInstance(){
        if(singleton == null){
            singleton = new CharacterFactory();
        }
        return singleton;
    }

    public IBuilder<ICharacter> addCharacter(int type){
        if(characters.containsKey(type)){
            return null; //excepcion
        }
        else{
            ICharacter newCharacter = new CharacterBasic();
            return newCharacter.getBuilder();
        }
    }
    public ArrayList<IPrototype> getCharacters (){
        ArrayList<IPrototype> prototypes = new ArrayList<>();
        for(int i = 0; i<characters.size(); i++){
            prototypes.add((IPrototype) characters.get(i));
        }
        return prototypes;
    }

    public ArrayList<IPrototype> getClonedCharacters(int type, int quantity){
        ArrayList<IPrototype> prototypes = new ArrayList<>();
        for (int i = 0; i<quantity; i++){
            prototypes.add(characters.get(type).deepCloneAux());
        }
        return prototypes;
    }

    public IBuilder<ICharacter> getCharacter(int type){
        return characters.get(type).getBuilder();
    }

}

