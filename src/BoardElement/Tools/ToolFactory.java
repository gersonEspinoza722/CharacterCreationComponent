package BoardElement.Tools;

import BoardElement.Character.IFactoryCreationComponent;
import BoardElement.Tools.Concrete.Skill;
import BoardElement.Tools.Concrete.Weapon;

public class ToolFactory implements IFactoryCreationComponent {

    public static final int WEAPON = 0;
    public static final int SKILL = 1;

    public ITool getTool(int toolType){
        switch (toolType){
            case WEAPON:
                return new Weapon();
            case SKILL:
                return new Skill();
        }
        return null;
    }
}
