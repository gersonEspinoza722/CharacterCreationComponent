package BoardElement.Character;

import BoardElement.Character.Concrete.CharacterBasic;
import Patterns.IBuilder;

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
    public ArrayList<IBuilder<ICharacter>> getCharacters (){
        ArrayList<IBuilder<ICharacter>> prototypes = new ArrayList<>();
        for(int i = 0; i<characters.size(); i++){
            prototypes.add(characters.get(i).getBuilder());
        }
        return prototypes;
    }

    public IBuilder<ICharacter> getCharacter(int type){
        return characters.get(type).getBuilder();
    }

}

