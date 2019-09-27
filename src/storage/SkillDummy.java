package storage;

import java.util.ArrayList;

import BoardElement.Tools.Concrete.Skill;
import Media.Concrete.Image;
import Media.Concrete.ImageArray;



public class SkillDummy {
	public String name;
	public int defaultLife;
	public int decrementableLife;
	public int reach; //can be used as radial or linear effect
	public float level;
	public float minCharacterLevelReq;
	public float minPlayerLevelReq;
	public float simpleUseDecrement;
	public boolean regenerative; //true if its use increments life
	public float effectAmount;
	public int type; //Example. 0: affects character, 1: affects weapon,...
	public ArrayList<ImageDummy> images;
    
    public SkillDummy() {
    	
    }
}
