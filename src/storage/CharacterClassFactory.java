/**package storage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

import BoardElement.Character.AbstractCharacter;
import BoardElement.Character.ICharacter;
import BoardElement.Character.Concrete.CharacterBasic;
import BoardElement.Tools.ITool;
import BoardElement.Tools.IToolListing;
import BoardElement.Tools.ToolArray;
import BoardElement.Tools.Concrete.Skill;
import BoardElement.Tools.Concrete.Weapon;
import Media.IMediaListing;
import Media.Concrete.Image;
import Media.Concrete.ImageArray;

public class CharacterClassFactory {

	private ArrayList<ICharacter> myCharacters;
	private ObjectMapper mapper;
	private static CharacterClassFactory characterClassFactory = null;
	
	private CharacterClassFactory() {
		myCharacters = new ArrayList<ICharacter>();
		mapper = new ObjectMapper();
	}
	public static CharacterClassFactory getInstace() {
		if(characterClassFactory == null) {
			characterClassFactory = new CharacterClassFactory(); 
		}
		return characterClassFactory;
	}
	public ArrayList<ICharacter> getCharacters(){
		loadBasicCharacters();
		return myCharacters;
	}
	private void loadBasicCharacters() {
		int charactersCount = getCharactersCount();
		CharacterDummy value = null;
		for(int i = 0;i<charactersCount;i++) {
			try {
				//if(tipo==1){
					value = mapper.readValue(new File("src/storage/jsons/result"+i+".json"), CharacterDummy.class);
					myCharacters.add(getRealCharacterBasicClass(value));
				//}
					
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }	
		}
	}
	
	private int getCharactersCount() {
        String fileName = "src/storage/jsons/characters-Jsons.txt";
        String line = null;
        int number = 0;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
            	number = Integer.valueOf(line);
                System.out.println("Number in file: "+line);
            }
            bufferedReader.close();         
        }
        catch(Exception ex) {
            System.out.println("Error in file");                
        }
        return number;
	}
	
	public Image getRealImageClass(ImageDummy dummy) {
		return new Image(dummy.name,new File(dummy.path));
	}
	
	public ITool getRealSkillClass(SkillDummy dummy) {
    	ArrayList<Image> newImages = new ArrayList<Image>(); 
    	for(ImageDummy imgDummy : dummy.images) {
    		newImages.add(getRealImageClass(imgDummy));
    	}
    	ImageArray array = new ImageArray(newImages);
    	return new Skill(dummy.simpleUseDecrement,dummy.name,dummy.defaultLife,dummy.decrementableLife,dummy.reach,dummy.level,dummy.minCharacterLevelReq,dummy.minPlayerLevelReq,dummy.type,dummy.regenerative,dummy.effectAmount,array);
    }
	
	public ITool getRealWeaponClass(WeaponDummy dummy) {
    	ArrayList<Image> newImages = new ArrayList<Image>(); 
    	for(ImageDummy imgDummy : dummy.images) {
    		newImages.add(getRealImageClass(imgDummy));
    	}
    	ImageArray array = new ImageArray(newImages);
    	return new Weapon(dummy.simpleUseDecrement,dummy.name,dummy.defaultLife,dummy.decrementableLife,dummy.reach,dummy.level,dummy.minCharacterLevelReq,dummy.minPlayerLevelReq,dummy.type,array);
    }
	
    public ICharacter getRealCharacterBasicClass(CharacterDummy dummy) {
    	ArrayList<ITool> tools = new ArrayList<ITool>();
    	IToolListing toolArray = new ToolArray(tools,"Lista de Herramientas");
    	ArrayList<Image> newImages = new ArrayList<Image>();
    	IMediaListing media = new ImageArray(newImages);
    	
    	for(WeaponDummy weaponDummy : dummy.weapons) {
    		tools.add(getRealWeaponClass(weaponDummy));
    	}
    	for(SkillDummy skillDummy : dummy.skills) {
    		tools.add(getRealSkillClass(skillDummy));
    	}
    	for(ImageDummy imageDummy: dummy.images) {
    		newImages.add(getRealImageClass(imageDummy));
    	}
    	return new CharacterBasic(dummy.name,dummy.defaultLife,dummy.decrementableLife,toolArray,dummy.level,dummy.minPlayerLevelReq,dummy.hitsPerUnit,dummy.fields,media);
    }
    
	
}
**/