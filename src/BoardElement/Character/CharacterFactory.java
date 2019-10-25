package BoardElement.Character;

import BoardElement.Character.Concrete.CharacterBasic;
import BoardElement.Character.Concrete.CharacterBasic.CharacterBasicBuilder;
import Patterns.IBuilder;
import Patterns.IPrototype;

import java.util.ArrayList;
import java.util.HashMap;
import storage.CharacterClassFactory;

public class CharacterFactory implements IFactoryCreationComponent {

    private static CharacterFactory singleton = null;

    private HashMap<Integer, ICharacter> characters = new HashMap<>();

    private CharacterFactory() {
        //ArrayList<ICharacter> characters2 = CharacterClassFactory.getInstace().getCharacters();
        //for (ICharacter character : characters2) {
        //    characters.put(characters.size(), character);
        //}
    }

    public static CharacterFactory getInstance() {
        if (singleton == null) {
            singleton = new CharacterFactory();
        }
        return singleton;
    }

    /**
     * Adds a new Character to the prototype lists, id is set
     *
     * @param newCharacter
     */
    public void addPrototype(ICharacter newCharacter) {
        int id = characters.size();
        characters.put(id, newCharacter);
    }

    /**
     *
     * @return: Returns the list of prototypes present in the factory
     */
    public ArrayList<IPrototype> getCharacters() {
        ArrayList<IPrototype> prototypes = new ArrayList<>();
        for (int i = 0; i < characters.size(); i++) {
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
    public ArrayList<IPrototype> getClonedCharacters(int id, int quantity) {
        ArrayList<IPrototype> prototypes = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            prototypes.add(characters.get(id).deepCloneAux());
        }
        return prototypes;
    }

    /**
     *
     * @param id: identification of the prototype Character
     * @return: Returns a Builder to modify an existing prototype
     */
    public IBuilder<ICharacter> modifyFromBuilder(int id) {
        return characters.get(id).getBuilder();
    }

}
