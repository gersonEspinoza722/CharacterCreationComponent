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

    /**
     *
     * @return: Returns a Builder to build a new character from scratch
     */
    public IBuilder<ICharacter> getCharacterBuilder(){
        ICharacter newCharacter = new CharacterBasic();
        return newCharacter.getBuilder();
    }

    /**
     * Adds a new Character to the prototype lists, id is set
     * @param newCharacter
     */
    public void addPrototype(ICharacter newCharacter){
        int id = characters.size();
        characters.put(id, newCharacter);
    }

    /**
     *
     * @return: Returns the list of prototypes present in the factory
     */
    public ArrayList<IPrototype> getCharacters (){
        ArrayList<IPrototype> prototypes = new ArrayList<>();
        for(int i = 0; i<characters.size(); i++){
            prototypes.add((IPrototype) characters.get(i));
        }
        return prototypes;
    }

    /**
     *
     * @param id: identification of prototype Character
     * @param quantity: quantity of clones to return
     * @return: Returns a list of cloned Characters
     */
    public ArrayList<IPrototype> getClonedCharacters(int id, int quantity){
        ArrayList<IPrototype> prototypes = new ArrayList<>();
        for (int i = 0; i<quantity; i++){
            prototypes.add(characters.get(id).deepCloneAux());
        }
        return prototypes;
    }

    /**
     *
     * @param id: identification of the prototype Character
     * @return: Returns a Builder to modify an existing prototype
     */
    public IBuilder<ICharacter> modifyFromBuilder(int id){
        return characters.get(id).getBuilder();
    }

}

