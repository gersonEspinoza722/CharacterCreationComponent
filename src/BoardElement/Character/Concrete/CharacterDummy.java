package BoardElement.Character.Concrete;

import BoardElement.Character.AbstractCharacter;
import BoardElement.Character.ICharacter;
import BoardElement.Tools.ITool;
import BoardElement.Tools.IToolListing;
import Media.IMediaListing;
import Patterns.IPrototype;

public class CharacterDummy extends AbstractCharacter implements ICharacter, IPrototype<CharacterDummy>{

    public CharacterDummy(float defaultLife, 
    		float decrementableLife, 
    		IToolListing tools, 
    		float level, 
    		float minPlayerLevelReq, 
    		float hitsPerUnit, 
    		int fields,
    		IMediaListing images) {
        super(defaultLife, decrementableLife, tools, level, minPlayerLevelReq, hitsPerUnit, fields,images);
    }
    public CharacterDummy() {
    	super(100f,100f,null,10f,10f,10f,2,null);
    }

    @Override
    public void decLife(int amount) {

    }

    @Override
    public void incLife(int amount) {

    }

    @Override
    public void setDefaultLife(int amount) {

    }

    @Override
    public IPrototype clone() {
        CharacterDummy clone = new CharacterDummy(this.defaultLife, this.decrementableLife, this.tools, this.level, this.minPlayerLevelReq, this.hitsPerUnit, this.fields,this.images);
        return clone;
    }

    @Override
    public IPrototype deepClone() {
        IToolListing clonedTools = (IToolListing) this.tools.deepClone();
        CharacterDummy clone = new CharacterDummy(this.defaultLife, this.decrementableLife, clonedTools, this.level, this.minPlayerLevelReq, this.hitsPerUnit, this.fields,this.images);
        return clone;
    }
}
