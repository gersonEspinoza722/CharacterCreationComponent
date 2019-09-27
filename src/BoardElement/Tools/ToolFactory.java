package BoardElement.Tools;

import BoardElement.Character.IFactoryCreationComponent;
import BoardElement.Tools.Concrete.Skill;
import BoardElement.Tools.Concrete.Weapon;
import Patterns.IBuilder;
import Patterns.IPrototype;

import java.util.ArrayList;
import java.util.HashMap;

public class ToolFactory implements IFactoryCreationComponent {
    HashMap<Integer, ITool> tools = new HashMap<>();

    public static final int WEAPON = 0;
    public static final int SKILL = 1;

    public IBuilder<ITool> getCharacterBuilder(int type){
        switch (type){
            case WEAPON:
                return new Weapon.WeaponBuilder();
            case SKILL:
                return new Skill.SkillBuilder();
        }
        return null;
    }

    public IPrototype getClonedTool(int id){
        return tools.get(id).deepCloneAux();
    }

    public ArrayList<IPrototype> getTools (){
        ArrayList<IPrototype> prototypes = new ArrayList<>();
        for(int i = 0; i<tools.size(); i++){
            prototypes.add((IPrototype) tools.get(i));
        }
        return prototypes;
    }

        public void addPrototype(ITool newTool){
        int id = tools.size();
        tools.put(id, newTool);
    }
}
