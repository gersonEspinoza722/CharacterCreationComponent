/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoardElement.Character;

/**
 *
 * @author Marvin Armando
 */
import BoardElement.Tools.IToolListing;

public abstract class AbstractCharacter{
    public AbstractCharacter(float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq) {


        this.defaultLife = defaultLife;
        this.decrementableLife = decrementableLife;
        this.tools = tools;
        this.level = level;
        this.minPlayerLevelReq = minPlayerLevelReq;
    }

    protected float defaultLife;
    protected float decrementableLife;
    protected IToolListing tools;
    protected float level;
    protected float minPlayerLevelReq;

}
