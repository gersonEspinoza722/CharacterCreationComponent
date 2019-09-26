
package BoardElement.Character;

import BoardElement.Tools.IToolListing;
import Media.IMediaListing;

public abstract class AbstractCharacter{
	

    protected float defaultLife;
    protected float decrementableLife;
    protected IToolListing tools;
    protected float level;
    protected float minPlayerLevelReq;
    protected float hitsPerUnit;
    protected int fields;
    protected IMediaListing images;

    public AbstractCharacter(float defaultLife, 
    		float decrementableLife, 
    		IToolListing tools, float level, 
    		float minPlayerLevelReq, float hitsPerUnit, 
    		int fields,
    		IMediaListing images
    		) {
        this.defaultLife = defaultLife;
        this.decrementableLife = decrementableLife;
        this.tools = tools;
        this.level = level;
        this.minPlayerLevelReq = minPlayerLevelReq;
        this.hitsPerUnit = hitsPerUnit;
        this.fields = fields;
        this.images = images;
    }

}