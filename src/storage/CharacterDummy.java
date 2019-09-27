package storage;

import java.util.ArrayList;

import BoardElement.Character.Concrete.CharacterBasic;
import BoardElement.Tools.ITool;
import BoardElement.Tools.IToolListing;
import BoardElement.Tools.ToolArray;
import Media.IMediaListing;
import Media.Concrete.Image;
import Media.Concrete.ImageArray;



public class CharacterDummy {
	public String name;
	public float defaultLife;
	public float decrementableLife;
	public ArrayList<WeaponDummy> weapons;
	public ArrayList<SkillDummy> skills;
	public float level;
	public float minPlayerLevelReq;
	public float hitsPerUnit;
	public int fields;
	public ArrayList<ImageDummy> images;
    
    public CharacterDummy(){
    	
    }
}
